import java.util.Scanner;

public class masodik_ora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kérem az aktuális hőmérsékletet (°C): ");
        int homerseklet = input.nextInt();

        if (homerseklet < 0) {
            System.out.println("Fagypont alatti");
        } else if (homerseklet < 30) {
            System.out.println("Átlagos");
        } else {
            System.out.println("Túl meleg");
        }
    }
}

