package com.thesoftwaredude.schoolmanagementapi.domains.student;

import java.time.OffsetDateTime;

import com.thesoftwaredude.schoolmanagementapi.common.Gender;
import com.thesoftwaredude.schoolmanagementapi.common.IAuditable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Students")
public class Student implements IAuditable {
    @Id
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
