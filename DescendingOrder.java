package arrays;

import java.util.Scanner;

public class DescendingOrder {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				} 
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
	
}
