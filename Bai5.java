import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen a: ");
		int a = sc.nextInt();
		System.out.print("Nhap so thuc: ");
		float b = sc.nextFloat();
		System.out.print("Nhap ki tu: ");
		char d = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Nhap chuoi: ");
		String x = sc.nextLine();
		System.out.println("So nguyen a = " +a); // in ra số nguyên a
		System.out.println("So thuc b = "+ b); // in ra số thực b
		System.out.println("Ki tu c = " + d); // in ra kí tự c
		System.out.println("Chuoi d = " + x); // in  ra chuỗi d
	}
}
