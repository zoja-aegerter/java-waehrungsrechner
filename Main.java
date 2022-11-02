import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // WährungsRechner

        // 4. Scanner hinzufügen
        Scanner scan = new Scanner(System.in);

        // 7. User informieren
        System.out.println("Bitte einen Betrag eingeben");

        // 5. Eine Variable erstellen, wo diese Eingabe gespeichert wird
        double money = scan.nextDouble();

        // 1. Eine Variable erstellen
        // 6. löschen: double money = 10.50;

        // 3. Methode aufrufen mit dem Parameter
        convertToDollars(money);
        convertToFranks(money);

    }

    // 2. Eine Methode erstellen
    public static void convertToDollars(double eur) {
        System.out.println("Der Betrag in Dollar ist: " + eur * 1.20);
    }

    public static void convertToFranks(double franks) {
        System.out.println("Der Betrag in Franken ist: " + franks * 1.01);
    }
}