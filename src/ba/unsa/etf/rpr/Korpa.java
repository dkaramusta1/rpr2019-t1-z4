package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private static int index = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public boolean dodajArtikl(Artikl artikl) {
        if(index < artikli.length) {
            this.artikli[index] = artikl;
            index = index + 1;
            return true;
        }
        return  false;
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

    public int dajUkupnuCijenuArtikala() {
        int total = 0;
        for(int i = 0; i < index; i++){
            total = total + artikli[i].getCijena();
        }
        return total;
    }
}
