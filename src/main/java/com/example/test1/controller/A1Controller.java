package com.example.test1.controller;

import com.example.test1.dto.A1RequestDto;
import com.example.test1.entity.A1;
import com.example.test1.repository.A1Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class A1Controller {
    private final A1Repository a1Repository;
    private A1Repository a1Repository1;

    @GetMapping("/api/A1s")
    public List<A1> getA1s() {
        return a1Repository.findAllByOrderByModifiedAtDesc();
    }

//    @PostMapping("/api/A2s")
//    PublicKey A1 postA1(@RequestBody A1RequestDto a1RequestDto){
//
//    }
}