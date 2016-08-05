package com.alacriti.ecommerce.vo;

public class ProductDetails {
	
	private int id;
	private String category;
	private String productName;
	private double productPrice;
	private int quantity;
	private String description;
	private String image;
	
	public ProductDetails() {
		super();
	}

	public ProductDetails(String category, String productName,
			double productPrice, int quantity, String description) {
		super();
		this.category = category;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.description = description;
	}

	
	public ProductDetails(int id, String productName, int quantity, 
			double productPrice, String image,  String description) {
		super();
		this.id = id;
	
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.description = description;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	/*@Override
	public String toString() {
		return "ProductDetails {id:" + id + ", productName:" + productName
				+ ", productPrice:" + productPrice + ", quantity:" + quantity
				+ ", description:" + description + ", image:" + image + "}";
		
		return new StringBuffer(" id : ").append(this.id)
	
		                .append("Product Name : ").append(this.productName)
	
		                .append(" Product Price : ").append(this.productPrice).append(" Quantity : ")
	
		                .append(this.quantity).append(" Description: ").append(this.description).append(" Image : ").append(this.image).toString();

	}*/

	
}
