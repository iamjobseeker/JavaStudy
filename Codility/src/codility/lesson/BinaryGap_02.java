package codility.lesson;

import java.util.Scanner;

public class BinaryGap_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input integer: ");
		int intg = sc.nextInt();
		
		int result=0;
		result = solution(intg);
		
		System.out.print("max: "+result);
	}
	
	public static int solution(int intg) {
		
		int cnt = 0;
		int max = 0;
		
		for(;intg>=2;) { 
			int binr=intg%2;
			intg=intg/2;
			if (binr==1){
				cnt=0;
			}
			else {
				cnt+=1;
				if(cnt>=max) {
					max=cnt;
				}
			}
		}
		
		return max;
	
	}
}
