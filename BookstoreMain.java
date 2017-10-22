


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BookstoreMain {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br = new BufferedReader(r);

		Bookstore bookstore = new Bookstore();
		BooksPurchased books_purchased = new BooksPurchased(); 
		

		//user input
		System.out.println("Enter Initial amount");
		double initial = Double.parseDouble(br.readLine());
		System.out.println("Enter Discount amount");
		double discount = Double.parseDouble(br.readLine());
		System.out.println("Enter Floor amount");
		double floor = Double.parseDouble(br.readLine());
		System.out.println("Enter Budget");
		double budget = Double.parseDouble(br.readLine());
		
		
		//calling function to return no. of books purchased and remaining amount
		books_purchased = bookstore.booksPurchased(initial, discount, floor, budget);
		
		System.out.println("response message: " + books_purchased.message);
		System.out.println("no. of books purchased: " + books_purchased.no_of_books_purchased);
		System.out.println("amount remaining: " + books_purchased.remaining);
		
		bookstore.booksPurchased(initial, discount, floor, budget);
	}
}
