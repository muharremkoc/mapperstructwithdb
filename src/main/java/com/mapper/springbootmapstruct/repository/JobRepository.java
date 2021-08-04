package com.mapper.springbootmapstruct.repository;

import com.mapper.springbootmapstruct.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {
}