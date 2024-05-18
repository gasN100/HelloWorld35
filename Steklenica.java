/**
 * Steklenica.java
 *
 * Opis:
 * Delo s steklenicami
 *
 * @author Gašper Zdešar
 * @version Primer 19 (seznam objektov)
 */

/**
 * Javni razred za prikaz dela z razredi in objekti
 */
public class Steklenica  {
	
	// Deklariramo lastnosti steklenice
	private int kapaciteta; // v mililitrih
	private boolean jeOdprta;
	private String vrstaVsebine;
	private int kolicinaVsebine; // v mililitrih
	


	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda Steklenica
	* @param k Kapaciteta steklenice
	* @param v Vrsta vsebine steklenice
	*/
	public Steklenica(int k, String v) {
			
		// Inicializiramo lastnosti
		kapaciteta = k;
		jeOdprta = false;
		vrstaVsebine = v;
		kolicinaVsebine = k;
		
		// Izpišemo podatke
		System.out.println("Ustvarjam objekt tipa Steklenica kapacitete " + k + " z vsebino " + v);
	}	
   /** Javna metoda, ki izprazni vsebino iz steklenice
	* @param k Količina, ki jo želimo izpraznit
	* @return Vsebina steklenice
	*/
	public String izprazni(int k) throws Exception {
		
		// Če je steklenica odprta
		if(jeOdprta) {
			
			// Zmanjšamo količino vsebine za iztočeno količino
			System.out.println("Količina pred praznenjem: " + kolicinaVsebine);
			kolicinaVsebine = kolicinaVsebine - k;
			System.out.println("Količina po praznenju: " + kolicinaVsebine);
			
			// Vrnemo vrsto vsebine
			return vrstaVsebine;
		}
		// Če je steklenica zaprta, vrže izjemo
		else {
			throw new Exception("Ne morem izprazniti steklenice, ker je zaprta. ");
		
		
		}
	
	}
	/** Javna metoda, ki odpre steklenico
	* @param Vrne true,  ali false
	*/
	public boolean odpri() {
	
		// Če je steklenica že odprta
		if(jeOdprta) {
			
			
			// Vrnemo false  (ker je bila že odprta)
			return false;
		}
		// Če je steklenica zaprta
		else {
			
			// Spremenimo lastnost (jo odpremo)
			jeOdprta = true;
			
			// Vrnemo true (ker je bilo odpiranje uspešno)
			return true;
		
		}
	
	}
	
	/** Javna metoda, ki vrne količino vsebine
	* @param Vrne količino vsebine steklenice
	*/
	public int getKolicinaVsebine() {
	
			
			// Vrnemo količino vsebine
			return kolicinaVsebine;
		
		}
	
	}
		