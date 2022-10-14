import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen a va b"); 
		int a = scanner.nextInt(); // nhập từ bàn phím số a
		int b = scanner.nextInt();// nhập từ bàn phím số a
		System.out.println("a + b = " + a+b); // in ra màn hình phép cộng a và b
		System.out.println("a - b = " + (a-b));// in ra màn hình phép trừ a và b
		System.out.println("a * b = " + a*b);// in ra màn hình phép nhân a và b
		System.out.println("a / b = " + (double)a/b);// in ra màn hình phép chia của a cho b
	}
}
