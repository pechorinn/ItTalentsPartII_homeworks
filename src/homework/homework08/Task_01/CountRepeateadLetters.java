package homework.homework08.Task_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountRepeateadLetters {

	public static void main(String[] args) {

		System.out.println("Please enter the sentence: ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		string = string.toLowerCase();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		sc.close();
		for (int i = 0; i < string.length(); i++) {
			Integer value = hashMap.get(string.charAt(i));
			if (Character.isLetter(string.charAt(i))) {
				if (value == null) {
					hashMap.put(string.charAt(i), 1);
				} else {
					hashMap.put(string.charAt(i), value + 1);
				}
			}
		}

		int sum = hashMap.values().stream().mapToInt(i -> i).sum();
		ArrayList<Entry<Character, Integer>> arrayList = new ArrayList<>();
		arrayList.addAll(hashMap.entrySet());
		arrayList.sort((a1, b1) -> Integer.compare(b1.getValue(), a1.getValue()));
		arrayList.forEach(a -> System.out.println(a.getKey() + ": " + a.getValue() + " "
				+ new String(new char[((a.getValue()*100/sum))]).replace("\0", "#")));

	}
}
