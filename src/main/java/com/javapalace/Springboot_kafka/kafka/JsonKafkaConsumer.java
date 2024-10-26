package com.javapalace.Springboot_kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javapalace.Springboot_kafka.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

	@KafkaListener(topics = "javaPalace_json", groupId = "MyGroup")
	public void JsonConsume(User user) {
		LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
	}
}
