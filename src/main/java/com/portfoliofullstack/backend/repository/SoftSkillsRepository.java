package com.portfoliofullstack.backend.repository;

import com.portfoliofullstack.backend.model.SoftSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillsRepository extends JpaRepository<SoftSkills, Long> {
}
