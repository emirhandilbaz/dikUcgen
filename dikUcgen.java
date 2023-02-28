/* 
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
package Java.ilKonu.egzersizler;

import java.util.Scanner;

public class dikUcgen {
    public static void main(String[] args){
        int a, b;
        double c;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("A sayısını giriniz: ");
        a = scan.nextInt();

        System.out.print("B sayısını giriniz: ");
        b = scan.nextInt();

        c = Math.sqrt((a *a) + (b * b));

        System.out.print("Hipotenüs: " + c);

    }
    
}
