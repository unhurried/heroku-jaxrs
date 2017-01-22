package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("sample")
public class SampleResource {

	@Path("resource")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Dto create(Dto request) {
		Dto response = new Dto();
		response.id = "fd2118d5-5814-4bf6-841c-7a8b665f8e9a";
		response.date = request.date;
		response.value = request.value;

		return response;
	}
}
