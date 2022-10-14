
public class Bai8_9 {
	public static void main(String[] args) {
		int sum1=0, sum2=100*101/2; // sum2 là tổng các chữ số từ 1 đến 100
		for (int i = 2; i <= 100; i+=2) {
			sum1+=i;// tính tổng các chữ số chẵn
		}
		System.out.println("bai8: tong so chan: " + sum1); // in ra màn hình tổng các số chẵn
		System.out.println("Bai9: tong so le: " + (sum2-sum1)); // in ra màn hình tỏng các số lé
	}
}
