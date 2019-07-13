package dev.dacoder.biros.utils;

import dev.dacoder.biros.entities.Entity;
import dev.dacoder.biros.logic.GameConfig;
import dev.dacoder.biros.logic.GameLogic;

public class Utils {

  public static char getPositionOnMap(int x, int y) {
    char[][] map = Resources.maps.get(GameLogic.getCurrentMap());
    System.out.println(map[y][x]);
    return map[y][x];
  }

  public static boolean canMoveTo(Entity entity, int x, int y) {
    if (entity.isDead())
      return false;

    if (!entity.isDead()) {
      if (!entity.isImmaterial()) {
        for (int i = 0; i < GameConfig.walkableUnits.length; i++) {
          if (Resources.maps.get(GameLogic.getCurrentMap())[y][x] == GameConfig.walkableUnits[i]) {
            return false;
          }
        }
      }
    }

    return true;
  }
}
