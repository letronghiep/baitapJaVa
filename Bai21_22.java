import java.util.Scanner;

public class Bai21_22 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap so phan tu mang: ");
	int n = scanner.nextInt();
	int arr[] = new int[n];
	int sum=0;
	for(int i=0; i<n; i++)
	{
		// Nhập vào giá trị của các phần tử trong mảng
		System.out.print("Nhap phan tu thu " + (i+1) + " :");
		arr[i] = scanner.nextInt();
		// Tính tổng các giá trị phần tử trong mảng
		sum += arr[i];
	}
	// In ra mảng vừa nhập từ bàn phím
	System.out.print("Mang vua nhap: ");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	// In ra tổng giá trị các phần tử trong mảng
	System.out.println("\nTong mang: " + sum);
}
}
