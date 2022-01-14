package edu.osu.cse5234.business.inventorymanagement;

import java.util.*;

import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("inventory")
public class InventoryManagementService {
	Inventory currentInventory;
	 
	private final String MY_QUERY= "Select i from Item i"; 
	List<Item> allItems  ; 	
	List<Item> caseItems = new ArrayList<Item>();
	List<Item> lanyardItems= new ArrayList<Item>(); 
	List< Item> holderItems= new ArrayList<Item>()  ; 
	
	
	public InventoryManagementService() {
	/*	currentInventory = new Inventory();
		availableItems = new ArrayList<Item>();
		
		String pic_url1 = "images/item1-img.jpg" ;
		String pic_url2 = "images/item2-img.jpeg";
		String pic_url3 = "images/item3-img.jpg";
		String pic_url4 =  "images/item4-img.png";
		String pic_url5 =  "images/item5-img.jpg";
		String pic_url6 = "images/item6-img.jpeg";
		
		availableItems.add(new Item(101, "iphone9Case", 0, 19.99, pic_url1));
		availableItems.add(new Item(102, "iphone10Case", 0, 24.99, pic_url2));
		availableItems.add(new Item(103, "iphone11Case", 0, 29.99, pic_url3));
		availableItems.add(new Item(104, "iphone12Case", 0, 29.99, pic_url4));
		availableItems.add(new Item(105, "iphone13Case", 0, 29.99, pic_url5));
		availableItems.add(new Item(106, "iphoneXCase", 0, 29.99, pic_url6));
		currentInventory.setItems(availableItems); */
		
		 
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("inventory-management");
	    EntityManager entityManager = emfactory.createEntityManager();
	    allItems =entityManager.createQuery(MY_QUERY, Item.class).getResultList();	 ; 
	    entityManager.close();
		emfactory.close(); 
		 
	 
	   for(Item i: allItems) {
			if(i.getPageNum() == 1) {
				caseItems.add(i) ; 
			}else if(i.getPageNum() == 2) {
				lanyardItems.add(i) ; 
			}else {
				holderItems.add(i);
			}
		}     
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Inventory getInventory(@QueryParam("pageNum") int pageNum) {
		currentInventory = new Inventory();
		 
		switch (pageNum) {
		 case 1: 
			 currentInventory.setItems(caseItems);
			 break;
			
		 case 2:
			 currentInventory.setItems(lanyardItems );
			 break;
		 case 3: 
			currentInventory.setItems(holderItems);	 
			 break ; 	 
		 
		 
		 }   
		 
		  
		return currentInventory;
		 

	}
	
 
	@GET
	@Path("/itembyid")
	@Produces(MediaType.APPLICATION_JSON)
	public Item getItemByID(@QueryParam("id") int id ) {
		  
			for(Item i: allItems) {
					if(i.getId() == id) return i;
				}
			 
		return new Item(0, "No_item", 0, 0.0, "", 0);
	}
	
	@GET
	@Path("/itembyname")
	@Produces(MediaType.APPLICATION_JSON)
	public Item getItemByItemName(@QueryParam("name") String name ) {
		  
		 for(Item i: allItems) {
					if(i.getName().equals(name)) return i;
			}
		 
		 
		return new Item(0, "No_item", 0, 0.0, "", 0);
	}
	
}
