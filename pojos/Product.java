package pojos;

import java.time.LocalDate;
import javax.persistence.*;

@Entity 
@Table(name = "products") 
public class Product {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer productId;
	@Column(length = 100,nullable = false) //varchar(100)
	private String name; //not null constraint
	//by def col type : int --to store enum ordinal , to replace it by enum name
	@Enumerated(EnumType.STRING) //varchar
	@Column(length = 20)
	private ProductCategory category;
	private double price;
	private int stock;
	@Column(name="product_desc",length = 200)
	private String productDesc;
	@Column(name="manufacture_date")
	private LocalDate manufactureDate;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, ProductCategory category, double price, int stock, String productDesc,
			LocalDate manufactureDate) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.productDesc = productDesc;
		this.manufactureDate = manufactureDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", stock=" + stock + ", productDesc=" + productDesc + ", manufactureDate=" + manufactureDate + "]";
	}

}
