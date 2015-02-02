package tn.esprit;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String args[]) {

		Adresse address;

		try {

			FileInputStream fin = new FileInputStream("d:\\address.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			address = (Adresse) ois.readObject();
			ois.close();

			System.out.println(address);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
