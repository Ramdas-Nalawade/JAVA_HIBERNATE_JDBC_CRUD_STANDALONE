package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.ProductDaoImpl;
import pojos.Product;
import pojos.ProductCategory;

public class UpdateProductPrice {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)) {
			//create dao instance
			ProductDaoImpl dao=new ProductDaoImpl();
			//invoke dao's method
			System.out.println("Enter product id, price:");
			dao.updateProductPrice(sc.nextInt(), sc.nextDouble());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
