package com.nivetha.joblisting.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "JobPost")
public class JobPost {
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;



}
