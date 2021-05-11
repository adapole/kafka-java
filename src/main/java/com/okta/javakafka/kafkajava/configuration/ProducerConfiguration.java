package com.okta.javakafka.kafkajava.configuration;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;

import java.util.Map;
import java.util.HashMap;


@Configuration
public class ProducerConfiguration {

    private static final String bootstrapServers = "localhost:9092";

    @Bean
    public ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigurations());
    }


    @Bean
    public Map<String, Object> producerConfigurations(){
        Map<String, Object> configurations = new HashMap<String, Object>();


        // create producer properties
        configurations.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
        configurations.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        configurations.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        return  configurations;
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate(){
        return new KafkaTemplate<String, String>(producerFactory());
    }

}

