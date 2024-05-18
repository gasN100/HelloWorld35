/**
 * PivskaSteklenica.java
 *
 * Delo s pivskimi steklenicami
 */

/**
 * Javni razred, ki razširja  razred Steklenica in implementira vmesnik AlkoholnaPijaca
 *
 * @author Gašper Zdešar
 * @version Primer 19 (seznam objektov)
 
 */
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {

    // Vse lastnosti od naddrazreda se prenesejo
    // Deklariramo dodatne zasebne lastnosti, ki so značilne le za pivske steklenice
	private String znamka;
    private double temperatura;
	private double stopnjaAlkohola;

    // Statična lastnost, ki je enaka vsem pivskim steklenicam (vsem objektom razreda)
	private static String material = "Steklo"; // Vse pivske steklenice so steklene
	
    /**
     * Javni konstruktor za ustvarjanje novega objekta tipa/razreda PivskaSteklenica
     * @param k kapaciteta v milimetrih 
     */
    public PivskaSteklenica(String z, int k) {
		
		// Pokličemo drug konstruktor tega istega razreda
		this(z, k, 4.5);
    }
   
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda PivskaSteklenica
     * @param z Znamka piva
     * @param k Kapaciteta v milimetrih 
	 * @param s Stopnja alkohola 
     * @return Nova objekta tipa pivska steklenica
     */
	 	public PivskaSteklenica(String z, int k, double s) {
		
		// Pokličemo konstruktor nadrazreda
		super(k, "Pivo");
		
		// Inicializiram polja z dodatnimi lastnostmi podrazreda
		znamka = z;
		temperatura = 5.0;
	
		// Inicializiramo privzeto stopnjo alkohola
		stopnjaAlkohola = s;

		// Izpišemo podatke
		System.out.println("Pivska steklenica je  znamke "  + z);
		
	}
	

	/** Javna metoda, ki vrne stopnjo alkohola
	 * @return Stopnja alkohola
	 */
	public double getStopnjaAlkohola() {
	
		// Vrnemo stopnjo alkohola
		return stopnjaAlkohola;
	}
	

	/** Javna getter metoda, ki vrne znamko piva
	 * @return Znamka piva
	 */
	public String getZnamka() {
	
		// Vrnemo stopnjo alkohola
		return znamka;
	}
}	