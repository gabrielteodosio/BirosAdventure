package dev.dacoder.biros.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

import dev.dacoder.biros.utils.Keyboard;

public class Window {

  private static JFrame window;
  public static final int WIDTH = 960;
  public static final int HEIGHT = 800;
  public static final int ZOOM = 1;

  public static void createWindow(String title) {
    window = new JFrame(title);

    window.setSize(new Dimension(WIDTH * ZOOM, HEIGHT * ZOOM));
    window.setPreferredSize(new Dimension(WIDTH * ZOOM, HEIGHT * ZOOM));
    window.setMinimumSize(new Dimension(WIDTH * ZOOM, HEIGHT * ZOOM));
    window.setMaximumSize(new Dimension(WIDTH * ZOOM, HEIGHT * ZOOM));
    window.setResizable(false);
    window.setLocationRelativeTo(null);

    window.add(new GameScreen());
    window.addKeyListener(new Keyboard());

    System.out.println("[Gui][DisplayManager]: Created Window");
  }

  public static void setVisible() {
    if (window != null) window.setVisible(true);
    System.out.println("[Gui][DisplayManager]: Window set to visible");
  }

}
