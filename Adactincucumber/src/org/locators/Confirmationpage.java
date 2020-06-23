package org.locators;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmationpage extends Base{
	
	@FindBy(xpath="//a[text()=\"Search Hotel\"]")
	private WebElement searchHotelButton; 
	
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="final_price")
	private WebElement finalprice;
	
	
	public WebElement getFinalprice() {
		return finalprice;
	}

	public WebElement getSearchHotelButton() {
		return searchHotelButton;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getFirstnamedisplayed() {
		return firstnamedisplayed;
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

	public WebElement getSearchHotelButtoninbottom() {
		return searchHotelButtoninbottom;
	}

	public WebElement getMyItineraryButton() {
		return myItineraryButton;
	}

	public WebElement getLogoutbottoninBottom() {
		return logoutbuttoninBottom;
	}

	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement bookedItinerary;
	
	@FindBy(xpath="//a[text()=\"Change Password\"]")
	private WebElement changepassword;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logout;
	
	@FindBy(id="search_hotel")
	private WebElement searchHotelButtoninbottom;
	
	@FindBy(id="my_itinerary")
	private WebElement myItineraryButton;
	
	@FindBy(xpath="//input[@value='Logout']")
	private WebElement logoutbuttoninBottom;
	
	@FindBy(name="first_name")
	private WebElement firstnamedisplayed;
	
	@FindBy(id="hotel_name")
	private WebElement hotelNameDisplayed;
	
	@FindBy(id="total_rooms")
	private WebElement totalRoomDisplayed;
	
	@FindBy(id="adults_room")
	private WebElement adultsRoomDisplayed;
	
	@FindBy(id="children_room")
	private WebElement childrenRoomDisplayed;
	

	public WebElement getChildrenRoomDisplayed() {
		return childrenRoomDisplayed;
	}

	public WebElement getAdultsRoomDisplayed() {
		return adultsRoomDisplayed;
	}

	public WebElement getTotalRoomDisplayed() {
		return totalRoomDisplayed;
	}

	public WebElement getLogoutbuttoninBottom() {
		return logoutbuttoninBottom;
	}

	

	public WebElement getHotelNameDisplayed() {
		return hotelNameDisplayed;
	}

	public WebElement getLocationDisplayed() {
		return locationDisplayed;
	}

	public WebElement getRoomTypeDisplayed() {
		return roomTypeDisplayed;
	}

	public WebElement getDateInDisplayed() {
		return dateInDisplayed;
	}

	public WebElement getDateOutDisplayed() {
		return dateOutDisplayed;
	}

	public WebElement getNoOfRoomsDisplayed() {
		return noOfRoomsDisplayed;
	}

	public WebElement getPricePerNightDisplayed() {
		return pricePerNightDisplayed;
	}

	@FindBy(id="location")
	private WebElement locationDisplayed;
	
	@FindBy(id="room_type")
	private WebElement roomTypeDisplayed;
	
	@FindBy(id="arrival_date")
	private WebElement dateInDisplayed;
	
	@FindBy(id="departure_text")
	private WebElement dateOutDisplayed;
	
	@FindBy(id="total_rooms")
	private WebElement noOfRoomsDisplayed;
	
	@FindBy(id="price_night")
	private WebElement pricePerNightDisplayed;
	
	@FindBy(id="order_no")
	private WebElement orderNumber;
	
	
	
	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public WebElement getFirstNamedisplayed() {
		return firstnamedisplayed;
	}

	public Confirmationpage() {
		
		PageFactory.initElements(driver, this);
	}
		

}
