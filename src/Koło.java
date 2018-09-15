import java.util.Scanner;

public class Koło implements Figura{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void obwód() {

        System.out.println("Podaj promień:");
        int r = scanner.nextInt();

        double obwód = obwód(r);
        System.out.println(obwód);
    }

    @Override
    public void pole() {
        System.out.println("Podaj promień:");
        int r = scanner.nextInt();

        double pole = pole(r);
        System.out.println(pole);
    }

    private double obwód(int r) {
        return Math.PI*r*2;
    }

    private double pole(int r){
        return Math.pow(r,2)*Math.PI;
    }
}
