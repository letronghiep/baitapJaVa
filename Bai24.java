import java.util.Scanner;

public class Bai24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so hoc sinh: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		// Nhập điểm của từng sinh viên
		for(int i=0; i<n; i++)
		{
			System.out.print("Nhap diem TA sinh vien thu " + (i+1) + " :");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("\nNhap diem thi can tim: ");
		// Nhập từ bàn phím điểm thi cần tìm
		int x= scanner.nextInt();
		int check=1;
		for(int i=0; i<n; i++)
		{
			// kiểm tra điểm thi của từng sinh viên với điêm thi nhập từ bàn phím và in ra kq
			if(a[i]==x)
			{
				System.out.println("Sinh vien thu " + (i+1) + " co diem bang diem vua nhap.");
				check=0;
			}
		}
		if(check==1)
			System.out.println("Ko co sinh vien can tim.");
	}
}
