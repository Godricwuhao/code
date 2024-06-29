package com.consumer.liantongapp.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

/**
 * 听云kafka配置（从听云Kafka消费埋点数据）
 * 
 * @author cfl
 *
 */
@EnableKafka
@Configuration
public class TingyunKafkaConfig {

	@Value("${spring.kafka.tingyunKafka.bootstrap-servers}")
	private String bootstrapServers;
	@Value("${spring.kafka.tingyunKafka.consumer.group-id}")
	private String groupId;
	@Value("${spring.kafka.tingyunKafka.consumer.key-deserializer}")
	private String keyDeserializer;
	@Value("${spring.kafka.tingyunKafka.consumer.value-deserializer}")
	private String valueDeserializer;
	@Value("${spring.kafka.tingyunKafka.consumer.security-protocol}")
	private String securityProtocol;
	@Value("${spring.kafka.tingyunKafka.consumer.sasl-mechanism}")
	private String saslMechanism;
	@Value("${spring.kafka.tingyunKafka.consumer.sasl-jaas-config}")
	private String saslJaasConfig;

	@Bean({ "tingyunKafkaContainerFactory" })
	KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<Integer, String>> tingyunKafkaContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<Integer, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

	public ConsumerFactory<Integer, String> consumerFactory() {
		return new DefaultKafkaConsumerFactory<>(consumerConfigs());
	}

	private Map<String, Object> consumerConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, keyDeserializer);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, valueDeserializer);
		props.put("security.protocol", securityProtocol);
		props.put("sasl.mechanism", saslMechanism);
		props.put("sasl.jaas.config", saslJaasConfig);
		return props;
	}
}
