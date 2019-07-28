package SegmentTree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SegmentXenia {
 public static void main(String[] args) throws IOException {
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  String[]s=in.readLine().split(" ");
  int n = Integer.parseInt(s[0]);
  int m = Integer.parseInt(s[1]);
  int total = 1 << n;
  ArrayList<Integer>[] list = new ArrayList[n + 1];
  for (int i = 0; i < n + 1; i++)
   list[i] = new ArrayList<Integer>();
  s=in.readLine().split(" ");
  for (int i = 0; i < total; i++)
   list[0].add(Integer.parseInt(s[i]));
  for (int i = 0; i < n; i++) {
   for (int j = 0; j < list[i].size(); j += 2) {
    int temp = list[i].get(j) | list[i].get(j + 1);
    if (i % 2 == 1)
     temp = list[i].get(j) ^ list[i].get(j + 1);
    list[i + 1].add(temp);
   }
  }
  for (int i = 0; i < m; i++) {
   s=in.readLine().split(" ");
   int pos = Integer.parseInt(s[0]) - 1;
   int value = Integer.parseInt(s[1]);
   int level = 0;
   list[0].set(pos, value);
   while (level < n) {
    if (pos % 2 == 0) {
     if (level % 2 == 0)
      value |= list[level].get(pos + 1);
     else
      value ^= list[level].get(pos + 1);
    } else {
     if (level % 2 == 0)
      value |= list[level].get(pos - 1);
     else
      value ^= list[level].get(pos - 1);
    }
    pos /= 2;
    level++;
    list[level].set(pos, value);
   }
   System.out.println(value);
  }
 }
}
