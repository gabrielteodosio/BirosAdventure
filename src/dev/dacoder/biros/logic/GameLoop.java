package dev.dacoder.biros.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import dev.dacoder.biros.entities.Entity;
import dev.dacoder.biros.utils.Keyboard;
import dev.dacoder.biros.utils.Utils;

public class GameLoop implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    handlePlayerInput();
  }

  private void handlePlayerInput() {
    Entity player = GameLogic.getPlayer();

    if (Keyboard.isKeyDown(KeyEvent.VK_UP)) {
      if (Utils.canMoveTo(player, player.getPosX(), player.getPosY() - 1))
        GameLogic.getPlayer().updatePosition(0, -1);

    } else if (Keyboard.isKeyDown(KeyEvent.VK_DOWN)) {
      if (Utils.canMoveTo(player, player.getPosX(), player.getPosY() + 1))
        GameLogic.getPlayer().updatePosition(0, 1);

    } else if (Keyboard.isKeyDown(KeyEvent.VK_LEFT)) {
      if (Utils.canMoveTo(player, player.getPosX() - 1, player.getPosY()))
        GameLogic.getPlayer().updatePosition(-1, 0);

    } else if (Keyboard.isKeyDown(KeyEvent.VK_RIGHT)) {
      if (Utils.canMoveTo(player, player.getPosX() + 1, player.getPosY()))
        GameLogic.getPlayer().updatePosition(1, 0);

    }
  }
}
