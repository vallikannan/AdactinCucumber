package org.locators;

import org.baseclass.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinereypage extends Base {
	
	
	//public static WebDriver driver;
	
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

	public WebElement getSearchidquery() {
		return searchidquery;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getSearchHotelButtoninbottom() {
		return searchHotelButtoninbottom;
	}

	public WebElement getLogoutbottoninBottom() {
		return logoutbottoninBottom;
	}

	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement bookedItinerary;
	
	@FindBy(xpath="//a[text()=\"Change Password\"]")
	private WebElement changepassword;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logout;
	
	@FindBy(id="order_id_text")
	private WebElement searchidquery;
	
	@FindBy(id="search_hotel_id")
	private WebElement goButton;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement cancelButton;
	
	@FindBy(id="search_hotel")
	private WebElement searchHotelButtoninbottom;
	
	@FindBy(id="logout")
	private WebElement logoutbottoninBottom;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[3]")
	private WebElement itinereylocation;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[2]")
	private WebElement itinereyHotelName;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[4]")
	private WebElement itinereyrooms;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[5]")
	private WebElement itinereyFirstName;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[6]")
	private WebElement itinereyLastName;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[7]")
	private WebElement itinereyDateIN;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[8]")
	private WebElement itinereyDateOut;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[10]")
	private WebElement itinereyRoomType;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[9]")
	private WebElement itinereyNumberOfDays;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[11]")
	private WebElement itinereyPricePerNight;
	
	@FindBy(xpath="(//input[@onkeypress=\"return Nothingonly(event)\"])[12]")
	private WebElement itinereyTotalPrice;
	
	@FindBy(xpath="(//input[@onkeypress='return Nothingonly(event)'])[1]")
	private WebElement orderId;
	
	
	
	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getItinereyHotelName() {
		return itinereyHotelName;
	}

	public WebElement getItinereyrooms() {
		return itinereyrooms;
	}

	public WebElement getItinereyFirstName() {
		return itinereyFirstName;
	}

	public WebElement getItinereyLastName() {
		return itinereyLastName;
	}

	public WebElement getItinereyDateIN() {
		return itinereyDateIN;
	}

	public WebElement getItinereyDateOut() {
		return itinereyDateOut;
	}

	public WebElement getItinereyRoomType() {
		return itinereyRoomType;
	}

	public WebElement getItinereyNumberOfDays() {
		return itinereyNumberOfDays;
	}

	public WebElement getItinereyPricePerNight() {
		return itinereyPricePerNight;
	}

	public WebElement getItinereyTotalPrice() {
		return itinereyTotalPrice;
	}

	public WebElement getItinereylocation() {
		return itinereylocation;
	}

	public BookedItinereypage() {
		
		PageFactory.initElements(driver, this);
	}

	
//public BookedItinereypage(WebDriver ldriver) {
//		
//		this.driver = ldriver;
//		
//		PageFactory.initElements(driver, this);
//	}
}
