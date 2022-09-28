package classes;

public class Main {

	public static void main(String[] args) {
		//reference type  ,  new pahalıdır.
		CustomerManager customerManager = new CustomerManager(); //new: stack daki nesneden heap ta örnek oluşturuyor.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value type 
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); //burada sayi2 nin değeri 10 dur.  
		
		int[] sayilar1 = new int[]{1,2,3};
		int[] sayilar2 = new int[]{4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
	}

	
}

