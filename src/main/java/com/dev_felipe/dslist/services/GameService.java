package com.dev_felipe.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev_felipe.dslist.dto.GameMinDTO;
import com.dev_felipe.dslist.entities.Game;
import com.dev_felipe.dslist.repositories.GameRepository;

@Service

public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll(); //Pega do Banco todos os Games cadastrados
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
