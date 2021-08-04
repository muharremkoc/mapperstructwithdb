package com.mapper.springbootmapstruct.controller;

import com.mapper.springbootmapstruct.dto.JobDTO;
import com.mapper.springbootmapstruct.mapper.JobMapper;


import com.mapper.springbootmapstruct.model.Job;
import com.mapper.springbootmapstruct.service.JobService;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequestMapping("/api/version/1")
public class JobController {
    @Autowired
    JobService jobService;

    JobMapper jobMapper;

    @GetMapping("/products")
     public ResponseEntity<List<JobDTO>> findAll(){
        return ResponseEntity.ok(jobMapper.toJobDTOs(jobService.findAll()));
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<JobDTO> findById(@PathVariable Long id){

        Optional<Job> job = jobService.findById(id);

        return ResponseEntity.ok(jobMapper.toJobDTO(job.get()));
    }


    @PostMapping("/product")
    public ResponseEntity<JobDTO> create(@RequestBody JobDTO jobDTO){

        jobService.save(jobMapper.toJob(jobDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(jobDTO);
    }
    @PutMapping("/product/{id}")
    public ResponseEntity<JobDTO> update(@PathVariable Long id, @RequestBody JobDTO jobDTO) {
        Job job = jobMapper.toJob(jobDTO);
        job.setId(id);

        jobService.save(job);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(jobDTO);
    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        jobService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
