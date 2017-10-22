

public class Bookstore {
	public BooksPurchased booksPurchased(double initial, double discount, double floor, double budget)
	{
		
		int no_of_books_bought = 0;
		double price_of_book = initial;
		String message = null;
		//validating input
		
		message = validate(initial,discount,floor,budget);
		if(!message.equals("Success!"))
			return new BooksPurchased(no_of_books_bought,budget,message);

		while(budget >= price_of_book && price_of_book > floor)
		{
				price_of_book = initial - (no_of_books_bought*discount) > floor?initial - (no_of_books_bought*discount):floor;
				budget -= price_of_book;
				no_of_books_bought++;
			
		}
		
		if(budget >= floor)
		{
		int books_bought_at_floor_price = (int) (budget/floor);
		no_of_books_bought += books_bought_at_floor_price;
		budget -=  books_bought_at_floor_price * floor;
		}
		 
		return new BooksPurchased(no_of_books_bought,budget,message);
	}
	 
	private String validate(double initial, double discount, double floor, double budget)
	{
		String message = null;
		if(initial<0 || discount < 0 || floor <0 || budget <0)
		{
			message = "Input parameters cannot be less than zero.";
			
		}
		else
		if(initial== 0 || floor == 0 || budget == 0)
		{
			message = "Input parameters(initial,floor,budget) cannot be zero.";
			
		}
		else
		if(discount >= initial)
		{
			message = "Invalid parameters. Discount should be less than Initial";
	
		}
		else
		if(floor > initial)
		{
			message = "Invalid parameters. Floor amount should be less than Initial";
	
		}
		else
		if(budget < initial)
		{
			message = "Invalid parameters. Budget should be more than initial price";

		}
		else
			message = "Success!";
		
		return message;
	}
	

}
