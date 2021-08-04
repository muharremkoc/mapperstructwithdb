package com.mapper.springbootmapstruct.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JobDTO {


    String name;

    String jobName;
}
