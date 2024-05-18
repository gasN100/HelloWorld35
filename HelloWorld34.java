/**
 * HelloWorld34.java
 *
 * Opis:
 * Program dodajanja vmesnika.
 * Uporabniki vnašajo imena stikal, program pa omogoča vklop/izklop in nastavitev svetilnosti.
 * Dodano je tudi upravljanje z zatemnitvijo in časovnikom za avtomatizirano izklop stikal.
 *
 * Avtor: Gašper Zdešar
 * Naloga 34 (Nadgrajeno z ArrayList)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HelloWorld34 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Stikalo34> stikala = new ArrayList<>();

        System.out.println("Vnesite ime za stikalo v kuhinji:");
        Čas34 kuhinja = new Čas34(reader.readLine());
        stikala.add(kuhinja);

        System.out.println("Vnesite ime za stikalo v dnevni sobi:");
        Zatemnjen34 dnevnaSoba = new Zatemnjen34(reader.readLine());
        stikala.add(dnevnaSoba);

        System.out.println("Vnesite ime za stikalo v spalnici:");
        Stikalo34 spalnica = new Stikalo34(reader.readLine());
        stikala.add(spalnica);

        kuhinja.vklopi();
        dnevnaSoba.vklopi();
        spalnica.vklopi();

        try {
            System.out.println("Vnesite intenzivnost svetlobe v dnevni sobi (0-100):");
            dnevnaSoba.spremeniIntenzivnost(Integer.parseInt(reader.readLine()));
            System.out.println("Vnesite zatemnitev za dnevno sobo (0-100):");
            dnevnaSoba.nastaviZatemnitev(Integer.parseInt(reader.readLine()));
        } catch (NumberFormatException e) {
            System.out.println("Neveljaven vnos. Prosim, vnesite število med 0 in 100.");
        }

        kuhinja.izklopi();
        kuhinja.nastaviTimer(30);

        System.out.println("Stikalo v spalnici je " + (spalnica.jeVklopljeno() ? "vklopljeno." : "izklopljeno."));
        System.out.println("Vsa stikala:");
        for (Stikalo34 s : stikala) {
            System.out.println(s.getLokacija() + " - " + (s.jeVklopljeno() ? "vklopljeno" : "izklopljeno") + ", intenzivnost: " + s.getIntenzivnost() + ", zatemnitev: " + (s instanceof Zatemnjen34 ? ((Zatemnjen34)s).getZatemnitev() + "%" : "n/a") + ", časovnik: " + (s instanceof Čas34 ? ((Čas34)s).getCasDelovanja() + " min" : "n/a"));
        }
    }
}