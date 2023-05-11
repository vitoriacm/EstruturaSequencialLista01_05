import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o Metro");
        double metro = teclado.nextDouble();

        teclado.close();

        double Centimetros = metro * 100;

        System.out.printf("A quantidade %.1f em metros convertida para centimetro é de %.1f", metro, Centimetros);

    }
}
