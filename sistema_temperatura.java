import java.util.Scanner;

public class sistema_temperatura {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        double c = s.nextDouble();
        double f = (c * 9/5) + 32;
        double k = c + 273.15;

        System.out.println(" Informe a temperatura em graus celseius para realizar a conversão. ");
        System.out.println("a temperatura em celsius(c°) é : " + c);
        System.out.println("a temperatura em fahreinheit(f°) é : " + f);
        System.out.println("a temperatura em kelvin(k°) é : " + k);

    }
}
