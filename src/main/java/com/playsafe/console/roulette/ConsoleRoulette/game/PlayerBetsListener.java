package com.playsafe.console.roulette.ConsoleRoulette.game;

import com.playsafe.console.roulette.ConsoleRoulette.bet.PlayerBet;
import com.playsafe.console.roulette.ConsoleRoulette.bet.PlayerBetsStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Iterator;

@Component
class PlayerBetsListener {
	@Autowired
	private PlayerBetsStorage playerBetsStorage;

	@Autowired
	private Iterator<PlayerBet> playerBetIterator;

	@PostConstruct
	void acceptBets() {
		new Thread(this::processBets).start();
	}

	private void processBets() {
		playerBetIterator.forEachRemaining(playerBetsStorage::addBet);
	}
}
