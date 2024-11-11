import java.util.ArrayList;
import java.util.List;

/**
 * Třída Sprýva pojištěncu
 * umožnuje přidání, zobrazení, zprávu pojištěncu
 */
    public class SpravaPojistencu {
        private List<Pojistenec> pojistenci;

    /**
     *Konstruktor provede zapnutí prázdný seznam pojištěnců.
     */
        public SpravaPojistencu() {
            this.pojistenci = new ArrayList<>();
        }

    /**
     * přidá nového pojištěnce
     * @param jmeno přidá jméno
     * @param prijmeni přidá přijmení
     * @param vek přidá věk
     * @param telefon přidá telefoní číslo
     */
        public void pridatPojistence(String jmeno, String prijmeni, int vek, String telefon) {
            Pojistenec novyPojistenec = new Pojistenec(jmeno, prijmeni, vek, telefon);
            pojistenci.add(novyPojistenec);
            System.out.println("Pojistenec byl úspěšně přidán.");
        }

    /**
     * zobrazí všechny pojištence v seznamu
     */
        public void zobrazitVsechnyPojistence() {
            if (pojistenci.isEmpty()) {
                System.out.println("Žádní pojištěnci nejsou evidováni.");
            } else {
                for (Pojistenec pojistenec : pojistenci) {
                    System.out.println(pojistenec);
                }
            }
        }

    /**
     *  zobrazí pojištence podle jména a příjmení
     * @param jmeno  hledané jméno
     * @param prijmeni hledané příjmení
     */
        public void vyhledatPojistence(String jmeno, String prijmeni) {
            boolean nalezen = false;
            for (Pojistenec pojistenec : pojistenci) {
                if (pojistenec.getJmeno().equalsIgnoreCase(jmeno) && pojistenec.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                    System.out.println("Nalezený pojištěnec: " + pojistenec);
                    nalezen = true;
                    break;
                }
            }
            if (!nalezen) {
                System.out.println("Pojištěnec s uvedeným jménem a příjmením nebyl nalezen.");
            }
        }
    }

