package com.lovie.uuidgenerator.data.repository;

import com.lovie.uuidgenerator.data.model.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UUIDRepository extends JpaRepository<UUID, Long> {
}
