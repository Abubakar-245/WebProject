package com.example.webproject.controllers;

import com.example.webproject.models.Tournament;
import com.example.webproject.services.TournamentService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/tournaments")
public class TournamentController {

    private final TournamentService tournamentService;

    @Inject
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Tournament getTournamentById(@PathParam("id") Long id) {
        return tournamentService.getTournamentById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Tournament createTournament(Tournament tournament) {
        return tournamentService.createTournament(tournament);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Tournament updateTournament(@PathParam("id") Long id, Tournament tournament) {
        return tournamentService.updateTournament(id, tournament);
    }

    @DELETE
    @Path("/{id}")
    public void deleteTournament(@PathParam("id") Long id) {
        tournamentService.deleteTournament(id);
    }

    // Other CRUD operations and endpoints
}
