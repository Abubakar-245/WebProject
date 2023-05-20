package com.example.webproject.controllers;

import com.example.webproject.services.AnnouncementService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("/hello-world")
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @Inject
    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}