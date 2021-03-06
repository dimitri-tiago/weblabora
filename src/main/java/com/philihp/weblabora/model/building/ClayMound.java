package com.philihp.weblabora.model.building;

import static com.philihp.weblabora.model.TerrainTypeEnum.HILLSIDE;

import java.util.EnumSet;

import com.philihp.weblabora.model.Board;
import com.philihp.weblabora.model.BuildCost;
import com.philihp.weblabora.model.Color;
import com.philihp.weblabora.model.Player;
import com.philihp.weblabora.model.SettlementRound;
import com.philihp.weblabora.model.Token;
import com.philihp.weblabora.model.UsageParam;
import com.philihp.weblabora.model.Wheel;

public class ClayMound extends Building {

	protected ClayMound(String id, SettlementRound stage, int players) {
		super(id, stage, players, "Clay Mound", BuildCost.is(), 3, 0, EnumSet.of(HILLSIDE), false);
	}

	@Override
	public void use(Board board, UsageParam input) {
		Player activePlayer = board.getPlayer(board.getActivePlayer());
		Wheel wheel = board.getWheel();
		Token token = input.isWithJoker()?wheel.getJoker():wheel.getClay();
		activePlayer.addClay(token.take());
		board.distributeBonusProduction(UsageParam.is().clay(1));
	}
	
	@Override
	public String getImage() {
		return "L01";
	}
	

	public static ClayMound make(Color color) {
		switch (color) {
		case RED:
			return new ClayMoundR();
		case GREEN:
			return new ClayMoundG();
		case BLUE:
			return new ClayMoundB();
		case WHITE:
			return new ClayMoundW();
		default:
			throw new RuntimeException("Unknown color " + color);
		}
	}
}
