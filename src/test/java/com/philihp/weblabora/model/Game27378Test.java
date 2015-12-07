package com.philihp.weblabora.model;

import com.google.common.collect.ImmutableMap;
import com.philihp.weblabora.model.Scorecard.PlayerScore;
import com.philihp.weblabora.model.building.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Map.Entry;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Runs through game 53955 and checks ending board.
 */
public class Game27378Test {

  Board board;

  @Before
  public void setUp() throws Exception {
    board = new Board();
    MoveProcessor.processMove(board, "config PLAYERS 1");
    MoveProcessor.processMove(board, "config COUNTRY IRELAND");
    MoveProcessor.processMove(board, "start");
    MoveProcessor.processMove(board, "cut_peat 0 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 2 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G02 3 1");
    MoveProcessor.processMove(board, "use G02 PtClSh Pn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G13 Pn");
    MoveProcessor.processMove(board, "with PRIOR");
    MoveProcessor.processMove(board, "use G13 PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G01 3 0");
    MoveProcessor.processMove(board, "use G01 *");
    MoveProcessor.processMove(board, "use G13 PnPn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G02 PtSwSh Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract LW3 Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use LW3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 0 COAST");
    MoveProcessor.processMove(board, "use LR2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I08 -1 1");
    MoveProcessor.processMove(board, "use I08 Wh *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 2 COAST");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use I08 Wh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR2 GnJo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I11 -2 2");
    MoveProcessor.processMove(board, "use I11 *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I03 2 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I03 Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR3");
    MoveProcessor.processMove(board, "buy_district 2 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract WHITE Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use LW2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I04 -1 0");
    MoveProcessor.processMove(board, "use I04 GnGnGnGnGnGnGnGnGnGnGn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I05 2 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I05 GnHoGnHoGnHoGnHoGnHoGnHoGnHoGnHoGnHoGnHoGnHoGnHo Be");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I10 1 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I09 1 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G06 0 0");
    MoveProcessor.processMove(board, "build G07 0 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G12 2 0");
    MoveProcessor.processMove(board, "use I10 *");
    MoveProcessor.processMove(board, "use G07 PtPtPtPtPtPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S04 -1 2 BeBeCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use G12 BeBeCoPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 1 0");
    MoveProcessor.processMove(board, "buy_plot 4 COAST");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I17 1 0");
    MoveProcessor.processMove(board, "use I17 Pn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract I09 Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use I09");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR1");
    MoveProcessor.processMove(board, "buy_district 4 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G18 0 0");
    MoveProcessor.processMove(board, "use G18 ClClClSnCoSwSw *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G19 1 4");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I15 0 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I14 0 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G16 3 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S03 1 2 MtSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use I10 *");
    MoveProcessor.processMove(board, "use I15 Cl Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I17 Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 0 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract I15 Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use I15 Pn Wo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I23 0 1");
    MoveProcessor.processMove(board, "use I23 PnPn *");
    MoveProcessor.processMove(board, "build G26 -1 4");
    MoveProcessor.processMove(board, "use G26 WoWo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I23 PnPn");
    MoveProcessor.processMove(board, "build I20 -1 3");
    MoveProcessor.processMove(board, "use I20 BeWh *");
    MoveProcessor.processMove(board, "buy_district 3 HILLS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Ni Pn");
    MoveProcessor.processMove(board, "buy_plot 0 MOUNTAIN");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use I23 PnPn");
    MoveProcessor.processMove(board, "build G22 6 0");
    MoveProcessor.processMove(board, "use G22 Jo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract I10 Pn");
    MoveProcessor.processMove(board, "with PRIOR");
    MoveProcessor.processMove(board, "use I10 *");
    MoveProcessor.processMove(board, "use I15 Gn Wo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I04 GnGnGnGnGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I21 2 4");
    MoveProcessor.processMove(board, "use I21 WoPtHoWoPtHoWoPtHoWoPtHoWoPtHoWoPtHoWoPtHo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I23 PnPn");
    MoveProcessor.processMove(board, "build I24 4 2");
    MoveProcessor.processMove(board, "use I24 PnBeWh *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I25 3 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S06 3 2 MtCoPtSwSw");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I20 BeWh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I31 -1 5");
    MoveProcessor.processMove(board, "use I31 Co *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use I10 *");
    MoveProcessor.processMove(board, "use I15 Cl Wo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I32 0 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I20 BeWh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 1 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G19 ShSwShSwShSwShSwShSwShSwShSw *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 2 MOUNTAIN");
    MoveProcessor.processMove(board, "convert Ni Pn");
    MoveProcessor.processMove(board, "use I23 PnPn");
    MoveProcessor.processMove(board, "build I27 3 3");
    MoveProcessor.processMove(board, "use I27 Wh *");
    MoveProcessor.processMove(board, "use I23 PnPn");
    MoveProcessor.processMove(board, "build G28 6 2");
    MoveProcessor.processMove(board, "use G28 *");
    MoveProcessor.processMove(board, "settle S07 4 3 MtMtMtCoCoWoPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I29 1 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I30 3 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I33 3 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S05 5 2 MtWo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 0 4");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G39 4 4");
    MoveProcessor.processMove(board, "use G39 MtMtMtWhWhHo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S01 0 3 HoPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G22 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G34 5 1");
    MoveProcessor.processMove(board, "use G34 BoPoOrRq *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract I30 Wh");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use I30");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Wh Pn");
    MoveProcessor.processMove(board, "convert Wh Pn");
    MoveProcessor.processMove(board, "convert PnPnPnPnPn Ni");
    MoveProcessor.processMove(board, "use I23 PnPn");
    MoveProcessor.processMove(board, "build G41 5 0");
    MoveProcessor.processMove(board, "use G41 Ni PoPoPoBo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use I20 BeWh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I37 0 4");
    MoveProcessor.processMove(board, "use I37 Bo *");
    MoveProcessor.processMove(board, "buy_district 5 HILLS");
    MoveProcessor.processMove(board, "buy_plot 4 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract I15 Wh");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use I15 Sh Pt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Wh Pn");
    MoveProcessor.processMove(board, "use I23 PnPn");
    MoveProcessor.processMove(board, "build I35 5 4");
    MoveProcessor.processMove(board, "use I35 NiWhWhOrPoPoPoPo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build I38 1 3");
    MoveProcessor.processMove(board, "use I38 Be *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S02 2 3 PtWoShSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S08 5 3 PtWoBeBeMtShShShShShWhWhWh");
    MoveProcessor.processMove(board, "commit");
  }

  @Test
  public void testEndingScores() throws WeblaboraException {
    assertThat(board.isGameOver(), is(true));
  }
}
