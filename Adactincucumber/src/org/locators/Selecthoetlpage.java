package org.locators;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthoetlpage extends Base {
	
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

	public WebElement getSelectHotelRadiobutton() {
		return selectHotelRadiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement bookedItinerary;
	
	@FindBy(xpath="//a[text()=\"Change Password\"]")
	private WebElement changepassword;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logout;
	
	@FindBy(id="location_0")
	private WebElement location;
	
	@FindBy(id="arr_date_0")
	private WebElement datein;
	
	@FindBy(id="rooms_0")
	private WebElement roomNos;
	
	@FindBy(id="room_type_0")
	private WebElement roomtype;
	
	@FindBy(id="total_price_0")
	private WebElement totalPrice;
	
	
	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	@FindBy(id="dep_date_0")
	private WebElement dateout;
	
	
	public WebElement getLocation() {
		return location;
	}

	@FindBy(name="radiobutton_0")
	private WebElement selectHotelRadiobutton;
	
	@FindBy(name="continue")
	private WebElement continuebutton;
	
	@FindBy(id="cancel")
	private WebElement cancelbutton;
	
	public Selecthoetlpage() {
		PageFactory.initElements(driver, this);
	}
	
}
