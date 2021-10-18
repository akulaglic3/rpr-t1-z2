package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj){
        int suma=0;
        while(broj!=0)
        {
            suma=suma+broj%10;
            broj=broj/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Unesite prirodan broj: ");
        Scanner ulaz= new Scanner(System.in);
        n=ulaz.nextInt();
        System.out.println("Svi brojevi koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=2; i<n; i++){
            if(i%sumaCifara(i)==0)
            {
                System.out.println(i);
            }
        }

    }
}
