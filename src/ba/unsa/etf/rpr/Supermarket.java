package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Supermarket {

    Artikl [] artikli = new Artikl [1000];

    public boolean dodajArtikl (Artikl a) {
        int i=0;
        while (artikli[i]!=null)
            i++;
        artikli[i]=a;
        return true;
    }
    public Artikl izbaciArtiklSaKodom (String sifra) {
        Artikl izbaci = new Artikl();
        int i = 0;
        while (artikli[i] != null) {

            if (sifra.equals(artikli[i].getKod())) {
                int j = i;
                izbaci = artikli[i];
                while (artikli[j + 1] != null) {
                    artikli[j] = artikli[j + 1];
                    j++;
                }

            }
            i++;
        }

        artikli[i - 1] = null;
        return izbaci;
    }

    public Artikl [] getArtikli () { return artikli; }
}
