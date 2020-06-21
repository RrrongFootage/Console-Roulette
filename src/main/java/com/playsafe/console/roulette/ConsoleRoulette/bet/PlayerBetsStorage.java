package com.playsafe.console.roulette.ConsoleRoulette.bet;


import java.util.Set;

public interface PlayerBetsStorage {
	void addBet(PlayerBet playerBet);

	Set<PlayerBet> grabCurrentGameBets();
}
