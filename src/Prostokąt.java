import java.util.Scanner;

public class Prostokąt implements Figura{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void obwód() {
        System.out.println("Podaj 2 boki:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int obwód = obwód(a, b);
        System.out.println(obwód);
    }

    @Override
    public void pole() {
        System.out.println("Podaj 2 boki:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int pole = pole(a, b);
        System.out.println(pole);
    }

    private int obwód(int a, int b) {
        return 2*a + 2*b;
    }

    private int pole(int a, int b){
        return a*b;
    }
}
