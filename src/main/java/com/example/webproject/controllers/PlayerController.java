package com.example.webproject.controllers;

import com.example.webproject.services.PlayerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("/hello-world")
public class PlayerController {

    private final PlayerService playerService;

    @Inject
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}