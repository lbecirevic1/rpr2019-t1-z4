package ba.unsa.etf.rpr;

public class Artikl {
     public String naziv = new String ();
     public String kod = new String ();
     public int cijena;

    public Artikl () {}
    public Artikl (String ime, int cij, String sifra) { Postavi(ime,cij,sifra); }
    public void Postavi (String naziv, int cijena, String kod) {
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
        //brojArtikala++;
    }

    public String getNaziv () {
        return naziv;
    }

    public String getKod () {
        return kod;
    }

    public int getCijena () {
        return cijena;
    }

}
