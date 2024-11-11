/**
 * Třída  pojištěnce.
 * Uchovává  jménu, příjmení, věku a telefonním čísle.
 */
public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    /**
     * Konstruktor pro vytvoření instance pojištěnce.
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefon
     */
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * Vrací jméno
     * @return jméno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * vrací příjmení
     * @return příjmení
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrací text o pojištenci
     * @return informace o pojištěnci
     */
    @Override
    public String toString() {
        return "Pojistenec: " + jmeno + " " + prijmeni + ", Věk: " + vek + ", Telefon: " + telefon;
    }
}
