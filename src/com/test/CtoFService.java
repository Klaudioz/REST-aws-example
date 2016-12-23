package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ctofservice")
public class CtoFService {

	@GET
	@Produces("application/json")
	public Response convertCtoF() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "@Produces(\"application/json\") Output: \n\nC to F Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}

	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response convertCtoFfromInput(@PathParam("c") Double c) throws JSONException {
		
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "@Produces(\"application/json\") Output: \n\nC to F Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}