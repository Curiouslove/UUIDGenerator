package com.lovie.uuidgenerator;

import com.lovie.uuidgenerator.data.repository.UUIDRepository;
import com.lovie.uuidgenerator.service.UUIDService;
import com.lovie.uuidgenerator.service.UUIDServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
public class UUIDServiceImplTest {

    @Autowired
    UUIDRepository uuidRepository;
    UUIDService uuidService;

    @BeforeEach
    void setUp() {
        uuidService = new UUIDServiceImpl(uuidRepository);
    }

    @Test
    void test_that_uuid_can_be_generated(){
        uuidService.generateUUID();
        assertThat(uuidRepository.findAll()).isNotNull();
    }


}
