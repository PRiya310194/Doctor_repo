package com.example.DoctorApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="tbl_doctor")
public class Doctor {
    @Id
    @Column(name="doctor-id")
    private int doctorId;
    @Column(name="doctor_name")
    private String doctorName;
    @Column(name="experience")
    private String experience;
    @Column(name="Specialization")
    private String specialization;


}
