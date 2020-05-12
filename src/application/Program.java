package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Department dep = new Department(1, "Informática");
		// System.out.println(dep);
		// Seller seller = new Seller(21, "Bobo", "bobo@gmail.com", new
		// Date("20/06/1974"), 3000.0, dep);
		// System.out.println(seller);
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Teste 1 : Seller findById ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n Test 2 : Seller findByDepartment ==== ");
		Department department = new Department(2, null);
		List<Seller> lista = sellerDao.findByDepartment(department);

		for (Seller obj : lista) {
			System.out.println(obj);
		}

		System.out.println("\n Test 3 : Seller findAll ==== ");
		lista = sellerDao.findAll();

		for (Seller obj : lista) {
			System.out.println(obj);
		}

		System.out.println("\n Test 4 : Seller insert ==== ");

		Seller seller1 = new Seller(null, "António", "antonio@gmail.com", new Date(), 2500.0, department);
		sellerDao.insert(seller1);
		System.out.println("Inserted! new id  = " + seller1.getId());

		System.out.println("\n Test 5 : Seller Update ==== ");
		seller = sellerDao.findById(1);
		seller.setName("Marta Miranda");
		sellerDao.update(seller);
		System.out.println("Update complecto ");
		
		System.out.println("\n Test 6 : Seller Delete ==== ");
		System.out.println("Insira o id do seller a deletar ");
		int n = sc.nextInt();
		sellerDao.deleteById(n);
		System.out.println("seller com id = "+n + " deletado");
		sc.close();
	}

}
