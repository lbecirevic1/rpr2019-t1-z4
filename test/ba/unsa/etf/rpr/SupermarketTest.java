package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;


class SupermarketTest {
    void daLiSeIspravnoDodajeArtikl () {
        Supermarket supermarket = new Supermarket ();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        Artikl [] artikli = supermarket.getArtikli();
        assertTrue(artikli[0]!=null);
    }

    void daLiSeIspravnoIzbacujeArtikl () {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        Artikl [] artikli = supermarket.getArtikli();
        supermarket.izbaciArtiklSaKodom("1");
        assertTrue(artikli[0]==null);
    }


    void daLiPrekoracuje () {
        assertDoesNotThrow(() -> {
                    Supermarket supermarket = new Supermarket();

                    for (int i = 0; i < 500; i++) {
                        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "7"));
                    }

                }
        );
    }
}

