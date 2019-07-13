package dev.dacoder.biros.logic;

import dev.dacoder.biros.entities.Entity;
import dev.dacoder.biros.utils.Keyboard;
import dev.dacoder.biros.utils.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GameLoop implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    handlePlayerInput();
  }

  private void handlePlayerInput() {
    Entity player = GameLogic.getPlayer();

    if (Keyboard.isKeyDown(KeyEvent.VK_UP)) {
      Utils.getPositionOnMap(player.getPosX(), player.getPosY() - 1);
      GameLogic.getPlayer().updatePosition(0, -1);
    } else if (Keyboard.isKeyDown(KeyEvent.VK_DOWN)) {
      GameLogic.getPlayer().updatePosition(0, 1);
    } else if (Keyboard.isKeyDown(KeyEvent.VK_LEFT)) {
      GameLogic.getPlayer().updatePosition(-1, 0);
    } else if (Keyboard.isKeyDown(KeyEvent.VK_RIGHT)) {
      GameLogic.getPlayer().updatePosition(1, 0);
    }
  }
}
