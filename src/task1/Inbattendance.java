package task1;
import java.util.*;
public class Inbattendance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		String data[]= new String[w];
		for(int i=0;i<w;i++) {
			data[i]=sc.nextLine();
		}
		//create a string when all employees are present
		solve(e,w,data);
	}
	public static void solve(int e,int w,String data[]) {
		if(e<1 || e>10) {
			System.out.println("e value not in range");
			return;
		}
		if(w<1 || w>31) {
			System.out.println("w value not in range");
			return;
		}
		for(int i=0;i<data.length;i++) {
			if(data[i].length()!=e) {
				System.out.println("wrong data value");
				return;
			}
			for(int j=0;j<e;j++) {
				if(data[i].charAt(j)=='P' || data[i].charAt(j)=='A' )continue;
				else {
					System.out.println("wrong data value");
					return;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<e;i++) {
			sb.append("P");
		}
		int cons=0;
		int cnt=0;
		for(int j=0;j<data.length;j++) {
			if(data[j].equals(sb.toString()))cnt++;
			else {
			cons=Math.max(cons, cnt);
			cnt=0;
			}
		}
		System.out.println(cons+","+w);
		
	}
}
