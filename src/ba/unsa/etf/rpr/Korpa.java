package ba.unsa.etf.rpr;

public class Korpa {

    Artikl [] artikli = new Artikl[50];

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
    public int dajUkupnuCijenuArtikala () {
            int ukupnaCijena=0;
            for (int i=0; i<artikli.length; i=i+1) {
                if (artikli[i]!=null)
                ukupnaCijena=ukupnaCijena+artikli[i].cijena;
            }
            return ukupnaCijena;
        }
    public Artikl [] getArtikli () { return artikli; }

}
