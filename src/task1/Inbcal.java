package task1;
import java.util.*;
public class Inbcal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String inputarr[]= input.split(" ");
		int num1= Integer.parseInt(inputarr[0]);
		int num2= Integer.parseInt(inputarr[1]);
		int prod= num1*num2;
		if(prod>500)System.out.println(num1+num2);
		else System.out.println("Hello LNB code is running fine !!");
	}
}
