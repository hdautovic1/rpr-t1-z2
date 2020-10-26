package ba.unsa.etf.rpr.tutorijal1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite proizvoljan broj: ");
        int n = ulaz.nextInt();

    }
    public static int sumaCifara(int n) {
        int suma=0;
     while(n != 0){
       int cifra=n%10;
       n=n/10;
       suma = suma + cifra;
     }
     return  suma;
    }
}
