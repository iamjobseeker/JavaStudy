package review;

import java.util.Scanner;

public class ClassReviewEx {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//		System.out.print("몇번 출력할까요? ");
		//		ClassReview.printnum( input.nextInt());
		//		
		//		System.out.println();
		//		
		//		System.out.print("실험 ");
		//		System.out.println(input.nextInt());
		//		
		//		System.out.print("번호 입력 ");
		//		int num = input.nextInt();
		//		System.out.print(num);
		//		
		System.out.print("몇 번 출력할까요? ");
		int num1 = input.nextInt();
		input.nextLine();

		System.out.print("무엇을 출력할까요? ");
		String str = input.nextLine();

		ClassReview.printstr(num1, str);

	}

}
