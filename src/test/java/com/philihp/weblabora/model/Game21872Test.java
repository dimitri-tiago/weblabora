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
public class Game21872Test {

  Board board;

  @Before
  public void setUp() throws Exception {
    board = new Board();
    MoveProcessor.processMove(board, "config PLAYERS 4");
    MoveProcessor.processMove(board, "config LENGTH LONG");
    MoveProcessor.processMove(board, "config COUNTRY FRANCE");
    MoveProcessor.processMove(board, "START");
    MoveProcessor.processMove(board, "use LR3");
    MoveProcessor.processMove(board, "buy_district 2 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG3 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 2 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LW1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G01 3 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F09 3 1");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 1 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 0 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G02 3 1");
    MoveProcessor.processMove(board, "use G02 ClPnGn Pn");
    MoveProcessor.processMove(board, "buy_district -1 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR1 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G12 0 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB3");
    MoveProcessor.processMove(board, "buy_district -1 HILLS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LW2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 2 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G12 PtPtShShShSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F04 3 -1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G13 1 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build F05 2 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G13 PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG3 Jo");
    MoveProcessor.processMove(board, "buy_district 2 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB3");
    MoveProcessor.processMove(board, "buy_plot -1 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LW2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 1 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F08 1 2");
    MoveProcessor.processMove(board, "use F08 ClGpPtGn");
    MoveProcessor.processMove(board, "buy_plot 0 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S03 3 0 ShShShSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S01 2 -1 WoGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S02 3 0 ShGnPtWo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S01 2 2 GpPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F15 1 -1");
    MoveProcessor.processMove(board, "use F15");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use F15 Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build G16 3 1");
    MoveProcessor.processMove(board, "use G16 *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G02 SwGnWo Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG2 JoGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 2 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G07 1 2");
    MoveProcessor.processMove(board, "use G07 PtPtPtPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G13 PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F14 4 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S05 4 2 BrShPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S05 2 0 PtShShSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S05 4 -1 WoShBr");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S05 3 2 WoBrGnGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G22 6 0");
    MoveProcessor.processMove(board, "use G22 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F04 GnGnGnGnGnGn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build F21 2 0");
    MoveProcessor.processMove(board, "use F21 GpGp Wn");
    MoveProcessor.processMove(board, "buy_plot -2 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use F21 GpGpGp Wn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 0 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract R PnPn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F05 FlFlFlFlFlFlPtPt BrBr");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert GnGn");
    MoveProcessor.processMove(board, "buy_district -2 PLAINS");
    MoveProcessor.processMove(board, "build F20 2 -2");
    MoveProcessor.processMove(board, "use F20 PnWn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 0 COAST");
    MoveProcessor.processMove(board, "use LR2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 1 MOUNTAIN");
    MoveProcessor.processMove(board, "work_contract G PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G12 BrBrBrPnPtPtSwSw");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G13 PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Ni");
    MoveProcessor.processMove(board, "work_contract G PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G22 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F24 3 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F17 5 1");
    MoveProcessor.processMove(board, "use F17 Pn Bo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F15 Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_district 3 HILLS");
    MoveProcessor.processMove(board, "cut_peat 0 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 2 -1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F25 3 -1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F11 -1 0");
    MoveProcessor.processMove(board, "use F11");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G18 5 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G22 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract B Wn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F04 GnGnGnGnGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build F23 5 1");
    MoveProcessor.processMove(board, "use F23 Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 -1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G02 ClPnFl Wo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F05 FlFlFlFlFlFlFlCoSw BrBr");
    MoveProcessor.processMove(board, "buy_plot 0 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S02 3 0 WoPtBr");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S04 -1 1 CoBrBrSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S03 0 2 PnPnPnPnPnSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S06 5 0 PtPtPtMt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F31 4 -2");
    MoveProcessor.processMove(board, "use F31");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR1");
    MoveProcessor.processMove(board, "buy_plot 2 COAST");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G22");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G18 ClClClSnPtPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F21 GpGpGpGpGpGpGpGpGp Wn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G19 1 1");
    MoveProcessor.processMove(board, "use G19 ShShShShSwSwSwSw");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert GnGn");
    MoveProcessor.processMove(board, "build F30 4 3");
    MoveProcessor.processMove(board, "use F30");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 0 MOUNTAIN");
    MoveProcessor.processMove(board, "build F32 5 1");
    MoveProcessor.processMove(board, "use F32 Pn");
    MoveProcessor.processMove(board, "fell_trees 0 -2");
    MoveProcessor.processMove(board, "cut_peat 0 0 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use F30");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G02 ClWoFl Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G26 -1 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract R PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G07 PtPtPtPtPtPtPtPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "settle S07 2 -1 ShShShShShShBrPtWoWoWoWoWoSwSwSwSw");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S03 3 -2 ShShShFl");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S07 0 0 MtMtMtCoCoCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S02 3 3 GpGpGpCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F40 5 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F29 6 0");
    MoveProcessor.processMove(board, "use F29");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 2 MOUNTAIN");
    MoveProcessor.processMove(board, "build F38 0 3");
    MoveProcessor.processMove(board, "use F38 1 3 2 3 1 1 1 0 2 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G13 PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F14");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F36 2 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees 1 -1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G Wn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 ShJo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F11");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F08 WoSnPnGp");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G39 5 -1");
    MoveProcessor.processMove(board, "use G39 PtPtPt *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G28 6 -2");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S06 5 -2 ShShFlPtPtPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S03 2 2 MtGpGp");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract R PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert GnGnGnGnGnGn");
    MoveProcessor.processMove(board, "use G19 SwSwSwSwSwSwShShShShShSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F40");
    MoveProcessor.processMove(board, "use F27 Wn");
    MoveProcessor.processMove(board, "use F08 WoClSwSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 1");
    MoveProcessor.processMove(board, "buy_district 3 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LG2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F36 Or Po");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F15 Pn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S06 2 3 PtPtPtBrGpGp");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract B PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F17 PnPnPn Bo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build F35 1 -1");
    MoveProcessor.processMove(board, "use F35 PnPnPnPnPn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F40");
    MoveProcessor.processMove(board, "use F33 PtWo Mt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F24 BrBrWnWn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract W PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S06 1 3 MtCoCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G18 ClClClPtWo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G13 PnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G26 WoWo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S08 5 2 MtMtMtMtMtMtCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F40");
    MoveProcessor.processMove(board, "use G34");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F25 WoClSnSwPnGnShFlGpMtWnBrBo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S01 4 3 GpPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S07 5 3 ShShShShShBrGpPnCoCoCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S02 4 -1 PtWoPnPnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S08 5 -1 ShShShFlGpBrMtMtMtMtWoWoWo");
    MoveProcessor.processMove(board, "commit");
  }

  @Test
  public void testEndingScores() throws WeblaboraException {
    assertThat(board.isGameOver(), is(true));
  }
}
