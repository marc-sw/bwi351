package de.hwglu.bwi351_2.u06Liste.student;

public class Liste {
  private Knoten anker;

  public Liste() {
    this.anker = null;
  }

  public void einfuegenAnfang (Student student) {
    this.anker = new Knoten(student, this.anker);
  }

  public Student suchen(int schluessel) {
    for (Knoten knoten = this.anker; knoten != null; knoten = knoten.naechsterKnoten) {
      if (schluessel == knoten.student.getNummer()) {
        return knoten.student;
      }
    }
      return null;
  }
}