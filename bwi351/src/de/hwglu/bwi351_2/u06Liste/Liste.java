package de.hwglu.bwi351_2.u06Liste;

public class Liste {

  private Knoten anker;

  public void einfuegenAnfang (int Zahl) {
    this.anker = new Knoten (Zahl, this.anker);
  }

  public void einfuegenEnde (int Zahl) {
    if ( this.anker != null ) {
      Knoten k = this.anker;
      while ( k.Nf != null)
        k = k.Nf;
      k.Nf = new Knoten (Zahl, null);
    }
    else
      this.einfuegenAnfang(Zahl);
  }

  public boolean suchen(int schluessel) {
    for (Knoten current = this.anker; current != null; current = current.Nf) {
      if (schluessel == current.Zahl)
        return true;
    }
    return false;
  }

  public int max() {
    int result = Integer.MIN_VALUE;
    for (Knoten current = this.anker; current != null; current = current.Nf) {
      if (current.Zahl > result)
        result = current.Zahl;
    }
    return result;

  }
  public void loeschenAnfang() {
    if (this.anker != null) {
      this.anker = anker.Nf;
    }
    //asd
  }

}