package com.lovie.uuidgenerator.controller;

import com.lovie.uuidgenerator.data.model.UUID;
import com.lovie.uuidgenerator.service.UUIDService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@RequestMapping("/api/")
public class UuidController {
    @Autowired
    UUIDService uuidService;

    @GetMapping("/uuid")
    private ResponseEntity<?> generateUuid(){
        uuidService.generateUUID();
        Map<LocalDateTime, java.util.UUID> uuids = uuidService.getAllUUID();
        return ResponseEntity.ok().body(uuids);
    }

}
