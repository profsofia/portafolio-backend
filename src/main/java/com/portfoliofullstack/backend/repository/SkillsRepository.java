package com.portfoliofullstack.backend.repository;

import com.portfoliofullstack.backend.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Long> {
}
