package dev.dacoder.biros.utils;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
  private static boolean[] keys = new boolean[100];

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() < keys.length) {
      keys[e.getKeyCode()] = true;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() < keys.length) {
      keys[e.getKeyCode()] = false;
    }
  }

  public static boolean isKeyDown(int key) {
    if (key < keys.length) {
      return keys[key];
    }
    return false;
  }
}
