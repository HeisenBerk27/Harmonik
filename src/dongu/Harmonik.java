package dongu;

import java.util.Scanner;

public class Harmonik {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayac = 1;
		int sayi;
		double toplam = 0;
		System.out.print("Bir sayı giriniz: ");
		sayi = scanner.nextInt();

		while (sayac <= sayi) {
			toplam += 1.0 / sayac;
			sayac++;

		}
		System.out.println("Girdiğiniz sayının Harmonik Toplamı: " + toplam);
	}
	}
