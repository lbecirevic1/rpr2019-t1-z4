package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Supermarket {

    Artikl [] artikli = new Artikl [1000];

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

    public Artikl [] getArtikli () { return artikli; }
}
