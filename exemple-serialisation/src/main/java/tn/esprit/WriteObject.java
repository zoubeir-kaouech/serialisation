package tn.esprit;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String args[]) {

		Adresse

		address = new Adresse();
		address.setStreet("wall street");
		address.setCountry("united states");

		try {

			FileOutputStream fout = new FileOutputStream("d:\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
