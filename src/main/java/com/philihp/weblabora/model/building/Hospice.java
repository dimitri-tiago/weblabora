package com.philihp.weblabora.model.building;

import static com.philihp.weblabora.model.TerrainTypeEnum.COAST;
import static com.philihp.weblabora.model.TerrainTypeEnum.MOUNTAIN;
import static com.philihp.weblabora.model.TerrainTypeEnum.HILLSIDE;
import static com.philihp.weblabora.model.TerrainTypeEnum.PLAINS;

import java.util.EnumSet;
import java.util.Set;

import com.philihp.weblabora.model.Board;
import com.philihp.weblabora.model.BuildCost;
import com.philihp.weblabora.model.Coordinate;
import com.philihp.weblabora.model.Landscape;
import com.philihp.weblabora.model.Player;
import com.philihp.weblabora.model.TerrainTypeEnum;
import com.philihp.weblabora.model.UsageParam;
import com.philihp.weblabora.model.Wheel;

public class Hospice extends Building {

	public Hospice() {
		super("F40", "D", 3, "Hospice",
				BuildCost.is().wood(3).straw(1), 5, 7, EnumSet.of(PLAINS,
						HILLSIDE, COAST), true);
	}

	@Override
	public void use(Board board, UsageParam input) {
		//use any building
	}
}