package org.locators;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotelpage extends Base {
	
	@FindBy(xpath="//a[text()=\"Search Hotel\"]")
	private WebElement searchHotelButton; 
	
	public WebElement getSearchHotelButton() {
		return searchHotelButton;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getChangepassword() {
		return changepassword;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getBackbutton() {
		return backbutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknowbutton() {
		return booknowbutton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement bookedItinerary;
	
	@FindBy(xpath="//a[text()=\"Change Password\"]")
	private WebElement changepassword;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logout;
	
	@FindBy(xpath="//a[text()=\"Back\"]")
	private WebElement backbutton;
	
	@FindBy(id="hotel_name_dis")
	private WebElement hotelNameDisplay;
	
	public WebElement getHotelNameDisplay() {
		return hotelNameDisplay;
	}

	public WebElement getLocationDisplay() {
		return locationDisplay;
	}

	public WebElement getRoomTypeDisplay() {
		return roomTypeDisplay;
	}

	public WebElement getNumberOfRoomDisplay() {
		return numberOfRoomDisplay;
	}

	public WebElement getTotalDaysDisplay() {
		return totalDaysDisplay;
	}

	public WebElement getPricePerNightDisplay() {
		return pricePerNightDisplay;
	}

	@FindBy(id="location_dis")
	private WebElement locationDisplay;
	
	@FindBy(id="room_type_dis")
	private WebElement roomTypeDisplay;
	
	@FindBy(id="room_num_dis")
	private WebElement numberOfRoomDisplay;
	
	@FindBy(id="total_days_dis")
	private WebElement totalDaysDisplay;
	
	@FindBy(id="price_night_dis")
	private WebElement pricePerNightDisplay;
	
	
	
	
	
	@FindBy(id="total_price_dis")
	private WebElement totalPriceDisplay;
	
	public WebElement getFinalBilledPrice() {
		return finalBilledPrice;
	}

	@FindBy(id="final_price_dis")
	private WebElement finalBilledPrice;
	
	public WebElement getTotalPriceDisplay() {
		return totalPriceDisplay;
	}

	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement cardnumber;
	
	@FindBy(name="cc_type")
	private WebElement cardtype;
	
	@FindBy(name="cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(name="book_now")
	private WebElement booknowbutton;

	
	@FindBy(id="cancel")
	private WebElement cancelButton;
	
	public Bookhotelpage() {
		
		PageFactory.initElements(driver, this);
	}
	
}
