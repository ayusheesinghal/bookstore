

public class BooksPurchased {

	int no_of_books_purchased;
	double remaining;
	String message;
	
	public BooksPurchased() {
		
	
	}
	
	public BooksPurchased(int no_of_books_purchased, double remaining, String message) {
		
		this.no_of_books_purchased = no_of_books_purchased;
		this.remaining = remaining;
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNo_of_books_purchased() {
		return no_of_books_purchased;
	}

	public void setNo_of_books_purchased(int no_of_books_purchased) {
		this.no_of_books_purchased = no_of_books_purchased;
	}

	public double getRemaining() {
		return remaining;
	}

	public void setRemaining(double remaining) {
		this.remaining = remaining;
	}
	
}
