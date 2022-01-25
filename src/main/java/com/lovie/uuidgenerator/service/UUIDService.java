package com.lovie.uuidgenerator.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface UUIDService {

    void generateUUID();
    Map<LocalDateTime, UUID> getAllUUID();
}
