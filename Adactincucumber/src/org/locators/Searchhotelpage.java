package org.locators;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotelpage extends Base {
	
	@FindBy(xpath="//a[text()=\"Search Hotel\"]")
	private WebElement searchHotelButton; 

	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement bookedItinerary;
	
	@FindBy(xpath="//a[text()=\"Change Password\"]")
	private WebElement changepassword;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logout;
	
	@FindBy(css="td[class=\"login_register\"]")
	private WebElement newRegisterButton;
	
	@FindBy(xpath="//strong[text()=\"Go to Build 2 \"]")
	private WebElement goToBuild2;
	
	@FindBy(xpath="//a[text()=\"Adactin.com\"]")
	private WebElement footerElement;
	
	@FindBy(xpath="(//select[@class=\"search_combobox\"])[1]")
	private WebElement locationdropdown;
	
	@FindBy(id="hotels")
	private WebElement hotelsdropdown;
	
	@FindBy(name="room_type")
	private WebElement roomtypedropdown;
	
	@FindBy(name="room_nos")
	private WebElement roomnosdropdown;
	
	@FindBy(name="datepick_in")
	private WebElement datein;
	
	
	@FindBy(name="datepick_out")
	private WebElement dateout;
	
	@FindBy(name="adult_room")
	private WebElement adultroom;
	
	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(name="Submit")
	private WebElement submitbutton;
	
	@FindBy(id="Reset")
	private WebElement resetButton;
	
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

	public WebElement getNewRegisterButton() {
		return newRegisterButton;
	}

	public WebElement getGoToBuild2() {
		return goToBuild2;
	}

	public WebElement getFooterElement() {
		return footerElement;
	}

	public WebElement getLocationdropdown() {
		return locationdropdown;
	}

	public WebElement getHotelsdropdown() {
		return hotelsdropdown;
	}

	public WebElement getRoomtypedropdown() {
		return roomtypedropdown;
	}

	public WebElement getRoomnosdropdown() {
		return roomnosdropdown;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}
	
public Searchhotelpage() {
	
	PageFactory.initElements(driver, this);
	
}

}
