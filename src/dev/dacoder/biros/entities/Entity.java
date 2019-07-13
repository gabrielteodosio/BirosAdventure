package dev.dacoder.biros.entities;

public class Entity {

  private String name;
  private char body;

  private int health;
  private int attack;
  private int defense;
  private int posX;
  private int posY;
  private int experience;

  private boolean isDead;
  private boolean isImmaterial;

  public Entity(String name, char body, int posX, int posY, int attack, int defense, int experience, int health) {
    this.name = name;
    this.posX = posX;
    this.posY = posY;
    this.attack = attack;
    this.defense = defense;
    this.experience = experience;
    this.body = body;
    this.health = health;

    this.isDead = false;
    this.isImmaterial = false;
  }

  public void setPosition(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }

  public void updatePosition(int posX, int posY) {
    if (this.posX + posX >= 0 && this.posY + posY >= 0) {
      this.posX += posX;
      this.posY += posY;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public char getBody() {
    return body;
  }

  public void setBody(char body) {
    this.body = body;
  }

  public boolean isDead() {
    return isDead;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }

  public boolean isImmaterial() {
    return isImmaterial;
  }

  public void setImmaterial(boolean immaterial) {
    isImmaterial = immaterial;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }
}
