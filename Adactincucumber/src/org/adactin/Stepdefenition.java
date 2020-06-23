 package org.adactin;





import java.util.HashMap;
import java.util.Map;

import org.baseclass.Base;
import org.locaters.BookedItinereypage;
import org.locators.Bookhotelpage;
import org.locators.Confirmationpage;
import org.locators.Loginpage;
import org.locators.Searchhotelpage;
import org.locators.Selecthoetlpage;
import org.locators.Singleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefenition extends Base{
	
	   Singleton sl = new Singleton();
	       
	     // static Map<String, String> h = new HashMap<>();
	
	        Values vl = new  Values();
	
	@Given("^user Login to the application using \"([^\"]*)\"in username and \"([^\"]*)\" in password$")
	public void user_Login_to_the_application_using_in_username_and_in_password(String arg1, String arg2) throws Throwable {
	    
		  website("https://www.adactin.com/HotelApp/index.php");
		
		 
		   
		sendvalue(sl.getLoginpage().getUsernameQuery(), arg1);
		sendvalue(sl.getLoginpage().getPasswordQuery(), arg2);
		
		
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		
		clickelement(sl.getLoginpage().loginButtton);
	    
	}

	@Then("^user verify the as it is login to the application$")
	public void user_verify_the_as_it_is_login_to_the_application() throws Throwable {
	    
		screenShot(System.getProperty("user.dir")+"/testcase/verify.png");
		System.out.println("verified");
	
		
	}

	@Then("^user Select location as \"([^\"]*)\"$")
	public void user_Select_location_as(String arg1) throws Throwable {
		
		
		
		
		explicitleyWait(sl.getSearchhotelpage().getLocationdropdown());
	 Dropdown(sl.getSearchhotelpage().getLocationdropdown(),"value", arg1);
	    
	}

	@Then("^user  Select hotel as \"([^\"]*)\"$")
	public void user_Select_hotel_as(String arg1) throws Throwable {
		
		explicitleyWait(sl.getSearchhotelpage().getHotelsdropdown());
		Dropdown(sl.getSearchhotelpage().getHotelsdropdown(), "value", arg1);
	   
	}

	@Then("^user Select room type as \"([^\"]*)\"$")
	public void user_Select_room_type_as(String arg1) throws Throwable {
		
		
		
		explicitleyWait(sl.getSearchhotelpage().getRoomtypedropdown());
	    Dropdown(sl.getSearchhotelpage().getRoomtypedropdown(), "value", arg1);
	}

	@Then("^user Select no-of-rooms as \"([^\"]*)\"$")
	public void user_Select_no_of_rooms_as(String arg1) throws Throwable {
		
		
		explicitleyWait(sl.getSearchhotelpage().getRoomnosdropdown());
		Dropdown(sl.getSearchhotelpage().getRoomnosdropdown(), "value", arg1);
	    
	}

	@Then("^user Enter check-in-date as \"([^\"]*)\"$")
	public void user_Enter_check_in_date_as(String arg1) throws Throwable {
		
		
		sendvalue(sl.getSearchhotelpage().getDatein(), arg1);
		
	 
	}

	@Then("^user Enter check-out-date as \"([^\"]*)\"$")
	public void user_Enter_check_out_date_as(String arg1) throws Throwable {
	   
		
		sendvalue(sl.getSearchhotelpage().getDateout(), arg1);
		
	}

	@Then("^user verify the System should report an error message\\.$")
	public void user_verify_the_System_should_report_an_error_message() throws Throwable {
	  
		
		
		clickelement(sl.getSearchhotelpage().getSubmitbutton());
		
		threadsleep(3000);
		screenShot(System.getProperty("user.dir")+"/testcase/verify2.png");
		System.out.println("verified");
	}

	@Then("^user verify the System should report an error message as Enter Valid dates$")
	public void user_verify_the_System_should_report_an_error_message_as_Enter_Valid_dates() throws Throwable {
	  
		
		clickelement(sl.getSearchhotelpage().getSubmitbutton());
		threadsleep(3000);
		screenShot(System.getProperty("user.dir")+"/testcase/verify3.png");
		System.out.println("verified");
		
	}

	@Then("^user Select No-of-adults as \"([^\"]*)\"$")
	public void user_Select_No_of_adults_as(String arg1) throws Throwable {
		
		
		explicitleyWait(sl.getSearchhotelpage().getAdultroom());
		Dropdown(sl.getSearchhotelpage().getAdultroom(), "value", arg1);
	  
	}

	@Then("^user Select No-of-children as \"([^\"]*)\"$")
	public void user_Select_No_of_children_as(String arg1) throws Throwable {
	  
		
		explicitleyWait(sl.getSearchhotelpage().getChildroom());
		Dropdown(sl.getSearchhotelpage().getChildroom(), "index", arg1);
		
	}

	@Then("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
		
		clickelement(sl.getSearchhotelpage().getSubmitbutton());
	   
	}

	@Then("^user receive location from select hotel page and verify the locations in Select Hotel page are displayed according to the location selected in Search Hotel$")
	public void user_receive_location_from_select_hotel_page_and_verify_the_locations_in_Select_Hotel_page_are_displayed_according_to_the_location_selected_in_Search_Hotel() throws Throwable {
	    
		
		
		String atttribute = atttribute(sl.getSelecthoetlpage().getLocation(), "value");
		System.out.println(atttribute.equalsIgnoreCase("sydney"));
		
		
	}

	@Then("^user receive check-in- date and check-out- date from select hotel page and verify the Check-in-date and check-out- date should be displayed according to the data entered in search hotel$")
	public void user_receive_check_in_date_and_check_out_date_from_select_hotel_page_and_verify_the_Check_in_date_and_check_out_date_should_be_displayed_according_to_the_data_entered_in_search_hotel() throws Throwable {
		
		
		
		String datein = atttribute(sl.getSelecthoetlpage().getDatein(), "value");
		System.out.println("date in :" + datein.equalsIgnoreCase("21/04/2020"));
		
		String dateout = atttribute(sl.getSelecthoetlpage().getDateout(), "value");
		System.out.println("date out :" + dateout.equalsIgnoreCase("22/04/2020"));
		
	}

	@Then("^user receive No-of-rooms displayed in select hotel page and  verify the No-of-rooms displayed from select hotel page is match with number of rooms in search hotel page$")
	public void user_receive_No_of_rooms_displayed_in_select_hotel_page_and_verify_the_No_of_rooms_displayed_from_select_hotel_page_is_match_with_number_of_rooms_in_search_hotel_page() throws Throwable {
	 
             
		
		
		String rooms = atttribute(sl.getSelecthoetlpage().getRoomNos(), "value");
		System.out.println("Room nos :" + rooms.equalsIgnoreCase("3"));
		
		
	}

	@Then("^user receive Room type displayed in select hotel page and  verify the Room type displayed should be the same as selected in search hotel page$")
	public void user_receive_Room_type_displayed_in_select_hotel_page_and_verify_the_Room_type_displayed_should_be_the_same_as_selected_in_search_hotel_page() throws Throwable {
	   
		  
			
			
			String roomtype = atttribute(sl.getSelecthoetlpage().getRoomtype(), "value");
			System.out.println("room type :" + roomtype.equalsIgnoreCase("Deluxe"));
			
		
	}

	@Then("^user receive the  total- price\\(excl\\.GST\\) value and verify the total-price \"([^\"]*)\"$")
	public void user_receive_the_total_price_excl_GST_value_and_verify_the_total_price(String arg1) throws Throwable {
	   
		
			
			
			String totalprice = atttribute(sl.getSelecthoetlpage().getTotalPrice(), "value");
			System.out.println("total price :" + totalprice.contains(arg1));
		
	}

	@Then("^user  Select the hotel and click on continue button$")
	public void user_Select_the_hotel_and_click_on_continue_button() throws Throwable {
	
		
		
		clickelement(sl.getSelecthoetlpage().getSelectHotelRadiobutton());
		clickelement(sl.getSelecthoetlpage().getContinuebutton());
		
	}

	@Then("^Enter the details and click on book now$")
	public void enter_the_details_and_click_on_book_now() throws Throwable {
	   
		
		
		sendkeys(sl.getBookhotelpage().getFirstname(), "vasanth");
		sendkeys(sl.getBookhotelpage().getLastname(), "vk");
		sendkeys(sl.getBookhotelpage().getAddress(),"2nd main road" );
		sendkeys(sl.getBookhotelpage().getCardnumber(),"1234567890123456" );
	    Dropdown(sl.getBookhotelpage().getCardtype(), "value", "VISA" );
	    Dropdown(sl.getBookhotelpage().getExpirymonth(), "text","November" );
	    Dropdown(sl.getBookhotelpage().getExpiryyear(), "value","2015" );
	    sendkeys(sl.getBookhotelpage().getCvvnumber(),"033" );
	    clickelement(sl.getBookhotelpage().getBooknowbutton());
	}

	@Then("^user clicks on logout and verify and verfiy that have been logged out of the application$")
	public void user_clicks_on_logout_and_verify_and_verfiy_that_have_been_logged_out_of_the_application() throws Throwable {
	    
		
		
		clickelement(sl.getConfirmationpage().getLogoutbottoninBottom());
		
		screenShot(System.getProperty("user.dir")+"/testcase/verify4.png");
		
	}

	@Then("^user receives the total price from Book a hotel page and verify that Total-price should be \"([^\"]*)\"$")
	public void user_receives_the_total_price_from_Book_a_hotel_page_and_verify_that_Total_price_should_be(String arg1) throws Throwable {
	   
		
		
		String attribute = atttribute(sl.getBookhotelpage().getTotalPriceDisplay(), "value");
		
		System.out.println("total Price" + attribute.contains(arg1));
		
	}

	@Then("^user recieve the details from booking confirmation page and verify as that details is same as details which are given in previous page$")
	public void user_recieve_the_details_from_booking_confirmation_page_and_verify_as_that_details_is_same_as_details_which_are_given_in_previous_page() throws Throwable {
	    
	    threadsleep(3000);
		
		
		
		
		String attribute = atttribute(sl.getConfirmationpage().getFirstNamedisplayed(),"value");
		System.out.println("first name" + attribute.equalsIgnoreCase("vasanth"));
		
		String attribute1 = atttribute(sl.getConfirmationpage().getLastname(),"value");
		System.out.println("last name:" + attribute1.equalsIgnoreCase("vk"));
		
		String attribute2 = atttribute(sl.getConfirmationpage().getAddress(),"value");
		System.out.println("address :" + attribute2.equalsIgnoreCase("2nd main road" ));
		
	}

	@Then("^user receive the  Final billed price and verify the Final billed price is should as \"([^\"]*)\"$")
	public void user_receive_the_Final_billed_price_and_verify_the_Final_billed_price_is_should_as(String arg1) throws Throwable {
	   
	
		
		String attribute = atttribute(sl.getBookhotelpage().getFinalBilledPrice(), "value");
		System.out.println("final price :" + attribute.contains(arg1));
		
		
	}

	@Then("^user receives the data from book hotel page and verify the both should be same$")
	public void user_receives_the_data_from_book_hotel_page_and_verify_the_both_should_be_same() throws Throwable {
	 
		
		
		
		System.out.println("location :" + atttribute(sl.getBookhotelpage().getLocationDisplay(), "value").equalsIgnoreCase("Sydney"));
		System.out.println("Hotel :" + atttribute(sl.getBookhotelpage().getHotelNameDisplay(), "value").equalsIgnoreCase("Hotel Creek"));  		
		System.out.println("Room Type :" + atttribute(sl.getBookhotelpage().getRoomTypeDisplay(), "value").equalsIgnoreCase("Standard"));
		System.out.println("Number of rooms :" + atttribute(sl.getBookhotelpage().getNumberOfRoomDisplay(), "value").equalsIgnoreCase("2"));
		System.out.println("days :" + atttribute(sl.getBookhotelpage().getTotalDaysDisplay(), "value").contains("1"));
			
		
	}

	@Then("^user Verify Order number is generated in booking confirmation page$")
	public void user_Verify_Order_number_is_generated_in_booking_confirmation_page() throws Throwable {
	   
		
		
		
		
		String ordernumber = atttribute(sl.getConfirmationpage().getOrderNumber(), "value");
		
		System.out.println(ordernumber);
		
		
		vl.setOrderid(ordernumber);
		
		//h.put("ord1", ordernumber);
	
       
		
		
		
	}

	@Then("^user  Click on My itinerary button$")
	public void user_Click_on_My_itinerary_button() throws Throwable {
		
		
		
		clickelement(sl.getConfirmationpage().getMyItineraryButton());
	   
	}

	@Then("^user  Verify that the details are not editable in booked itinerary page$")
	public void user_Verify_that_the_details_are_not_editable_in_booked_itinerary_page() throws Throwable {
	   
       

	    sendvalue(sl.getBookedItinereypage().getItinereylocation(), "Melbourne");
	    
	    screenShot(System.getProperty("user.dir")+"/testcase/itinereypage/afterediting.png");
	    
	    navigate("refresh");
	    
	    screenShot(System.getProperty("user.dir")+"/testcase/itinereypage/afterrefreshing.png");
		
		
	}

	@Then("^user verify the Itinerary should reflect the correct information in line with the booking$")
	public void user_verify_the_Itinerary_should_reflect_the_correct_information_in_line_with_the_booking() throws Throwable {
	   
		
		 
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereylocation(), "value").equalsIgnoreCase("Sydney"));
		    
		    
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyHotelName(), "value").equalsIgnoreCase("Hotel Creek"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyrooms(), "value").equalsIgnoreCase( "2 Rooms"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyFirstName(), "value").equalsIgnoreCase("vasanth"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyLastName(), "value").equalsIgnoreCase("vk"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyDateIN(), "value").equalsIgnoreCase("21/04/2020"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyDateOut(), "value").equalsIgnoreCase("22/04/2020"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyNumberOfDays(), "value").equalsIgnoreCase("1 Days"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyRoomType(), "value").equalsIgnoreCase("Standard"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyPricePerNight(), "value").contains("125"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyTotalPrice(), "value").contains("149"));
		    
		
		
		
		
	}

	@Then("^user  Click on booked itinerary button$")
	public void user_Click_on_booked_itinerary_button() throws Throwable {
		
		
		
		clickelement(sl.getConfirmationpage().getBookedItinerary());
	    
	}

	@Then("^user  Enter the order id and click search button$")
	public void user_Enter_the_order_id_and_click_search_button() throws Throwable {
		
		//String st = h.get("ord1");
		
		String st = vl.getOrderid();
		System.out.println(st);
		
		
		
		
		sendkeys(sl.getBookedItinereypage().getSearchidquery(),st);
		clickelement(sl.getBookedItinereypage().getGoButton());
		
	}

	@Then("^user Verify that the relevant details are displayed$")
	public void user_Verify_that_the_relevant_details_are_displayed() throws Throwable {
	    
		
		screenShot(System.getProperty("user.dir")+"testcase/verify5.png");
		
		System.out.println("verified");
		
	}

	@Then("^user verify the All the details in booked itinerary page should be same as those entered during booking$")
	public void user_verify_the_All_the_details_in_booked_itinerary_page_should_be_same_as_those_entered_during_booking() throws Throwable {
	
	
 
		 
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereylocation(), "value").equalsIgnoreCase("Sydney"));
		    
		    
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyHotelName(), "value").equalsIgnoreCase("Hotel Creek"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyrooms(), "value").equalsIgnoreCase( "2 Rooms"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyFirstName(), "value").equalsIgnoreCase("vasanth"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyLastName(), "value").equalsIgnoreCase("vk"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyDateIN(), "value").equalsIgnoreCase("21/04/2020"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyDateOut(), "value").equalsIgnoreCase("22/04/2020"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyNumberOfDays(), "value").equalsIgnoreCase("1 Days"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyRoomType(), "value").equalsIgnoreCase("Standard"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyPricePerNight(), "value").contains("125"));
		 System.out.println(atttribute(sl.getBookedItinereypage().getItinereyTotalPrice(), "value").contains("149"));
		    
	
	}

	@Then("^user cancel the order which is searched$")
	public void user_cancel_the_order_which_is_searched() throws Throwable {
		
		
		
		clickelement(sl.getBookedItinereypage().getCheckBox());
		clickelement(sl.getBookedItinereypage().getCancelButton());
		
		simpleAlert("accept");
		
		
	}

	@Then("^user verify that order has cancled$")
	public void user_verify_that_order_has_cancled ()throws Throwable {
	
		
		String st = vl.getOrderid();
		
		
		sendvalue(sl.getBookedItinereypage().getSearchidquery(), st);
		clickelement(sl.getBookedItinereypage().getGoButton());
		
		screenShot(System.getProperty("user.dir")+"testcase/verify6.png");
		
	
	}

	@Then("^user get the title of Search hotelpage and verify it reflects its objective$")
	public void user_get_the_title_of_Search_hotelpage_and_verify_it_reflects_its_objective() throws Throwable {
	
                
		
		System.out.println(driver.getTitle().contains("Search Hotel"));
	
	}

	@Then("^user get the title of Select hotelpage and verify it reflects its objective$")
	public void user_get_the_title_of_Select_hotelpage_and_verify_it_reflects_its_objective() throws Throwable {
	

		
		System.out.println(driver.getTitle().contains("Select Hotel"));
	
	}

	@Then("^user get the title of Select book a hotel page and verify it reflects its objective$")
	public void user_get_the_title_of_Select_book_a_hotel_page_and_verify_it_reflects_its_objective() throws Throwable {
	

		
		System.out.println(driver.getTitle().contains("Book A Hotel"));
	
	}

	@Then("^user get the title of Select booking confirmation page and verify it reflects its objective$")
	public void user_get_the_title_of_Select_booking_confirmation_page_and_verify_it_reflects_its_objective() throws Throwable {
	
		 
		 
		    
		    System.out.println(driver.getTitle().contains("Hotel Booking Confirmation"));
	
	}

	@Then("^user click the booked itinerary option and verify it directs to booked itinerary form$")
	public void user_click_the_booked_itinerary_option_and_verify_it_directs_to_booked_itinerary_form() throws Throwable {
	   
		
		 
		
		clickelement(sl.getConfirmationpage().getBookedItinerary());
	    
	    
	    
	    System.out.println(driver.getTitle().contains("Booked Itinerey"));
	
	
	}

	@Then("^user Click on Search hotel option and verify it directs to search hotel form$")
	public void user_Click_on_Search_hotel_option_and_verify_it_directs_to_search_hotel_form() throws Throwable {
	
		 
		 clickelement(sl.getBookedItinereypage().getSearchHotelButton());
		 
		 System.out.println(driver.getTitle().contains("Search Hotel"));
	
	
	}



}
