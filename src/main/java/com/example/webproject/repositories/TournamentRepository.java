package com.example.webproject.repositories;

import com.example.webproject.models.Tournament;

import java.util.ArrayList;
import java.util.List;

public class TournamentRepository {
    private final List<Tournament> tournaments = new ArrayList<>();
    private Long nextId = 1L;

    public List<Tournament> getAllTournaments() {
        return tournaments;
    }

    public Tournament getTournamentById(Long id) {
        for (Tournament tournament : tournaments) {
            if (tournament.getId().equals(id)) {
                return tournament;
            }
        }
        return null;
    }

    public Tournament createTournament(Tournament tournament) {
        tournament.setId(nextId++);
        tournaments.add(tournament);
        return tournament;
    }

    public Tournament updateTournament(Long id, Tournament updatedTournament) {
        Tournament existingTournament = getTournamentById(id);
        if (existingTournament != null) {
            existingTournament.setName(updatedTournament.getName());
            existingTournament.setSport(updatedTournament.getSport());
            existingTournament.setStartDate(updatedTournament.getStartDate());
            existingTournament.setEndDate(updatedTournament.getEndDate());
            return existingTournament;
        }
        return null;
    }

    public void deleteTournament(Long id) {
        Tournament tournament = getTournamentById(id);
        if (tournament != null) {
            tournaments.remove(tournament);
        }
    }
}

