// đề bài: tìm và hiển thị các số có 3 chữ số thỏa mãn a^3 + b^3 + c^3 = abc;
public class Bai17_2 {
	// Hàm tách chữ số và kiểm tra tổng lập phương của các chữ số
	public static int kiemTra(int n) {
		int tong=0;
		while(n>0) {
			int soDu = n%10;
			tong += Math.pow(soDu, 3);
			n/=10;
		}
		return tong;
	}
	public static void main(String[] args) {
		System.out.print("Cac so thoa man dieu kien: ");
		for(int i=100; i<1000; i++)
		{
			if(i==kiemTra(i)) // kiểm tra tổng lập phương các chữ số với số đã cho
				System.out.print(i + " ");
		}
	}
}
