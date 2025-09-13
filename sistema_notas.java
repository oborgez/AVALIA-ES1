import java.util.Scanner;

public class sistema_notas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" informe a primeira nota : ");

        double n1 = s.nextDouble();
        System.out.println(" informe a segunda nota : ");
        double n2 = s.nextDouble();
       System.out.println(" informe a terceira nota : ");
        double n3 = s.nextDouble();
        System.out.println("informe a quarta nota : ");
        double n4 = s.nextDouble();
       System.out.println(" informe a quinta nota : ");
        double n5 = s.nextDouble();
        System.out.println(" informe a sexta nota : ");
        double n6 = s.nextDouble();
        System.out.println(" informe a setima nota : ");
        double n7 = s.nextDouble();
       System.out.println(" informe a oitava nota : ");
       double n8 = s.nextDouble();

        double b1 = (n1 + n2) /2;
       double b2 = (n3 + n4) / 2;
        double b3 = (n5 + n6) / 2;
       double b4 = (n7 + n8) / 2;

        double s1 = (b1 + b2) / 2;
       double s2 = (b3 + b4) / 2;

        double nfinal = (s1 + s2) / 2;

        System.out.println(" media bimestral 1 : " + b1);
       System.out.println(" media bimestral 2 : " + b2);
       System.out.println(" media bimestral 3 : " + b3);
       System.out.println(" media bimestral 4 : " + b4);
       System.out.println(" media semestral 1 : " + s1);
       System.out.println(" media semestral 2 : " + s2);
       System.out.println(" media final : " + nfinal);
    }
}
