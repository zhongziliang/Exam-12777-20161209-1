package cn.hand.test2;

import java.util.Scanner;

public class GetSomeoneIncomeTax {
	public static void main(String[] args) {
		System.out.println("���������Ĺ���");
		Scanner scan=new Scanner(System.in);
		Double money=scan.nextDouble();
		Double tax=getElseIncome(money);
		System.out.println("����������Ϊ"+(money-tax)+"����,��������Ϊ��"+tax);
	}

	public static double getElseIncome(double res) {
		double count = (res - 3500) % 1500;
		double num;
		if (count < 1) {
			num = res * 0.03;
		} else if (count < 3 && res > 1) {
			num = res * 0.1;
		} else if (count < 6 && count > 3) {
			num = res * 0.2;
		} else if (count < 23 && count > 6) {
			num = res * 0.3;
		} else if (count < 36 && count > 23) {
			num = res * 0.4;
		} else if (count < 53 && count > 36) {
			num = res * 0.5;
		} else if (count > 53) {
			num = res * 0.6;
		} else {
			num = -1;
		}
		return num;
	}
}
