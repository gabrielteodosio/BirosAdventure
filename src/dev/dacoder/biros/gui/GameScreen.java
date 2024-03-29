package dev.dacoder.biros.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import dev.dacoder.biros.utils.Keyboard;

@SuppressWarnings("serial")
public class GameScreen extends JPanel {

  public GameScreen() {
    super();
    this.setFocusable(true);
    this.addKeyListener(new Keyboard());
  }

  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    Graphics2D g2d = (Graphics2D) graphics;

    g2d.setColor(Color.BLACK);
    g2d.fillRect(0, 0, Window.WIDTH, Window.HEIGHT);

    Renderer.renderMap(g2d);
    Renderer.renderPlayer(g2d);

    repaint();
  }
}
