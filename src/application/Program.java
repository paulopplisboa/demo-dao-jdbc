package application;

import java.util.Date;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Department dep = new Department(1, "Informática");
		System.out.println(dep);

		Seller seller = new Seller(21, "Bobo", "bobo@gmail.com", new Date("20/06/1974"), 3000.0, dep);
		System.out.println(seller);
	}

}
