package review;

import java.util.Scanner;

public class ClassReviewEx {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//		System.out.print("��� ����ұ��? ");
		//		ClassReview.printnum( input.nextInt());
		//		
		//		System.out.println();
		//		
		//		System.out.print("���� ");
		//		System.out.println(input.nextInt());
		//		
		//		System.out.print("��ȣ �Է� ");
		//		int num = input.nextInt();
		//		System.out.print(num);
		//		
		System.out.print("�� �� ����ұ��? ");
		int num1 = input.nextInt();
		input.nextLine();

		System.out.print("������ ����ұ��? ");
		String str = input.nextLine();

		ClassReview.printstr(num1, str);

	}

}
