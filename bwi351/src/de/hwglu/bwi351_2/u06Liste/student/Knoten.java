package de.hwglu.bwi351_2.u06Liste.student;

public class Knoten {
  Student student;
  Knoten Nf;    //Nachfolger

  public Knoten(Student student, Knoten Nf) {
    this.student = student;
    this.Nf = Nf;
  }
}