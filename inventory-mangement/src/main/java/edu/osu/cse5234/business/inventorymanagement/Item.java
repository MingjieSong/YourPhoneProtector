package edu.osu.cse5234.business.inventorymanagement;

import javax.persistence.*;



@Entity
@Table(name="ITEM") 
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="AVAILABLE_QUANTITY")
	private int availableQuantity;
	@Column(name="UNIT_PRICE")
	private double price;
	@Column(name="DESCRIPTION")
	private String picURL;
	@Column(name ="PAGE_NUM")
	private int pageNum ; 
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	
	public Item() {}
	
	public Item(int id, String name, int availQuan, double price, String picURL, int pageNum) {
		this.id = id;
		this.name = name;
		this.availableQuantity = availQuan;
		this.price = price;
		this.picURL = picURL;
		this.pageNum=pageNum ;
	}
	
}