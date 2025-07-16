package com.nivetha.joblisting.repository;

import com.nivetha.joblisting.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepository extends MongoRepository<JobPost, String> {
}
