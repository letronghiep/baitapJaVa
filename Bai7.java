import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		// Nhap cac nguyen a,b
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen a va b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Chon A or S or M or D: ");
		sc.nextLine();
		String x = sc.nextLine();
		switch (x.toUpperCase()){
			// TH1: kí tự nhập vào là A
			case "A":
			System.out.println("a + b = " + a + b); 
			break;
			// TH2: kí tự nhập vào là S
			case "S":
			System.out.println("a + b = " + (a - b));
			break;
			// TH3: kí tự nhập vào là M
			case "M":
			System.out.println("a * b = " + a * b);
			break;
			// TH4: kí tự nhập vào là D
			case "D":
			System.out.println("a / b = " + (double) a / b);
			break;
			// TH còn lại kí tự khác kí tự y/cầu
			default:
			System.out.println("Ki tu ko hop le");
			break;
		}
	}
}
