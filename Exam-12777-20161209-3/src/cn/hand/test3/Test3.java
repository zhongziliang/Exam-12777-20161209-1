package cn.hand.test3;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("请输入年月日格式为 2016-12-09");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("您输入的这一年，有" + getTotalDaysOfYear(str) + "天");
	}

	public static int getTotalDaysOfYear(String str) {
		String[] str1 = str.split("-");
		int year = Integer.parseInt(str1[0].toString());
		int mouth = Integer.parseInt(str1[1].toString());
		int day = Integer.parseInt(str1[1].toString());
		int totalDay = 0;
		int count = 0;
		do {
			if (mouth < 0 || mouth > 12 || day < 0 || day > 31) {
				System.out.println("input error!");
				count = 1;
			}
		} while (count == 1);
		for (int i = 1; i < mouth; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				day = 31;
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				day = 30;
				break;
			}
			case 2: {
				if ((year % 100 != 0 && year % 4 == 0)
						|| (year % 100 == 0 && year % 400 == 0)) {
					day = 29;
				} else {
					day = 28;
				}
			}
			default:
				break;
			}
			totalDay += day;
		}
		return (totalDay+day);
	}
}
