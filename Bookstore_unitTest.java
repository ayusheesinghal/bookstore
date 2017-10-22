

import static org.junit.Assert.*;

import org.junit.Test;

public class Bookstore_unitTest {

	Bookstore store = new Bookstore();
	Double initial_pos = 50.0;
	Double discount_pos = 4.0;
	Double floor_pos = 25.0;
	Double budget_pos = 300.0;
	String negative_value_error_message = "Input parameters cannot be less than zero.";
	String empty_error_message = "Input parameters(initial,floor,budget) cannot be zero.";
	String invalid_disc_or_initial_message = "Invalid parameters. Discount should be less than Initial";
	String invalid_floor_or_initial_message = "Invalid parameters. Floor amount should be less than Initial";
	String invalid_budget_or_initial_message = "Invalid parameters. Budget should be more than initial price";
	
	@Test
	 public void books_purchased_positive(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, discount_pos, floor_pos, budget_pos);
		
		assertEquals(result.no_of_books_purchased, 8);
		assertTrue(result.remaining == 9.0);
	}
	
	@Test
	public void budget_equals_initial_pos(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, discount_pos, floor_pos, initial_pos);
		
		assertEquals(result.no_of_books_purchased, 1);
		assertTrue(result.remaining == 0.0);
	}
	
	@Test
	public void floor_equals_initial_pos(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, discount_pos, initial_pos, budget_pos);
		
		assertEquals(result.no_of_books_purchased, 6);
		assertTrue(result.remaining== 0.0);
	}
	
	@Test
		public void books_purchased_empty_initial_neg(){
		BooksPurchased result = store.booksPurchased(0, discount_pos, floor_pos, budget_pos);
		assertEquals(result.message, empty_error_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
	
	@Test
		public void books_purchased_empty_discount_pos(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, 0, floor_pos, budget_pos);
		int booksBought = (int)(budget_pos/initial_pos);
		assertTrue(result.no_of_books_purchased == booksBought);
		assertTrue(result.remaining == budget_pos%initial_pos);
	}
	
	@Test
	public void books_purchased_empty_floor_neg(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, discount_pos, 0, budget_pos);
		assertEquals(result.message, empty_error_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
	
	@Test
	public void books_purchased_negative_floor_neg(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, discount_pos, -25, budget_pos);
		assertEquals(result.message, negative_value_error_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
		
	@Test
	public void books_purchased_negative_initial_neg(){
		
		BooksPurchased result = store.booksPurchased(-50, discount_pos, floor_pos, budget_pos);
		assertEquals(result.message, negative_value_error_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
	
	@Test
	public void books_purchased_negative_discount_neg(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, -5, floor_pos, budget_pos);
		assertEquals(result.message, negative_value_error_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
	
	@Test
	public void books_purchased_negative_budget_neg(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, discount_pos, floor_pos, -400);
		assertEquals(result.message, negative_value_error_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == -400.0);
	}
	
		
	@Test
	public void floor_more_than_initial_neg(){
		
		BooksPurchased result = store.booksPurchased(floor_pos-1, discount_pos, floor_pos, budget_pos);
		assertEquals(result.message, invalid_floor_or_initial_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
	
	@Test
	public void discount_more_than_initial_neg(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, initial_pos +1, floor_pos, budget_pos);
		assertEquals(result.message, invalid_disc_or_initial_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
	
	@Test
	public void discount_equals_initial_neg(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, initial_pos, floor_pos, budget_pos);
		assertEquals(result.message, invalid_disc_or_initial_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == budget_pos);
	}
	
	@Test
	public void budget_less_than_initial_neg(){
		
		BooksPurchased result = store.booksPurchased(initial_pos, discount_pos, floor_pos, initial_pos-1);
		assertEquals(result.message, invalid_budget_or_initial_message);
		assertEquals(result.no_of_books_purchased, 0);
		assertTrue(result.remaining == initial_pos-1);
	}
}
