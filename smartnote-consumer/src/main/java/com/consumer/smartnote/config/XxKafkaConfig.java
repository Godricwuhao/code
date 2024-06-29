package com.consumer.smartnote.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 西咸kafka配置（埋点数据推送到西咸）
 *
 * @author chenfl
 */
@EnableKafka
@Configuration
public class XxKafkaConfig {

    @Value("${spring.kafka.xxKafka.bootstrap-servers}")
    private String bootstrapServers;
    @Value("${spring.kafka.xxKafka.producer.key-serializer}")
    private String keySerializer;
    @Value("${spring.kafka.xxKafka.producer.value-serializer}")
    private String valueSerializer;
    @Value("${spring.kafka.xxKafka.producer.security-protocol}")
    private String securityProtocol;
    @Value("${spring.kafka.xxKafka.producer.sasl-mechanism}")
    private String saslMechanism;
    @Value("${spring.kafka.xxKafka.producer.sasl-jaas-config}")
    private String saslJaasConfig;

    @Bean({"xxKafkaTemplate"})
    public KafkaTemplate<String, String> xxKafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    private ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    private Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keySerializer);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valueSerializer);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 512000);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 10);
        props.put("security.protocol", securityProtocol);
        props.put("sasl.mechanism", saslMechanism);
        props.put("sasl.jaas.config", saslJaasConfig);
        return props;
    }
}
