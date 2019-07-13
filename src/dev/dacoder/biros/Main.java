package dev.dacoder.biros;

import dev.dacoder.biros.gui.Window;
import dev.dacoder.biros.logic.GameLogic;

public class Main {

  public static void main(String[] args) {
    System.out.println("[Main]: Starting...");
    final String GAME_WINDOW_TITLE = "Biro's Adventure";

    Window.createWindow(GAME_WINDOW_TITLE);
    Window.setVisible();
    GameLogic.initialize();

    System.out.println("[Main]: Started!");
  }
}
