package org.voting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voting.model.Game;


public interface GameRepo extends JpaRepository<Game, String> {
}


