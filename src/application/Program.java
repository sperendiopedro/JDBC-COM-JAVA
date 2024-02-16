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
	
		Scanner sc = new Scanner(System.in);  
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller obj : list) {	
			System.out.println(obj);
		}
		
		System.out.println("Find all: ");
		list = sellerDao.findAll(); 
		for(Seller obj : list) {
			System.out.println(obj);
			
		}
		
		System.out.println("Inserção *teste*");
		Seller seller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(seller);
		System.out.println("Inserted successfully! New id: " + seller.getId());

		
		System.out.println("Update *teste*");
		seller = sellerDao.findById(1);
		seller.setName("Pedro");
		sellerDao.update(seller); 
		System.out.println("update completed");
	
		System.out.println("Delete *teste*");
		System.out.println("Digite o Id");
		int id = sc.nextInt(); 
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
	}
}
