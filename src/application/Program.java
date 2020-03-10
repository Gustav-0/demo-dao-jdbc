package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("== test 1 :seller findbyId ==");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n== test 2 :seller findbyDepartament ==");
		Departament department = new Departament(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
