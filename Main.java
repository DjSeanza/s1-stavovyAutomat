import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Patrik Ištvanko
 * Date: 20. 11. 2021
 * Time: 17:16
 */
public class Main {

    public static void main(String[] args) {
        Stav stavy = new Stav();
        Scanner scanner = new Scanner(System.in);

        stavy.vypis();
        System.out.println("Ak si prajete skončiť do vstupu zadajte exit.");
        System.out.print("Zadajte vstup: ");
        String vstup = scanner.next();

        while (!vstup.equals("exit")) {
            stavy.zmenaStavu(vstup);
            stavy.vypis();
            System.out.println("Ak si prajete skončiť do vstupu zadajte exit.");
            System.out.print("Zadajte vstup: ");
            vstup = scanner.next();
        }
    }
}
