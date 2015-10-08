package kc.ac.kookmin.exception.intro;

import java.io.*;

class Trade {

	public void readFile() {
		BufferedReader reader =null;
		try {
			String path = Trade.class.getResource("").getPath();
			System.out.println(path);
			String line_data;
			reader = new BufferedReader(new FileReader(path + "a.txt"));
			while ((line_data = reader.readLine()) != null) {
				System.out.println(line_data);
			}

		} catch (IOException e) {
			System.out.println("에러정보 :" + e);

		} catch (NullPointerException e) {
			System.out.println("에러정보 :" + e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("에러정보 :" + e);

			}
		}
	}
}
public class Test {
	public static void main(String args[]) {
		Trade a = new Trade();
		a.readFile();

	}
}