package dev.dacoder.biros.utils;

import dev.dacoder.biros.entities.Entity;
import dev.dacoder.biros.logic.GameConfig;
import dev.dacoder.biros.logic.GameLogic;

public class Utils {

  public static char getPositionOnMap(int x, int y) {
    char[][] map = Resources.maps.get(GameLogic.getCurrentMap());
    return map[y][x];
  }

  public static boolean canMoveTo(Entity entity, int x, int y) {
    for (int i = 0; i < GameConfig.walkableUnits.length; i++) {
      if (getPositionOnMap(x, y) == GameConfig.walkableUnits[i]) {
        return true;
      }
    }
    return false;
  }
}
