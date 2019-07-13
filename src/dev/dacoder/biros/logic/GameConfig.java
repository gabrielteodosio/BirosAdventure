package dev.dacoder.biros.logic;

import java.awt.*;

public class GameConfig {

  public static final float SCALE = .65f;
  public static Color playerColor = new Color(77, 176, 100, 255);
  public static Color defaultTileColor = Color.WHITE;
  public static int commonFontSize = ((int) (20 * SCALE));
  public static char[] walkableUnits = { '.', ',' };
}
