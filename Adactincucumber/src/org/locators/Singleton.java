package org.locators;



public class Singleton  {
	
	private  Loginpage loginpage ;  
	private  Bookhotelpage bookhotelpage;
	private  BookedItinereypage bookedItinereypage;
	private  Confirmationpage confirmationpage;
	private  Searchhotelpage searchhotelpage;
	private  Selecthoetlpage selecthoetlpage;
	
	
	public  Loginpage getLoginpage() {
		
		if (loginpage==null) {
			
			loginpage= new Loginpage();
		}
		
		return loginpage;
		
		
	}
	public  Bookhotelpage getBookhotelpage() {
		
		if (bookhotelpage==null) {
			
			bookhotelpage= new Bookhotelpage();
			
		}
		
		return bookhotelpage;
	}
	public  BookedItinereypage getBookedItinereypage() {
		
		if (bookedItinereypage==null) {
			
			bookedItinereypage = new BookedItinereypage();
			
		}
		
		
		return bookedItinereypage;
	}
	
	
	
	public  Confirmationpage getConfirmationpage() {
		
		if (confirmationpage==null) {
			
			confirmationpage= new Confirmationpage();
			
		}
		return confirmationpage;
	}
	
	public  Searchhotelpage getSearchhotelpage() {
		
		if (searchhotelpage==null) {
			
			searchhotelpage= new Searchhotelpage();
			
		}
		
		return searchhotelpage;
	}
	public  Selecthoetlpage getSelecthoetlpage() {
		
		if (selecthoetlpage==null) {
			
			selecthoetlpage = new Selecthoetlpage();
			
			
		}
		
		return selecthoetlpage;
	}
	
	
	
	
	

	
		
		
	
	
	
	

}
