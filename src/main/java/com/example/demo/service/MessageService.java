package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
	public String getReply(String message) {
		switch(message.toLowerCase()) {
		case "hi":
			return "Hello";
		case "bye":
			return "GoodBye";
		default:
			return "Not understand";
		}
	}
}
