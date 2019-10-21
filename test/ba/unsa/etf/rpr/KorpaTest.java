package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    void daLiSeIspravnoDodajeArtiklUKorpu () {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "7"));
        Artikl [] artikli = supermarket.getArtikli();
        assertNotNull(artikli[0]);
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

    void daLiSeIspravnoIzbacujeArtikl () {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        Artikl [] artikli = supermarket.getArtikli();
        supermarket.izbaciArtiklSaKodom("1");
        assertTrue(artikli[0]==null);

    }

}




