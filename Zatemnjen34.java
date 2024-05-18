/**
 * Zatemnjen34.java
 *
 * Opis:
 * Podrazred Zatemnjen razširja razred Stikalo34 z dodatno funkcijo zatemnitve svetlobe.
 * Ta podrazred omogoča nastavitev zatemnitve svetlobe, ko je stikalo vklopljeno, zagotavljajoč dodatno
 * funkcionalnost in prilagodljivost.
 *
 * Avtor: Gašper Zdešar
 * Naloga 35
 */
public class Zatemnjen34 extends Stikalo34 {
    private int zatemnitev;

    public Zatemnjen34(String lokacija) {
        super(lokacija);
        this.zatemnitev = 0;
    }

    public void nastaviZatemnitev(int novaZatemnitev) {
        if (jeVklopljeno() && novaZatemnitev >= 0 && novaZatemnitev <= 100) {
            this.zatemnitev = novaZatemnitev;
        }
    }

    public int getZatemnitev() {
        return this.zatemnitev;
    }
}