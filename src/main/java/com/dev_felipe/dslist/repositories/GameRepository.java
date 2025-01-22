package com.dev_felipe.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev_felipe.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {

}
