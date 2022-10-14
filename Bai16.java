import java.util.Scanner;

public class Bai16 {
	// Ham tính giai thừa của số nguyên n
	public static long giaiThua(int n) {
		if(n==1)
			return 1;
		return n*giaiThua(n-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = scanner.nextInt();
		// in kết quả giai thừa của n ra màn hình
		System.out.println("n! = " + giaiThua(n));
	}
	
}
