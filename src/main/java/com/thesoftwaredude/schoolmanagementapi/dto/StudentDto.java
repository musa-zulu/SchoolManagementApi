package com.thesoftwaredude.schoolmanagementapi.dto;

import java.time.OffsetDateTime;

import com.thesoftwaredude.schoolmanagementapi.common.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {
    private String id;
    private String userId;
    private String identityNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private OffsetDateTime birthDate;
    private Gender gender;
    private OffsetDateTime createdDate;
    private OffsetDateTime updatedDate;
    private String createdBy;
    private String updatedBy; 
}
