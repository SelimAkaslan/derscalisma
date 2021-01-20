package day9arrayarrayList;

import java.util.Scanner;

public class ArrayCiftSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen 5 tam sayi giriniz");
		
		int []nums = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		int count=0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]%2==0) {
				count++;
			}
			
		}
		System.out.println("Girilen sayilardaki cift sayilar: "+count);

	}

}
