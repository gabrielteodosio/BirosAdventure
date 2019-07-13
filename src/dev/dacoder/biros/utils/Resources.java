package dev.dacoder.biros.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Resources {

  public static HashMap<String, char[][]> maps = new HashMap<>();
  private static final File mapsFolder = new File("assets/maps");

  public static void readFiles() {
    if (mapsFolder.exists() && mapsFolder.isDirectory()) {
      for (File file : Objects.requireNonNull(mapsFolder.listFiles())) {
        loadMapFromFile(file);
      }
    }
  }

  public static void reloadMap(String mapName) {
    if (mapsFolder.exists() && mapsFolder.isDirectory()) {
      for (File file : Objects.requireNonNull(mapsFolder.listFiles())) {
        if (file.getName().replaceAll(".txt", "").equals(mapName)) {
          loadMapFromFile(file);
        }
      }
    }
  }

  private static void loadMapFromFile(File file) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      List<String> lines = br.lines().collect(Collectors.toList());
      char[][] mapData = new char[lines.size()][];

      for (int x = 0; x < lines.size(); x++) {
        mapData[x] = lines.get(x).toCharArray();
      }

      br.close();
      maps.put(file.getName().replaceAll(".txt", ""), mapData);
    } catch (IOException e) {
      System.err.println("[Utils][ResourceManager]: Exception reading " + file.getName());
    }
  }
}
