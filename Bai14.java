import java.util.Scanner;

public class Bai14 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap so dien tieu thu: ");
	double a = scanner.nextDouble();
	double tien=0;
	
	if(a<51) // th số điện <= 50
		tien = a*1484;
	else if(a>50 && a<101) // th số điện từ 51 đến 100
		tien = 50*1484 + (a-50)*1533;
	else if(a>100 && a<201) // th số điện từ 101 đến 200
		tien = 50*1484 + 50*1533 + (a-100)*1786;
	else // th số điện trên 200
		tien = 50*1484 + 50*1533 + 100*1786 + (a-200)*1786;
	// in ra số tiền cần phải trả
	System.out.println("So tien dien: " + tien);
}
}
