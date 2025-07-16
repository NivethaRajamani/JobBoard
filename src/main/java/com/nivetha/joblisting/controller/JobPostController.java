package com.nivetha.joblisting.controller;

import com.nivetha.joblisting.model.JobPost;
import com.nivetha.joblisting.repository.JobPostRepository;
import com.nivetha.joblisting.repository.SearchRepository;
import com.nivetha.joblisting.service.JobPostService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class JobPostController {

    @Autowired
    JobPostRepository jobPostRepository;

    @Autowired
    SearchRepository searchRepository;

    @Autowired
    private JobPostService jobPostService;

    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<JobPost> getAllPosts(){
        return jobPostRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<JobPost> searchPost(@PathVariable String text){
        return searchRepository.findByText(text);
    }

    @PostMapping("/create_job_post")
    public ResponseEntity<String> addJobPosts(@RequestBody JobPost jobpost){
        return jobPostService.addJobPosts(jobpost);
    }

}
