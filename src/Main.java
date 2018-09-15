import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Figura figura  = null;

        System.out.println("Jaką figure wybierasz? PROSTOKĄT = 'P', KOŁO = 'K', TRAPEZ = 'T'");
        String wybórFigury = scanner.nextLine().trim().toLowerCase();
        switch (wybórFigury) {
            case "p":
                figura = new Prostokąt();
                break;
            case "k":
                figura = new Koło();
                break;
            case "t":
                figura = new Trapez();
                break;
            default:
                System.out.println("Jesteś idiotą");
        }

        System.out.println("Chcesz liczyć obwód czy pole? OBWÓD = 'O', POLE = 'P'");
        String wybórDziałania = scanner.nextLine().trim().toLowerCase();

        if (wybórDziałania.equals("o")) figura.obwód();
        else if (wybórDziałania.equals("p")) figura.pole();
        else System.out.println("Jesteś idiotą");
    }
}
