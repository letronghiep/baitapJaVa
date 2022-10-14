import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap do C: ");
		double C = scanner.nextDouble();
		System.out.println("C = " + C);
		// độ C = (dộ F - 32) / 1.8
		System.out.println("F " + (C*1.8)+32);
	}
}
