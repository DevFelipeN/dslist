package com.dev_felipe.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev_felipe.dslist.dto.GameListDTO;
import com.dev_felipe.dslist.dto.GameMinDTO;
import com.dev_felipe.dslist.entities.GameList;
import com.dev_felipe.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll(); //Pega do Banco todas as listas de games cadastrados
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
