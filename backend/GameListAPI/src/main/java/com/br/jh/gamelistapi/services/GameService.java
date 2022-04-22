package com.br.jh.gamelistapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.jh.gamelistapi.entities.Game;
import com.br.jh.gamelistapi.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public Game insert(Game obj) {
		obj.setId(null);
		obj = gameRepository.save(obj);
		return obj;
	}
}
