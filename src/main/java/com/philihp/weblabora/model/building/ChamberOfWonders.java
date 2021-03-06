package com.philihp.weblabora.model.building;

import static com.philihp.weblabora.model.TerrainTypeEnum.COAST;
import static com.philihp.weblabora.model.TerrainTypeEnum.HILLSIDE;
import static com.philihp.weblabora.model.TerrainTypeEnum.PLAINS;

import java.util.EnumSet;

import com.philihp.weblabora.model.Board;
import com.philihp.weblabora.model.BuildCost;
import com.philihp.weblabora.model.Player;
import com.philihp.weblabora.model.SettlementRound;
import com.philihp.weblabora.model.UsageParam;
import com.philihp.weblabora.model.WeblaboraException;

public class ChamberOfWonders extends Building {

	public ChamberOfWonders() {
		super("F25", SettlementRound.B, 4, "Chamber of Wonders", BuildCost.is().wood(1).clay(1), 6, 0,
				EnumSet.of(COAST, PLAINS, HILLSIDE), false);
	}

	@Override
	public void use(Board board, UsageParam param) throws WeblaboraException {
		Player player = board.getPlayer(board.getActivePlayer());
		if(param.differentSingularGoods() == 13) {
			player.subtractAll(param);
			player.claimWonder(board.claimWonder());
		}
		else throw new WeblaboraException(getName() + " requires exactly 13 different goods, but was only given "+param.differentSingularGoods());
	}
}
