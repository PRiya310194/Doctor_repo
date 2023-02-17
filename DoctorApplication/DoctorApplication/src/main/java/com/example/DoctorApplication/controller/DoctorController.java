package com.example.DoctorApplication.controller;

import com.example.DoctorApplication.model.Doctor;
import com.example.DoctorApplication.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DoctorController {
@Autowired
DoctorService doctorservice;
@PostMapping(value="/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){

    return doctorservice.saveDoctor(doctor);
}
@GetMapping(value="/doctor")
public List<Doctor> getDoctor(@Nullable @RequestParam String doctorId){  // http://localhost:8080/doctor?doctorId=1

    return doctorservice.getDoctor(doctorId);
}


}
