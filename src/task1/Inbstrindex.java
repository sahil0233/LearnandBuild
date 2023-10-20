package task1;
import java.util.*;
public class Inbstrindex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(solve(input));
	}
	public static String solve(String s) {
		StringBuilder ans = new StringBuilder();
		if(s.length()>7) {
			for(int i=0;i<s.length();i=i+2) {
				ans.append(s.charAt(i));
			}
		}
		else {
			for(int i=1;i<s.length();i=i+2) {
				ans.append(s.charAt(i));
			}
		}
		return ans.toString();
	}
}
