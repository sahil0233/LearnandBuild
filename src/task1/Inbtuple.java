package task1;
import java.util.*;
public class Inbtuple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		solve(arr);
	}
	public static void solve(int arr[]) {
//		if(arr.length<10 || arr.length>20) {
//			System.out.println("input out of range");
//			return;
//		}
		String binarytuples[]= new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			binarytuples[i]=Integer.toBinaryString(arr[i]);
		}
		String lastbinary= binarytuples[arr.length-1];
		String secondlastbinary= binarytuples[arr.length-2];
		String result[]=new String[2];
		int binary1 = Integer.parseInt(lastbinary, 2);
        int binary2 = Integer.parseInt(secondlastbinary, 2);
        int andres = binary1 & binary2;
        int orres = binary1 | binary2;
        result[0] = Integer.toBinaryString(andres);
        result[1] = Integer.toBinaryString(orres);
        System.out.println("AND : "+ Integer.parseInt(result[0],2));
        System.out.println("OR : "+ Integer.parseInt(result[1],2));
        
		
	}
}
