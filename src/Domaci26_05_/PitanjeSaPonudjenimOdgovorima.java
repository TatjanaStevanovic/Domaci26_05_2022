package Domaci26_05_;

public class PitanjeSaPonudjenimOdgovorima extends Pitanje{
/*
● String odgovorA
● String odgovorB
● String odgovorC
● String odgovorD
● String tacanOdgovor // identican sa jednim od prijasnih odgovora*/

    String odgovorA;
    String odgovorB;
    String odgovorC;
    String odgovorD;
    String tacanOdgovor;

    public PitanjeSaPonudjenimOdgovorima(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena,
                                         boolean pitanjePregledano, String odgovorA, String odgovorB,
                                         String odgovorC, String odgovorD, String tacanOdgovor) {
        super(tekstPitanja, brojMaxPoena, osvojenBrojPoena, pitanjePregledano);
        this.odgovorA = odgovorA;
        this.odgovorB = odgovorB;
        this.odgovorC = odgovorC;
        this.odgovorD = odgovorD;
        this.tacanOdgovor = tacanOdgovor;

    }
}
