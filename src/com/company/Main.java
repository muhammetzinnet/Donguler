package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int sayi;
        double adet = 0, toplam = 0;

        System.out.print("Bir sayı girin = ");
        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();

        for (int i = 0; i<=sayi; i++){
            if ((i%3==0)&&(i%4==0)){
                adet++;
                toplam +=i;
            }
        }

        System.out.println("Ortalama = "+(toplam/adet));
    }
}
