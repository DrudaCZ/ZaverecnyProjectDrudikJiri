import java.util.Scanner;

/**
 *  hlavní čast aplikace slouží pro evidenci pojištencu
 *  obsahuje rozhrani pro uživatele
 */
    public class Main {
        public static void main(String[] args) {
            SpravaPojistencu sprava = new SpravaPojistencu();
            Scanner scanner = new Scanner(System.in);
            int volba;
/**
 * příkazy co se objevi 1 když spusti aplikaci
 */
            do {
                System.out.println("\n====== Správa pojištěnců ======");
                System.out.println("1. Přidat nového pojištěnce");
                System.out.println("2. Zobrazit všechny pojištěnce");
                System.out.println("3. Vyhledat pojištěnce");
                System.out.println("4. Konec");
                System.out.print("Zadejte svou volbu: ");
                volba = scanner.nextInt();
                scanner.nextLine(); // Vyčištění vstupu
/**
 *  zadavani pojistencu a jejich osobnich udaju do sistemu
 */
                switch (volba) {
                    case 1:
                        System.out.print("Zadejte jméno: ");
                        String jmeno = scanner.nextLine();
                        System.out.print("Zadejte příjmení: ");
                        String prijmeni = scanner.nextLine();
                        System.out.print("Zadejte věk: ");
                        int vek = scanner.nextInt();
                        scanner.nextLine(); // Vyčištění vstupu
                        System.out.print("Zadejte telefonní číslo: ");
                        String telefon = scanner.nextLine();
                        sprava.pridatPojistence(jmeno, prijmeni, vek, telefon);
                        break;
                    case 2:
                        sprava.zobrazitVsechnyPojistence();
                        break;
                    case 3:
                        System.out.print("Zadejte jméno: ");
                        String hledaneJmeno = scanner.nextLine();
                        System.out.print("Zadejte příjmení: ");
                        String hledanePrijmeni = scanner.nextLine();
                        sprava.vyhledatPojistence(hledaneJmeno, hledanePrijmeni);
                        break;
                    case 4:
                        System.out.println("Ukončuji aplikaci.");
                        break;
                    default:
                        System.out.println("Neplatná volba, zkuste to znovu.");
                }
            } while (volba != 4);

            scanner.close();
        }
    }

