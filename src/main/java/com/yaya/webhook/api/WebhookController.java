package com.yaya.webhook.api;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaya.webhook.model.TransactionEvent;

@RestController
@RequestMapping("/webhook")
public class WebhookController {
	@Async
	@PostMapping
public ResponseEntity<String>  recive(@RequestBody TransactionEvent event){
	//todo
	return ResponseEntity.ok("Sucess");
}
}
