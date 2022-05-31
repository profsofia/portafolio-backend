package com.portfoliofullstack.backend.repository;

import com.portfoliofullstack.backend.model.Practices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticesRepository extends JpaRepository<Practices, Long> {
}
