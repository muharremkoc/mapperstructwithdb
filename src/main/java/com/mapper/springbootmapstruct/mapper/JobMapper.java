package com.mapper.springbootmapstruct.mapper;

import com.mapper.springbootmapstruct.dto.JobDTO;

import com.mapper.springbootmapstruct.model.Job;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface JobMapper {
    JobDTO toJobDTO(Job job);
    List<JobDTO>toJobDTOs(List<Job>jobs);
    Job toJob(JobDTO jobDTO);

}
