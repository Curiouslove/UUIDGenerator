package com.lovie.uuidgenerator.service;

import com.lovie.uuidgenerator.data.model.UUID;
import com.lovie.uuidgenerator.data.repository.UUIDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class UUIDServiceImpl implements UUIDService {

    @Autowired
    private UUIDRepository uuidRepository;

    public UUIDServiceImpl(UUIDRepository uuidRepository){
        this.uuidRepository = uuidRepository;
    }

    @Override
    public void generateUUID() {
        UUID uuid = new UUID();
        uuid.setUuid(java.util.UUID.randomUUID());
        uuid.setTimeStamp(LocalDateTime.now());
        uuidRepository.save(uuid);
    }

    @Override
    public Map<LocalDateTime, java.util.UUID> getAllUUID() {
        List<UUID> uuidList = uuidRepository.findAll();
        Collections.reverse(uuidList);
        Map<LocalDateTime, java.util.UUID> uuids = new LinkedHashMap<>();
        for (UUID uuid : uuidList){
            uuids.put(uuid.getTimeStamp(), uuid.getUuid());
        }
        return uuids;
    }


}
