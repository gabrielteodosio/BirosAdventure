package dev.dacoder.biros.logic;

import dev.dacoder.biros.entities.Entity;
import dev.dacoder.biros.utils.Resources;

import javax.swing.*;

public class GameLogic {
  private static Timer timer;
  private static String currentMap = "map_01";
  private static int FPS = 10;

  private static Entity player;

  public static void initialize() {
    Resources.readFiles();

    player = new Entity("Gabriel Marques", '@', 2, 1, 10, 10, 0);

    timer = new Timer(1000 / FPS, new GameLoop());
    timer.start();
  }

  public static void updateMap(String map) {
    if (Resources.maps.keySet().contains(map)) {
      currentMap = map;
    }
  }

  public static String getCurrentMap() {
    return currentMap;
  }

  public static Entity getPlayer() {
    return player;
  }

  public static boolean isPlayerPosition(int lineIndex, int columnIndex) {
    return player.getPosY() == columnIndex && player.getPosX() == lineIndex;
  }

  public static boolean isWalkable(char unit) {
    for (char character : GameConfig.walkableUnits) {
      if (character == unit) {
        return true;
      }
    }

    return false;
  }
}
