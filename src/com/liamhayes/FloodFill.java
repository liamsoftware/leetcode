package com.liamhayes;

import java.util.Queue;
import java.util.LinkedList;

public class FloodFill {
  
  public static int[][] floodFill(int[][] img, int sr, int sc, int newColour) {
    int colour = img[sr][sc];
    if (colour != newColour) dfs(img, sr, sc, colour, newColour);
    return img;
  }
  
  public static void dfs(int[][] img, int r, int c, int colour, int newColour) {
    if (img[r][c] == colour) {
      img[r][c] = newColour;
      if (r >= 1) dfs(img, r-1, c, colour, newColour);
      if (c >= 1) dfs(img, r, c-1, colour, newColour);
      if (r+1 > img.length) dfs(img, r+1, c, colour, newColour);
      if (c+1 > img[0].length) dfs(img, r, c+1, colour, newColour);
    }
  }
}
