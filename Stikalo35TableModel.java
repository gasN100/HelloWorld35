/**
 * Stikalo35TableModel.java
 *
 * Opis:
 * Razred za prikaz delovanja v GUI na primeru razredov poslovne logike Zatemnjen34 in Čas34.
 * Ta razred razširja DefaultTableModel in omogoča dodajanje objektov tipa Stikalo34 v tabelo.
 *
 * Avtor: Gašper Zdešar
 * Naloga 35 (GUI)
 */
import javax.swing.table.DefaultTableModel;

public class Stikalo35TableModel extends DefaultTableModel {

    public Stikalo35TableModel() {
        super();
        addColumn("Lokacija");
        addColumn("Tip");
        addColumn("Vklopljeno");
        addColumn("Intenzivnost");
        addColumn("Zatemnitev");
        addColumn("Časovnik");
    }

    public void addStikalo(Stikalo34 stikalo) {
        String tip = stikalo.getClass().getSimpleName();
        String vklopljeno = stikalo.jeVklopljeno() ? "Da" : "Ne";
        String intenzivnost = String.valueOf(stikalo.getIntenzivnost());
        String zatemnitev = stikalo instanceof Zatemnjen34 ? String.valueOf(((Zatemnjen34) stikalo).getZatemnitev()) : "n/a";
        String casovnik = stikalo instanceof Čas34 ? String.valueOf(((Čas34) stikalo).getCasDelovanja()) : "n/a";
        
        addRow(new Object[]{stikalo.getLokacija(), tip, vklopljeno, intenzivnost, zatemnitev, casovnik});
    }
}