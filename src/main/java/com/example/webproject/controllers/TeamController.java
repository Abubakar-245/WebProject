package com.example.webproject.controllers;

import jakarta.ws.rs.*;

@Path("/hello-world")
public class TeamController {

    private final TeamService teamService;

    @Inject
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}