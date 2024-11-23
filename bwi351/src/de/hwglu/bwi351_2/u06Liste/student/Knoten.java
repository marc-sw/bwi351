package de.hwglu.bwi351_2.u06Liste.student;

public class Knoten {

  Student student;
  Knoten naechsterKnoten;    //Nachfolger

  public Knoten(Student student, Knoten naechsterKnoten) {
    this.student = student;
    this.naechsterKnoten = naechsterKnoten;
  }
}