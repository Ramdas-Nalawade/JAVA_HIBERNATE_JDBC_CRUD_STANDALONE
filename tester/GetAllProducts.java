package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.ProductDaoImpl;
import pojos.Product;
import pojos.ProductCategory;

public class GetAllProducts {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) {
			ProductDaoImpl dao=new ProductDaoImpl();
			dao.getAllProducts().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
