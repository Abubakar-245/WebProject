package com.example.webproject.services;

import com.example.webproject.models.Tournament;
import com.example.webproject.repositories.TournamentRepository;

import java.util.List;

public class TournamentService {

    private final TournamentRepository tournamentRepository;

    public TournamentService(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

//    public List<Tournament> getAllTournaments() {
//        return tournamentRepository.getAllTournaments();
//    }
//
//    public Tournament getTournamentById(Long id) {
//        return tournamentRepository.getTournamentById(id);
//    }
//
//    public Tournament createTournament(Tournament tournament) {
//        return tournamentRepository.createTournament(tournament);
//    }
//
//    public Tournament updateTournament(Long id, Tournament tournament) {
//        return tournamentRepository.updateTournament(id, tournament);
//    }
//
//    public void deleteTournament(Long id) {
//        tournamentRepository.deleteTournament(id);
//    }

    // Other service methods
}
