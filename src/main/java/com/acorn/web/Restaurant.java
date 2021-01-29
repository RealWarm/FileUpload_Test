package com.acorn.web;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Restaurant {
	
	@Inject
	Chef cf;

}//end class
