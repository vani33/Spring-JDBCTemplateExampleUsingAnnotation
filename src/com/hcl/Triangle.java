package com.hcl;

import org.springframework.stereotype.Component;

@Component("triangle")
public class Triangle {

	public void draw(){
		System.out.println("Triangle -> Annotations new draw");
	}
}
