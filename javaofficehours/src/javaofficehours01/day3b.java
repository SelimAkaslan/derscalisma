package javaofficehours01;

import java.util.Scanner;

public class day3b {

	public static void main(String[] args) {
		// kullanıcıdan üniversite kaçıncı sınıf ve fakültesini alanım.
//		1. sınıf ise;
//		üniversite giriş yılı
//		2. sınıf ise;
//		mimarlık
//		syso(2. sınıf mimarlık öğrencisi)
//		mühendislik:
//			syso(2. sınıf mühendislik  öğrencisi)
//			3. sınıf ise;
//		mimarlık
//		syso(2. sınıf mimarlık öğrencisi)
//		mühendislik:
//		syso(2. sınıf mühendislik  öğrencisi)giriş yılı
Scanner sc=new Scanner (System.in);
		
		System.out.println("Lütfen Sınıfınız giriniz");
		int yil = sc.nextInt();
		
		System.out.println("Lütfen fakültenizi giriniz.");
		String bolum =sc.next();
		
		switch (yil) {
			case 1:
			System.out.println("üniversiteye giriş yılı");
			break;
			
			case 2:
				switch (bolum) {
				case "mimarlık":
				System.out.println("2. sınıf mimarlık öğrencisi");
				break;
				case "mühendislik":
				System.out.println("2. sınıf mühendislik öğrencisi");
				break;
				
			}
			break;
		case 3:
			switch (bolum) {
			case "mimarlık":
				System.out.println("3. sınıf mimarlık öğrencisi");
			break;
			case "mühendislik":
				System.out.println("3. sınıf mühendislik öğrencisi");
				break;
			
		}
			break;
			default:
				System.out.println("hatalı giriş");
			

	}
	}
}

	