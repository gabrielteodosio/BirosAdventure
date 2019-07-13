package dev.dacoder.biros.gui;

import dev.dacoder.biros.logic.GameConfig;
import dev.dacoder.biros.logic.GameLogic;
import dev.dacoder.biros.utils.Resources;

import java.awt.*;

public class Renderer {

  public static void renderMap(Graphics2D g2d) {
    char[][] mapTiles = Resources.maps.get(GameLogic.getCurrentMap());

    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g2d.setColor(GameConfig.defaultTileColor);
    g2d.setFont(new Font("Courier", Font.PLAIN, GameConfig.commonFontSize));

    if (mapTiles != null && mapTiles.length > 0) {
      for (int lineIndex = 0; lineIndex < mapTiles.length; lineIndex++) {
        int currentRowIndex = GameConfig.commonFontSize * (lineIndex + 1);

        for (int characterColumn = 0; characterColumn < mapTiles[lineIndex].length; characterColumn++) {
          int currentColumnIndex = GameConfig.commonFontSize * (characterColumn + 1);
          g2d.drawString(String.valueOf(mapTiles[lineIndex][characterColumn]), currentColumnIndex, currentRowIndex);
        }
      }
    }
  }

  public static void renderPlayer(Graphics2D g2d) {
    char[][] mapTiles = Resources.maps.get(GameLogic.getCurrentMap());
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    if (mapTiles != null && mapTiles.length > 0) {
      for (int lineIndex = 0; lineIndex < mapTiles.length; lineIndex++) {
        int currentLineIndex = GameConfig.commonFontSize * (lineIndex + 1);

        for (int columnIndex = 0; columnIndex < mapTiles[lineIndex].length; columnIndex++) {
          int currentColumnIndex = GameConfig.commonFontSize * (columnIndex + 1);

          if (GameLogic.isPlayerPosition(columnIndex, lineIndex)) {
            g2d.setColor(Color.BLACK);
            g2d.fillRect(currentColumnIndex - 2, currentLineIndex - 10, GameConfig.commonFontSize, GameConfig.commonFontSize);

            g2d.setColor(GameConfig.playerColor);
            g2d.setFont(new Font("Courier", Font.PLAIN, GameConfig.commonFontSize));
            g2d.drawString(String.valueOf(GameLogic.getPlayer().getBody()), currentColumnIndex, currentLineIndex); // string, x, y
          }
        }
      }
    }
  }
}
