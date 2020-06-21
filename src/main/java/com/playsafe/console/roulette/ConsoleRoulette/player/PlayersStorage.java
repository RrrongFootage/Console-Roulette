package com.playsafe.console.roulette.ConsoleRoulette.player;


import com.google.common.collect.ImmutableSet;

public interface PlayersStorage {
	void addPlayer(Player player);

	ImmutableSet<Player> getRegisteredPlayers();
}
