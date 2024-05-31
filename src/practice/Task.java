package practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

public class Task {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.of(2021, 10, 21);
		LocalDate d2 = LocalDate.of(2021, 9, 15);
		LocalDate d3 = LocalDate.of(2021, 12, 4);
		LocalDate d4 = LocalDate.of(2021, 8, 10);
		LocalDate d5 = LocalDate.of(2021, 11, 9);

		HashMap<LocalDate, String> map1 = new HashMap<LocalDate, String>();

		map1.put(d1, "牛乳を買う");
		map1.put(d2, "〇〇社面談");
		map1.put(d3, "手帳を買う");
		map1.put(d4, "散髪に行く");
		map1.put(d5, "スクールの課題を解く");

		Object[] mapkey = map1.keySet().toArray();
		Arrays.sort(mapkey);

		for (LocalDate nkey : map1.keySet()) {

			String task = map1.get(nkey);

			System.out.println(nkey + ":" + task);

		}

	}

}
