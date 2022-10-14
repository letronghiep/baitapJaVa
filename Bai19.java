import java.util.Scanner;

public class Bai19 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap gio: ");
	int h = scanner.nextInt();
	System.out.println("Nhap phut: ");
	int p = scanner.nextInt();
	System.out.println("Nhap giay: ");
	int s = scanner.nextInt();
	// In ra kết quả của bài toán
	// công thức: 1h = 3600s, 1p = 60s
	System.out.println("So giay quy doi: " + (h*3600+p*60+s));
}
}
