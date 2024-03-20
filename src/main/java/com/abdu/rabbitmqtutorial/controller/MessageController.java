package com.abdu.rabbitmqtutorial.controller;

import com.abdu.rabbitmqtutorial.dto.User;
import com.abdu.rabbitmqtutorial.pubisher.RabbitMQJsonProducer;
import com.abdu.rabbitmqtutorial.pubisher.RabbitMQProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MessageController {

    private final RabbitMQProducer producer;
    private final RabbitMQJsonProducer jsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> send(
            @RequestParam String message
    ) {
        producer.sendMessage(message);
        return ResponseEntity.ok("SUCCESS");
    }

    @PostMapping("/publish-json")
    public ResponseEntity<String> sendJson(
            @RequestBody User user
    ) {
        jsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("SUCCESS");
    }

}
