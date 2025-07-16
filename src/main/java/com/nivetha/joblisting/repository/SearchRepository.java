package com.nivetha.joblisting.repository;

import com.nivetha.joblisting.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepository {
    List<JobPost> findByText(String text);
}
