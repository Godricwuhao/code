package com.unicom.config;

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

import java.util.HashMap;
import java.util.Map;

/**
 * 听云kafka配置（从听云Kafka消费埋点数据）
 *
 * @author chenfl
 */
@EnableKafka
@Configuration
public class TingyunKafkaConfig {

    @Value("${kafka.tingyunKafka.bootstrap-servers}")
    private String bootstrapServers;
    @Value("${kafka.tingyunKafka.group-id}")
    private String groupId;
    @Value("${kafka.tingyunKafka.key-deserializer}")
    private String keyDeserializer;
    @Value("${kafka.tingyunKafka.value-deserializer}")
    private String valueDeserializer;
    @Value("${kafka.tingyunKafka.security-protocol}")
    private String securityProtocol;
    @Value("${kafka.tingyunKafka.sasl-mechanism}")
    private String saslMechanism;
    @Value("${kafka.tingyunKafka.sasl-jaas-config}")
    private String saslJaasConfig;

    @Bean({"tingyunKafkaContainerFactory"})
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
