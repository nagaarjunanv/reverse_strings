

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char char_arr[]=str.toCharArray();
		int i=0;
		for(i=char_arr.length-1;i>=0;i--)
		{
			System.out.print(char_arr[i]);
		}

	}

}
