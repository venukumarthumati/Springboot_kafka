package com.javapalace.Springboot_kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javapalace.Springboot_kafka.kafka.JsonKafkaProducer;
import com.javapalace.Springboot_kafka.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

	private JsonKafkaProducer kafkaProducer;

	public JsonMessageController(JsonKafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user) {
		kafkaProducer.sendMessage(user);
		return ResponseEntity.ok("Json message sent to the topic");
	}
}
