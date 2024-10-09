package de.hwglu.bwi351_2.u03Suchen;

public class BinaereSuche {

  public static void main(String[] args) {
    int[] folge = { 0, 1, 2, 4, 5, 8, 9, 12, 13, 18};
    int sucheigenschaft = 9;
    System.out.println(binarySearch(folge, sucheigenschaft));
  }

  public static int binarySearch(int[] folge, int sucheigenschaft) {
    int resultat = -1;
    int unter = 0;
    int ober = folge.length - 1;
    int mitte;

    while (unter <= ober && resultat == -1){
      mitte = unter + (ober - unter) / 2;
      if (folge[mitte] < sucheigenschaft) {
        unter = mitte + 1;
      } else if (folge[mitte] > sucheigenschaft) {
        ober = mitte - 1;
      } else {
        resultat = mitte;
      }
    }

    return resultat;
  }
}