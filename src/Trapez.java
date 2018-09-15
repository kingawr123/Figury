import java.util.Scanner;

public class Trapez implements Figura {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void obwód() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int obwód = obwód(a, b, c, d);
        System.out.println(obwód);
    }

    @Override
    public void pole() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        int pole = pole(a, b, h);
        System.out.println(pole);
    }

    private int obwód(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    private int pole(int a, int b, int h){
        return (a+b)*h/2;
    }
}
