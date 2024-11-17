package de.hwglu.bwi351_2.u06Liste.student;


public class ListeStudentTestprogramm {
  public static void main(String[] args) {
    Liste L = new Liste ();

    Student studi = new Student("Karla Karlson",4711);
    Student weitererStudi = new Student("Herbert Feuerstein",4712);

    L.einfuegenAnfang(studi);
    L.einfuegenAnfang(weitererStudi);

    int sucheigenschaft = 4712;

    if (L.suchen(sucheigenschaft) != null) {
      System.out.println(L.suchen(sucheigenschaft));
    }
    else
      System.out.println("Ein Student "+sucheigenschaft+" kommt nicht in der Liste vor");

  }
}