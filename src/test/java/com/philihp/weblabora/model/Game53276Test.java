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
public class Game53276Test {

  Board board;

  @Before
  public void setUp() throws Exception {
    board = new Board();
    MoveProcessor.processMove(board, "config PLAYERS 3");
    MoveProcessor.processMove(board, "config LENGTH LONG");
    MoveProcessor.processMove(board, "config COUNTRY FRANCE");
    MoveProcessor.processMove(board, "start");
    MoveProcessor.processMove(board, "use LR3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 ShJo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees1 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G12 3 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G02 3 1");
    MoveProcessor.processMove(board, "use G02 GnClPn Pn");
    MoveProcessor.processMove(board, "buy_district 2 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F09 3 1");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LR2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G01 3 1");
    MoveProcessor.processMove(board, "use G01 *");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use G12 ShShPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB2 Gn");
    MoveProcessor.processMove(board, "buy_plot 1 COAST");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG3 Jo");
    MoveProcessor.processMove(board, "buy_district 2 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees1 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LR2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G12 PtWoShShSh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F08 1 2");
    MoveProcessor.processMove(board, "use F08 ClPnShGn *");
    MoveProcessor.processMove(board, "buy_district 3 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB2 ShJo");
    MoveProcessor.processMove(board, "buy_district 3 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build G06 1 1");
    MoveProcessor.processMove(board, "use G06 PtPtPt");
    MoveProcessor.processMove(board, "buy_plot 1 COAST");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S03 2 2 ShShShGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S02 0 1 PtWoShPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S03 2 2 ShShBr");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build G16 3 2");
    MoveProcessor.processMove(board, "use G16 *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LR3");
    MoveProcessor.processMove(board, "buy_plot 1 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F14 4 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G16 Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees0 2");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "work_contract F08 Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F08 PnGnSwWo");
    MoveProcessor.processMove(board, "buy_district 2 PLAINS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LR3 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F04 -1 1");
    MoveProcessor.processMove(board, "use F04 GnGnGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F11 -1 1");
    MoveProcessor.processMove(board, "use F11 *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use F11");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F08 Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F08 PnPtSwCl");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR3");
    MoveProcessor.processMove(board, "buy_district 3 HILLS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G07 0 0");
    MoveProcessor.processMove(board, "use G07 PtPtPtPtPtPtPtPtPt *");
    MoveProcessor.processMove(board, "buy_plot 0 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F14 Jo");
    MoveProcessor.processMove(board, "buy_plot 3 COAST");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G16 Pn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S02 1 3 CoShPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S05 4 2 WoShShFl");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S05 1 2 WoShBr");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert GnGn");
    MoveProcessor.processMove(board, "build F21 0 1");
    MoveProcessor.processMove(board, "use F21 GpGp Wn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "fell_trees0 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G22 6 1");
    MoveProcessor.processMove(board, "use G22 Jo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F05 1 2");
    MoveProcessor.processMove(board, "use F05 FlFlPt BrBr");
    MoveProcessor.processMove(board, "buy_plot 1 MOUNTAIN");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LR2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "cut_peat 0 1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F14 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F14");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use G22 Jo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F11");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build F17 3 2");
    MoveProcessor.processMove(board, "use F17 PnPnPn Bo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G02 GnSwPn Cl");
    MoveProcessor.processMove(board, "buy_district 4 HILLS");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LR3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "use F08 GnSwShCl");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S02 3 3 PtWoBr");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S04 -1 2 ShShShShPtWo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S06 3 3 CoCoMt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F33 -1 3");
    MoveProcessor.processMove(board, "use F33 PtWo Mt *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F32 5 1");
    MoveProcessor.processMove(board, "use F32 Pn *");
    MoveProcessor.processMove(board, "fell_trees0 2");
    MoveProcessor.processMove(board, "cut_peat 0 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert GnGn");
    MoveProcessor.processMove(board, "build F20 2 3");
    MoveProcessor.processMove(board, "use F20 ShShBrWn *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LR1");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F14");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F21 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F21 GpGpGpGpGpGpGpGpGpGpGp Wn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F27 4 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F33 PtWo Mt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G22");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LB3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "buy_plot 3 COAST");
    MoveProcessor.processMove(board, "build G26 -1 4");
    MoveProcessor.processMove(board, "use G26 WoWo *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F20 ShShShGnWn");
    MoveProcessor.processMove(board, "buy_plot 1 COAST");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F21 PnPn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F21 GpGpGpGpGpGpGp Wn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F32 Pn");
    MoveProcessor.processMove(board, "cut_peat 0 0");
    MoveProcessor.processMove(board, "fell_trees1 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F17 PnPnPn Bo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G01 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use G26");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S04 -1 1 ShShShShCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S06 1 3 PtPtPtMt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S06 0 3 PtPtPtShPnPnPn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F29 6 0");
    MoveProcessor.processMove(board, "use F29 *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build F40 5 1");
    MoveProcessor.processMove(board, "use F40 *");
    MoveProcessor.processMove(board, "use F38 1 4 2 4 1 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F33 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F33 PtWo Mt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F24 3 0");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F36 2 3");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert GnGn");
    MoveProcessor.processMove(board, "build F30 -1 3");
    MoveProcessor.processMove(board, "use F30 *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build F38 -1 2");
    MoveProcessor.processMove(board, "use F38 1 0 2 0 1 1 0 2 0 3 *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F32 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F32 Pn ");
    MoveProcessor.processMove(board, "fell_trees2 0");
    MoveProcessor.processMove(board, "cut_peat 0 4");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F09");
    MoveProcessor.processMove(board, "use LR2 Sh");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use F27 Wn");
    MoveProcessor.processMove(board, "use F33 Co Mt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G07 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use G07 PtPtPtPtPt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G16 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use G16");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F40 PnPn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F40");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S07 0 2 MtMtMtCoCoCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G18 3 0");
    MoveProcessor.processMove(board, "use G18 CoClClCl *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "convert Gn");
    MoveProcessor.processMove(board, "build F35 2 2");
    MoveProcessor.processMove(board, "use F35 NiNiNi *");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use LG2 Gn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F27 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F27 Wn");
    MoveProcessor.processMove(board, "use F40");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S08 5 2 MtMtMtMtMtShShGnCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract G01 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use G01");
    MoveProcessor.processMove(board, "use F35 Ni");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F33 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F33 Co Mt");
    MoveProcessor.processMove(board, "convert GnGn");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "work_contract F30 Wn");
    MoveProcessor.processMove(board, "with CLERGYMAN");
    MoveProcessor.processMove(board, "use F30 Po");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "build G28 4 3");
    MoveProcessor.processMove(board, "use G28 *");
    MoveProcessor.processMove(board, "settle S07 0 2 PtPtPtPtWoMtMtMt");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S05 1 1 MtSwSw");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "use G28");
    MoveProcessor.processMove(board, "settle S04 -1 2 NiPnPnPnCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S08 4 2 PtPtShShShShShShShMtGnGnNiPnPnPnGp");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S08 4 2 GnGnGnGnGnGnGnGnGnMtMtMtShShShCo");
    MoveProcessor.processMove(board, "commit");
    MoveProcessor.processMove(board, "settle S07 0 2 CoCoCoNiNiPnPnShWn");
    MoveProcessor.processMove(board, "commit");
  }

  @Test
  public void testEndingScores() throws WeblaboraException {
    assertThat(board.isGameOver(), is(true));
  }
}
