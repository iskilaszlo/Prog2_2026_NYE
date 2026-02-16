import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //A változók elnevezése kisbetűs
        //A nyelv case-sensitive!
        //int szam = 123;
        //int szam = 0x123;
        int szam = 0123;

        //Literálok:
        // Számrendszerek: 0x 16-os számrendszer, bevezető 0: 8-as számrendszer
        System.out.println("A szám értéke: " + szam);

        //A szám mögötti f: float típusú, enélkül double típus
        float pi = 3.1415f;
        System.out.println("Pi = " + pi);

        double pi2 = 3.1415;
        System.out.println("Pi2 = " + pi2);

        double tort = 45.7e3;
        System.out.println("Tört = " + tort);

        char karakter = '\u0041';
        System.out.println("Karakter = " + karakter);
        String szoveg = "barackpálinka";
        System.out.println("Szöveg: " + szoveg.substring(0,6));
        boolean flag = true;
        if (flag) {
            System.out.println("Igaz a flag értéke");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        szam = input.nextInt();
        System.out.println("A szám:" + szam);
        System.out.println("Adj meg egy szöveget: " + szoveg);
        szam = input.nextInt();
        System.out.println("A kapott szöveg: "+ szoveg);




    }
}
