package com.example.practice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import com.example.practice.College;
import jakarta.ws.rs.core.MediaType;
import com.google.gson.Gson;

import java.awt.*;

@Path("/users/{owner_id}/colleges/{college_id}")
public class CollegeResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String greet(@PathParam("owner_id") int owner_id, @PathParam("college_id") int college_id) {
        Gson gson = new Gson();
        College temp = new College("temp", college_id, owner_id);
        String json = gson.toJson(temp);
        return json;
    }
}