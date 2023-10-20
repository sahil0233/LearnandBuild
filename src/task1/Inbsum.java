package task1;
import java.util.*;
public class Inbsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String inputarr[]= input.split(" ");
		int num[]= new int[5];
		for(int i=0;i<5;i++) {
			num[i]= Integer.parseInt(inputarr[i]);
		}
		System.out.println(calculateSum(num));
	}
	public static int calculateSum(int num[]) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]<9)continue;
			sum+=num[i];
		}
		return sum;
	}
}
