
public class Bai1 {
	public static void main(String[] args) {
		int i1=5, j1=6,x1;
		x1=i1++ + ++j1; // thực hiện phép tính rồi tăng i lên 1 dvi, tăng j len 1 dvi rồi cộng
		System.out.println("a) x = " + x1);
		
		int i2=10, j2=11, x2= --i2 + j2++; // giam i2 di 1 don vi sau do thuc hien phep tru, thực hiện phép trừ sau đó tăng j len 1 dvi
		System.out.println("b) x= " + x2);
		
		int i3=5, j3=2, x3=i3%j3; // chia lấy dư của i3 cho j3
		float y3=i3/j3;// chia lấy phần nguyên 
		System.out.println("c) x = " + x3 + ";y = " + y3);
		
		int i4=5, j4=2;
		float x4 = (float)i4/j4; // chia lấy dư kết hợp ép kiểu i4 sang số thực
		System.out.println("d) x = " + x4);
		
		int i5=5, j5=2;
		float x5 = i5/(float)j5; // ép kiểu số chia sang float
		System.out.println("e) x = " + x5);
		
		int i6=5, j6=2;
		float x6 = (float)i6/(float)j6; // ép kiểu float ở cả số bị chia và số chia
		
		System.out.println("f) x = " + x6);
	}
}
