package de.hwglu.bwi351_2.u05Rekursion;

public class P2Hanoi {

  static void bewege(int von, int nach) {
   System.out.println("Eine Scheibe von Stapel " + von + " nach Stapel " + nach);
  }

  static void hanoi(int groesse, int von, int nach, int arbber) {
      if (groesse < 1) return;
      hanoi(--groesse, von, arbber, nach);
      bewege(von, nach);
      hanoi(groesse, arbber, nach, von);
  }

  public static void main(String[] args) {
    hanoi(3,1,3,2);
  }
}