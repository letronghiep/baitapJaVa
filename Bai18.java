import java.util.Scanner;

public class Bai18 {
	// hàm kiểm tra số nguyên tố
	public static boolean soNT(int n) {
		if(n<2)
			return false;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so n: ");
		int n = scanner.nextInt();
		// kiểm tra n có phải số nguyên tố hay không
		if(soNT(n)){
			// in ra kết quả
			System.out.println(n +" la so nguyen to");

		}
	}
}
