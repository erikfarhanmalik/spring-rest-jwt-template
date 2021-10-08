package com.erik.rest.controller;

import com.erik.rest.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestingController {
    private final EmailService emailService;

    @GetMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@Param("to") String to,
                                            @Param("subject") String subject,
                                            @Param("content") String content) throws MessagingException {
        emailService.sendEmail(to, subject, content);
        return ResponseEntity.ok("Email sent successfully!");
    }
}