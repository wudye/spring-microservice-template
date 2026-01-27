package com.mwu.licensingservice.model;

import jakarta.persistence.Id;
import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Organization extends RepresentationModel<Organization> {

    @Id
	String id;
    String name;
    String contactName;
    String contactEmail;
    String contactPhone;
    
}
