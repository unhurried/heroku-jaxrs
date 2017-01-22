package com.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dto {
	 public String id;
	 public String date;
	 public Double value;

	 public Dto() {} // JAXB constructor
}
