package Problem_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class main {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("p22.txt"); BufferedReader br = new BufferedReader(in);) {

			String line = br.readLine();

			String[] str = line.split(",");

			List<String> list = new ArrayList<>();
			for (int i = 0; i < str.length; i++) {
				list.add(str[i]);

			}

			Comparator<String> comp = new Comparator<String>() {

				@Override
				public int compare(String obj1, String obj2) {
					if (obj1 == obj2) {
						return 0;
					}
					if (obj1 == null) {
						return -1;
					}
					if (obj2 == null) {
						return 1;
					}
					return obj1.compareTo(obj2);
				}

			};

			list.sort(comp);
			Map<String, Integer> namMap = new HashMap<>();
			int count = 0;
			for (int i = 0; i < list.size(); i++) {
				int value = 0;
				for (int j = 0; j < list.get(i).length(); j++) {
					char c = list.get(i).charAt(j);
					value += (int) c -64;
				}

				count += (1+i)*value;
			}

			System.out.println(count);

			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
