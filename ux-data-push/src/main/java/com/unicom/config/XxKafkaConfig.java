package com.unicom.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 外部系统kafka配置（西咸tingyun-prod集群）
 *
 * @author Godric
 */
@Slf4j
@EnableKafka
@Configuration
@Component
public class XxKafkaConfig {
    @Value("${kafka.xxKafka.bootstrap-servers}")
    private String bootstrapServers;
    @Value("${kafka.xxKafka.key-serializer}")
    private String keySerializer;
    @Value("${kafka.xxKafka.value-serializer}")
    private String valueSerializer;
    @Value("${kafka.xxKafka.security-protocol}")
    private String securityProtocol;
    @Value("${kafka.xxKafka.sasl-mechanism}")
    private String saslMechanism;
    @Value("${kafka.xxKafka.sasl-jaas-config}")
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
