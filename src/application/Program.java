package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Department dep = new Department(1, "Informática");
		//System.out.println(dep);
		//Seller seller = new Seller(21, "Bobo", "bobo@gmail.com", new Date("20/06/1974"), 3000.0, dep);
		//System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		System.out.println("Teste 1 : Seller findById ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	}

}
