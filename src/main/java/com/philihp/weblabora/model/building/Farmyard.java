package com.philihp.weblabora.model.building;

import java.util.EnumSet;

import com.philihp.weblabora.model.Board;
import com.philihp.weblabora.model.BuildCost;
import com.philihp.weblabora.model.Color;
import com.philihp.weblabora.model.Player;
import com.philihp.weblabora.model.SettlementRound;
import com.philihp.weblabora.model.TerrainTypeEnum;
import com.philihp.weblabora.model.Token;
import com.philihp.weblabora.model.UsageParam;
import com.philihp.weblabora.model.WeblaboraException;
import com.philihp.weblabora.model.Wheel;

public class Farmyard extends Building {

	public Farmyard(String id, SettlementRound stage, int players) {
		super(id, stage, players, "Farmyard", BuildCost.is(), 2, 0, EnumSet.of(TerrainTypeEnum.PLAINS), false);
	}

	@Override
	public void use(Board board, UsageParam input) throws WeblaboraException {
		Player activePlayer = board.getPlayer(board.getActivePlayer());
		Wheel wheel = board.getWheel();
		
		if(input.getSheep() != 0) {
			Token token = input.isWithJoker()?wheel.getJoker():wheel.getSheep();
			activePlayer.addSheep(token.take());
			board.distributeBonusProduction(UsageParam.is().sheep(1));
		}
		else if(input.getGrain() != 0) {
			Token token = input.isWithJoker()?wheel.getJoker():wheel.getGrain();
			activePlayer.addGrain(token.take());
			board.distributeBonusProduction(UsageParam.is().grain(1));
		}
		else {
			throw new WeblaboraException("Usage of Farmyard must specify if Sheep or Grain is desired.");
		}
		
	}

	@Override
	public String getImage() {
		return "L02";
	}
	
	public static Farmyard make(Color color) {
		switch (color) {
		case RED:
			return new FarmyardR();
		case GREEN:
			return new FarmyardG();
		case BLUE:
			return new FarmyardB();
		case WHITE:
			return new FarmyardW();
		default:
			throw new RuntimeException("Unknown color " + color);
		}
	}
}
