package com.nivetha.joblisting.service;

import com.nivetha.joblisting.model.JobPost;
import com.nivetha.joblisting.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostService {

    @Autowired
    JobPostRepository jobPostRepository;

    public ResponseEntity<String> addJobPosts(JobPost jobpost) {
        jobPostRepository.save(jobpost);
        return new ResponseEntity<>("Job Post successfully created", HttpStatus.CREATED);
    }
}
