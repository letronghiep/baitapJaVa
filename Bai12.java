import java.util.Scanner;

public class Bai12 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap so diem thi:");
	int a = scanner.nextInt();
	if(a>=90) //  TH điểm thi lớn hơn hoặc bằng 90
		System.out.println("A");
	else if(a>=80 && a<90)//  TH điểm thi 80 <= a < 90
		System.out.println("B");
	else if(a>=70 && a<80) // TH điểm thi từ 70 đến 79 điểm
		System.out.println("C");
	else if(a>=50 && a<70) // TH điểm thi từ 50 đến 69 điiểm
		System.out.println("D");
	else if(a<50) // TH điểm thi nhỏ hơn  50 điểm
		System.out.println("F");
}
}
