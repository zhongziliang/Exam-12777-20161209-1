package cn.hand.test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Text4 {
	public static void main(String[] args) {
		int count = 50;
		int temp = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (count > 0) {
			temp = (int) (50 * Math.random() + 50);
			count--;
			list.add(temp);
		}
		getGroupByNum(list);
	}
	public static void getGroupByNum(ArrayList<Integer> res) {
		Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		ArrayList<Integer> list1;
		for (int i = 0; i < res.size(); i++) {
			int num = res.get(i) / 10;
			if (map.containsKey(num)) {
				map.get(num).add(res.get(i));
			} else {
				list1 = new ArrayList<Integer>();
				list1.add(res.get(i));
				map.put(num, list1);
			}
		}
		for (Integer integer : map.keySet()) {
			List<Integer> list = map.get(integer);
			Collections.sort(list);
		}
		System.out.println(map);
	}
}
