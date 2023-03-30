//Morgan Weaver Gold#2
package singleDigit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int num = input.nextInt();
		
		while(num > 9) {
			String strNum = Integer.toString(num);
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < strNum.length() - 1; i++) {
				int diff = Math.abs(Character.getNumericValue(strNum.charAt(i)) - Character.getNumericValue(strNum.charAt(i + 1)));
				sb.append(diff);
			}
			num = Integer.parseInt(sb.toString());
		}
		System.out.println(num);
		input.close();
	}

}
