package cycle2;

import java.util.*;

public class SortArray {
	public static void main(String args[]) {
		int count, i,j;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		count = sc.nextInt();
		String[] countries = new String[count];

		System.out.print("Enter elements : ");
		for (i = 0; i < count; i++) {
			countries[i] = sc.next();
		}

		int size = countries.length;
		for (i = 0; i < size - 1; i++) {
			for (j = i + 1; j < countries.length; j++) {
				if (countries[i].compareTo(countries[j]) > 0) {
					temp = countries[i];
					countries[i] = countries[j];
					countries[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(countries));
	}
}
