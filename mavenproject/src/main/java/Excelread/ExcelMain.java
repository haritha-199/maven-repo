package Excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		System.out.println(Excel1.getStringData(0, 0));
		System.out.println(Excel1.getStringData(1, 0));
		System.out.println(Excel1.getStringData(0, 1));

		System.out.println(Excel1.getIntegerData(1, 1));


		// TODO Auto-generated method stub

	}

}
