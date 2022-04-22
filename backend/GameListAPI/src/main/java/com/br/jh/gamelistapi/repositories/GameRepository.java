package com.br.jh.gamelistapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.jh.gamelistapi.entities.Game;

public interface GameRepository extends JpaRepository<Game, Integer> {

}
