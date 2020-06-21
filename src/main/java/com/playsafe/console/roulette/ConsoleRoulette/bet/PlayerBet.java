package com.playsafe.console.roulette.ConsoleRoulette.bet;


import com.playsafe.console.roulette.ConsoleRoulette.player.Player;

public class PlayerBet {
	private final Player player;
	private final Bet bet;

	public PlayerBet(Player player, Bet bet) {
		this.player = player;
		this.bet = bet;
	}

	public Player getPlayer() {
		return player;
	}

	public Bet getBet() {
		return bet;
	}
}
