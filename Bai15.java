import java.util.Scanner;

public class Bai15 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap so ngay o: ");
	int a = scanner.nextInt();
	System.out.println("Nhap don gia: ");
	double b = scanner.nextDouble();
	double tien=0;
	
	if(a==1) // số ngày nghỉ là 1
		tien = a*b;
	else if(a>1 && a<5) // số ngày nghỉ là 2 đến 4 ngày
		tien = ((b-b*0.2)*(a-1)+b);
	else if(a>4 && a<11) // số ngày nghỉ là 5 đén 10
		tien = ((b-b*0.2)*3+(b-b*0.4)*(a-4)+b);
	else  // trên 10 ngày nghỉ
		tien = ((b-b*0.2)*3 + (b-b*0.4)*6 + (b-b*0.6)*(a-10) +b);
	// in ra số tiền cần trả
	System.out.println("Thanh tien: " + tien);
}
}
