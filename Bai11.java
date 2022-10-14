import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		// Nhap ban kinh hinh tron
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ban kinh R = ");
		double r = scanner.nextDouble();
		// tinh va in ra dien tich va chu vi hinh tron
		System.out.println("Chu vi hinh tron: " + 2*r*Math.PI);
		System.out.println("Dien tich hinh tron: " + r*r*Math.PI);
	}
}
