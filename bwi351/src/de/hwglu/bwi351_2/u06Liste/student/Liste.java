package de.hwglu.bwi351_2.u06Liste.student;

public class Liste {
  private Knoten anker;

  public Liste() {
    this.anker = null;
  }

  public void einfuegenAnfang (Student student) {
    this.anker = new Knoten(student, this.anker);
  }

  public void einfuegenEnde(Student student) {
    if ( this.anker != null ) {
      Knoten k = this.anker;
      while ( k.Nf != null)
        k = k.Nf;
      k.Nf = new Knoten (student, null);
    }
    else
      this.einfuegenAnfang(student);
  }

  public Student suchen(int schluessel) {
    for (Knoten current = this.anker; current != null; current = current.Nf) {
      if (schluessel == current.student.getNummer()) {
        return current.student;
      }
    }
      return null;
  }

  public int max() {
    int result = Integer.MIN_VALUE;
    for (Knoten current = this.anker; current != null; current = current.Nf) {
      result = Math.max(result, current.student.getNummer());
    }
    return result;

  }
  public void loeschenAnfang() {
    if (this.anker != null) {
      this.anker = anker.Nf;
    }
  }

}