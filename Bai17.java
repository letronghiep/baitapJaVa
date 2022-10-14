// đề bài: kiểm tra 3 số có phải 3 cạnh của tam giác không
import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap 3 canh: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if((a+b>c) && (a+c>b) && (b+c>a))	
			System.out.println("Thoa man 1 tam giac");
		else 
			System.out.println("Khong thoa man tam giac");
	}
}
