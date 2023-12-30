package datadriven.notepad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read_data_from_notepad_file {

	public static void main(String[] args) throws Exception {
		// Target File location
		FileReader fr = new FileReader("TestData\\login11.txt");
		System.out.println("File located");

		// Create object for Buffered Reader [Old format]
		BufferedReader reader = new BufferedReader(fr);

		String Headers = reader.readLine();
		System.out.println(Headers);

		String Line1 = reader.readLine();
		String Arr[] = Line1.split(",");
		System.out.println(Arr[0] + "    " + Arr[1]);

		// Read all lines of data from notpad file
		String Rline;
		while ((Rline = reader.readLine()) != null) {
			String Line[] = Rline.split(",");
			System.out.println(Line[0] + "  " + Line[1]);
		}

	}

}

