import java.util.Scanner;

public class masodikora2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ido = -1;

        while (ido < 0) {
            System.out.print("Hány másodperc telt el a villám és a dörgés között? ");
            ido = input.nextDouble();
        }

        System.out.println("Távolság: " + (ido * 300) + " m");

        input.close();
    }
}
