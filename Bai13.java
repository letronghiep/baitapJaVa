import java.util.Scanner;

public class Bai13 {
public static void main(String[] args) {
	// Nhap gia ban va phan tram giam gia
	Scanner scanner = new Scanner(System.in);
	System.out.println("Gia ban: ");
	double a = scanner.nextDouble();
	System.out.println("Phan tram giam gia: ");
	
	double b = scanner.nextDouble();
	// in ra màn hình gía bán sau khi giảm
	System.out.println("Thanh tien: " + (a-(a*b)/100));
	
}
}
