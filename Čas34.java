/**
 * Čas34.java
 *
 * Opis:
 * Podrazred Čas razširi osnovno funkcionalnost razreda Stikalo34 z možnostjo nastavljanja časovnika.
 * Ta podrazred omogoča avtomatski izklop stikala po preteku nastavljenega časa, kar poveča njegovo funkcionalnost
 * in uporabnost v avtomatiziranih sistemih.
 *
 * Avtor: Gašper Zdešar
 * Naloga 35
 */
public class Čas34 extends Stikalo34 {
    private int casDelovanja;

    public Čas34(String lokacija) {
        super(lokacija);
        this.casDelovanja = 0;
    }

    public void nastaviTimer(int casDelovanja) {
        if (casDelovanja >= 0) {
            this.casDelovanja = casDelovanja;
        }
    }

    public int getCasDelovanja() {
        return this.casDelovanja;
    }
}