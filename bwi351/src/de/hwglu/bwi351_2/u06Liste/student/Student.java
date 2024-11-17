package de.hwglu.bwi351_2.u06Liste.student;

public class Student {

  private String name;
  private int nummer;

// Namensgleichheit mit Klasse
// wird bei der Erzeugung des Objektes aufgerufen
  public Student(String name, int n) {
    this.name = name;
    this.nummer = n;
  }

  public String getName() {
    return this.name;
  }

  public int getNummer() {
    return this.nummer;
  }

   public String toString() {
    return this.name+"   "+this.nummer;
  }

}