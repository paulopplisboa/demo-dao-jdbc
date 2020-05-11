package application;

import java.util.List;

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
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("Teste 1 : Seller findById ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n Test 2 : Seller findByDepartment ==== ");
		Department department = new Department (2,null);
		List<Seller> lista = sellerDao.findByDepartment(department);
		
		for (Seller obj : lista) {
			System.out.println(obj);
		}
				}

}
