package com.mapper.springbootmapstruct.service;

import com.mapper.springbootmapstruct.model.Job;
import com.mapper.springbootmapstruct.repository.JobRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService{

    @Autowired
    JobRepository jobRepository;

    public List<Job> findAll() {
        return (List<Job>) jobRepository.findAll();
    }

    public Optional<Job> findById(Long id) {
        return jobRepository.findById(id);
    }

    public Job save(Job stock) {
        return jobRepository.save(stock);
    }

    public void deleteById(Long id) {
        jobRepository.deleteById(id);
    }
}
