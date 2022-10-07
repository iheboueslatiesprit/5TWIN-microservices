package com.esprit.microservice.job;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/jobs")
public class JobRestAPI {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable("id") int id) {
        return jobRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public void updateJob(@PathVariable("etat") Boolean etat,@PathVariable("id") int id) {
        jobRepository.updateEtat(etat, id);
    }

}
