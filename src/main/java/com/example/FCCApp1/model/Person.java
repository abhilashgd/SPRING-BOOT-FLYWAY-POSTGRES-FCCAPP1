package com.example.FCCApp1.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter

public class Person {

	private final UUID id;
	@NotBlank
	private final String name;
	
	public Person(@JsonProperty("id") UUID id,
				  @JsonProperty("name") String name) {
		this.id=id;
		this.name=name;
	}
					

}
