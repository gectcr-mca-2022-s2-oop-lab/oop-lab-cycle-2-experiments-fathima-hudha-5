package cycle2;

import java.util.*;

class String_m {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String value = scc.nextLine();

		System.out.println("1.String Length is : " + value.length());

		System.out.println("Enter string to concatenate");
		String concat = scc.next();
		System.out.println("2.String concatination : " + value.concat(concat));

		System.out.println("3.Enter the character to find index");
		String ch = scc.next();
		System.out.println("Index of character : " + ch + ":" + value.indexOf(ch));

		System.out.println("4.Enter the position to find character");
		int pos = scc.nextInt();
		System.out.println("Character at position : " + pos + ":" + value.charAt(pos));

		System.out.println("5.Enter the string to compare with ");
		String comp = scc.next();
		System.out.println("Equal to "+ "'" +comp+" :" + value.equals(comp));

		System.out.println("6.Enter the string to sequence to check ");
		String seq = scc.next();
		System.out.println("Contains sequence " + "'" +seq+" :"+ value.contains(seq));

		System.out.println("7.Enter the endswith character to check for");
		String end = scc.next();
		System.out.println("EndsWith character " + "'" +end+" :"+ value.endsWith(end));

		System.out.println("8.Enter the text to replace with");
		String rep = scc.next();
		System.out.println("Replace with " + "'" +rep+" :"+ value.replace(value, rep));

		System.out.println("9.Convert to LowerCase: " + value.toLowerCase());
		System.out.println("10.Convert to UpperCase: " + value.toUpperCase());
	}
}