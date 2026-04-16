package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MessageInput;
import com.example.demo.model.MessageOutput;
import com.example.demo.service.MessageService;

@RestController
public class WebhookController {
	
	@Autowired
	private MessageService message;

	@PostMapping("/webhook")
	public MessageOutput receiveMessage(@RequestBody MessageInput input) {
		String reply = message.getReply(input.getMessage());
		return new MessageOutput(reply);
	}
}
