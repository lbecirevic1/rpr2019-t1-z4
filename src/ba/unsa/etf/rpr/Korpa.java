package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Korpa {

    Artikl [] artikli = new Artikl[50];

    public boolean dodajArtikl (Artikl a) {
            int i=0;
            while (artikli[i]!=null)
                i++;
            //a.brojArtikala++;
        artikli[i]=a;
        return true;
    }
    public Artikl izbaciArtiklSaKodom (String sifra) {
        Artikl izbaci = new Artikl ();
        Petlja1: for (int i=0; i<artikli.length; i=i+1) {
            int brojac=0;
            if (sifra.equals(artikli[i].getKod()))
                izbaci=artikli[i];
            if (!sifra.equals(artikli[i].getKod())) {
         Petlja2:   for (int j = i; j<artikli.length-1; j=j+1) {
                    if (artikli[j]!=null) {
                        Artikl temp = artikli[j];
                        artikli[j] = artikli[j + 1];
                        artikli[j + 1] = temp;
                    }
                    if (artikli[j]==null) {
                        brojac=1;
                        break Petlja2;
                    }
                }
                if (brojac==1)
                    break Petlja1;
            }
        }
       // artikli=null;
       // Artikl [] artikli = Arrays.copyOf( b, b.length );
        return izbaci;
    }

    public int dajUkupnuCijenuArtikala () {
            int ukupnaCijena=0;
            for (int i=0; i<artikli.length-1; i=i+1) {
                if (artikli[i]!=null)
                ukupnaCijena=ukupnaCijena+artikli[i].cijena;
            }
            return ukupnaCijena;
        }
    public Artikl [] getArtikli () { return artikli; }

}
