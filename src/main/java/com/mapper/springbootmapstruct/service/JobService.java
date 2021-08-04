package com.mapper.springbootmapstruct.service;

import com.mapper.springbootmapstruct.model.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {
    List<Job> findAll();
    Optional<Job> findById(Long id);
    Job save(Job stock);
    public void deleteById(Long id);
}
