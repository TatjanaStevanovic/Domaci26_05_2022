package Domaci26_05_;

public class KlasicnoPitanje extends Pitanje{

    String odgovorNaPitanje;

    public KlasicnoPitanje(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena,
                           boolean pitanjePregledano, String odgovorNaPitanje) {
        super(tekstPitanja, brojMaxPoena, osvojenBrojPoena, pitanjePregledano);
        this.odgovorNaPitanje = odgovorNaPitanje;
    }
}
