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
        int istiKod=0;
        Artikl izbaci = new Artikl ();

        int vel=artikli.length-1;
        Artikl [] b = new Artikl [vel];

        for (int i=0; i<artikli.length; i=i+1) {
            int j=0;
            if (sifra.equals(artikli[i].getKod()))
                izbaci=artikli[i];
            if (!sifra.equals(artikli[i].getKod())) {
                b[j]=artikli[i];
                j++;
            }
        }
           artikli=null;
           Artikl [] artikli = Arrays.copyOf( b, b.length );
           return izbaci;
    }

    public Artikl [] getArtikli () { return artikli; }
}
