package com.javapalace.Springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic javaPalaceTopic() {
		return TopicBuilder.name("javaPalace").build();
	}
	
	@Bean
	public NewTopic javaPalaceJsonTopic() {
		return TopicBuilder.name("javaPalace_json").build();
	}
}
