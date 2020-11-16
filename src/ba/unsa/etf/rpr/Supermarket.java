package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private static int index = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public void dodajArtikl(Artikl artikl) {
        this.artikli[index] = artikl;
        index = index + 1;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni = null;
        for(int i = 0; i < index; i++){
            if(this.artikli[i].getKod().equals(kod)){
                String naziv = this.artikli[i].getNaziv();
                int cijena = this.artikli[i].getCijena();
                String code = this.artikli[i].getKod();
                izbaceni = new Artikl(naziv,cijena,code);
                this.artikli[i] = null;
                index = index - 1;
                break;
            }
        }
        return izbaceni;
    }
}
