package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "vade oranı";
		
		Product product1 = new Product();
		product1.setName("Delongi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
						//set value
						//get
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("Smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
	

		Product product3 = new Product();
		product3.setName("Kitchen Aid kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052222222");
		individualCustomer.setCustomerNumber("22222222");
		individualCustomer.setFirstName("Batu");
		individualCustomer.setLastName("Yılmaz");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlamaio");
		corporateCustomer.setPhone("111111");
		corporateCustomer.setTaxNumber("222225555");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
