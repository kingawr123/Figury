import java.util.Scanner;

public class Prostokąt implements Figura{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void obwód() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int obwód = obwód(a, b);
        System.out.println(obwód);
    }

    @Override
    public void pole() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int pole = pole(a, b);
        System.out.println(pole);
    }

    private int obwód(int a, int b) {
        return a + b;
    }

    private int pole(int a, int b){
        return 2*a + 2*b;
    }
}
