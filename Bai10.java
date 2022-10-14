import java.util.Scanner;

public class Bai10 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	// Nhập chiều dài và chiều rộng từ bàn phím
	System.out.println("Nhap chieu dai and chieu rong cua hcn: ");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	//Hiển thị kết quả diện tích và chu vi hình chữ nhật
	System.out.println("Dien tich hcn: " + a*b);
	System.out.println("Chu vi hcn: " + 2*(a+b));
}
}
