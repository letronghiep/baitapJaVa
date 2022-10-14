
import java.util.Scanner;
import java.util.Arrays;

public class Bai23 {
	public static void main(String[] args) {
		// Nhập số sinh viên
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so hoc sinh: ");
		int n = scanner.nextInt();
		// Tạo mảng và nhập mảng
		int a[] = new int[n];
		int max = -1000, index=0;
		
		for(int i=0; i<n; i++)
		{
			// Nhập từ bàn phím điểm của từng sinh viên
			System.out.print("Nhap diem sinh vien thu " + (i+1) + " :");
			a[i] = scanner.nextInt();
			// Kiểm tra phần tử max
			if(a[i]>max)
			{
				// So sánh điểm của sinh viên với giá trị lớn nhất
				max = a[i];
				// Tìm ra vị trí của sinh viên có điểm thi cao nhất
				index = i;
			}
		}
		// In kết quả ra màn hình
		System.out.println("Diem cao nhat: " + max);
		System.out.println("Sinh vien co diem cao nhat: Sinh vien thu " + (index+1));
		System.out.print("Diem sap xep theo tang dan: ");
		// Hàm sắp xếp các giá trị của phần tử trong mảng theo thứ tự tăng dần
		Arrays.sort(a);
		// In ra mảng vừa được sắp xếp
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
