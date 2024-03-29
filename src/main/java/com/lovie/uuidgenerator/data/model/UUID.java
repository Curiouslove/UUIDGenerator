package com.lovie.uuidgenerator.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UUID {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private java.util.UUID uuid;
    private LocalDateTime timeStamp;
}
