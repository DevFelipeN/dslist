package com.dev_felipe.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev_felipe.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long > {

}
