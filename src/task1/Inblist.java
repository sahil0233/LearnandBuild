package task1;
import java.util.*;
public class Inblist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1= sc.nextLine();
		String input2= sc.nextLine();
		String input1arr[]= input1.split(" ");
		String input2arr[]= input2.split(" ");
		int list1[]= new int[input1arr.length];
		for(int i=0;i<input1arr.length;i++) {
			list1[i]= Integer.parseInt(input1arr[i]);
		}
		int list2[]= new int[input2arr.length];
		for(int i=0;i<input1arr.length;i++) {
			list2[i]= Integer.parseInt(input2arr[i]);
		}
		int ans[]= solve(list1,list2);
		for(int num:ans) {
			System.out.print(num+" ");
		}
	}
	public static int[] solve(int list1[],int list2[]) {
		int b = list2.length/2;
		int a = list1.length%2==0?list1.length/2:(list1.length/2)+1;
		int ans[] = new int[a+b];
		int x=0;
		for(int i=0;i<list1.length;i=i+2) {
			ans[x]=list1[i];
			x++;
		}
		for(int i=1;i<list2.length;i=i+2) {
			ans[x]=list2[i];
			x++;
		}
		return ans;
	}
	
}
