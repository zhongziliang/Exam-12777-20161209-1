package cn.hand.test1;

public class PrimeNumber {
	public static void main(String[] args) {
		int num, i;
		int count = 0, sum = 0;
		for (num = 101; num <= 200; num++) {
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (num == i) {
				sum += num;
				count++;
				System.out.print(num + "\t");
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("101到200之间所有素数的和为" + sum);
	}

}
