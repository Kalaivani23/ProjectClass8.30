package org.maven.project.Selenium_Cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LocatorClass extends Base {

	public LocatorClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtId;

	@FindBy(id = "password")
	private WebElement txtPwd;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(id = "location")
	private WebElement dropDownLocation;

	@FindBy(id = "hotels")
	private WebElement dropDownHotel;

	@FindBy(id = "room_type")
	private WebElement dropDownRoomType;

	@FindBy(id = "room_nos")
	private WebElement dropDownRoomNo;

	@FindBy(id = "datepick_in")
	private WebElement txtDatePickIn;

	@FindBy(id = "datepick_out")
	private WebElement txtDatePickOut;

	@FindBy(id = "adult_room")
	private WebElement dropDownAdultRoom;

	@FindBy(id = "child_room")
	private WebElement dropDownChildRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement validateHotelName;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement validateLocation;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement validateRooms;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement validateArrivalDate;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement validateDepartureDate;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement validatenoOfDays;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement validateRoomType;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement printTotalPrice;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement clickRadioContinue;

	@FindBy(id = "continue")
	private WebElement btnContinue;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement txtLastName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement txtAddress;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement txtCCNum;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement drpDownCCType;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement drpDownCCExpMonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement drpDownCCexpYear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement txtCvv;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement btnBookNow;

	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement txtOrderNo;
	
	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement btnItinerary;
	
	@FindBy(xpath=("//input[contains(@name,'hotel_name_')]"))
	private List<WebElement> txtValidateHotelname;
	
	@FindBy(xpath=("//input[contains(@name,'location_')]"))
	private List<WebElement> txtValidLocationname;
	
	@FindBy(xpath=("//input[contains(@name,'rooms_')]"))
	private List<WebElement> txtValidRooms;
	
	@FindBy(xpath=("//input[contains(@name,'first_name_')]"))
	private List<WebElement> txtValidFirstName;
	
	@FindBy(xpath=("//input[contains(@name,'last_name_')]"))
	private List<WebElement> txtValidLastName;
	
	@FindBy(xpath=("//input[contains(@name,'arr_date_')]"))
	private List<WebElement> txtValidArrivalDate;
	
	@FindBy(xpath=("//input[contains(@name,'dep_date_')]"))
	private List<WebElement> txtValidDeparturedate;
	
	@FindBy(xpath=("//input[contains(@name,'no_days_')]"))
	private List<WebElement> txtValidNoOfDays;
	
	@FindBy(xpath=("//input[contains(@name,'room_type_')]"))
	private List<WebElement> txtValidRoomType;
	
	@FindBy(xpath=("//input[contains(@name,'total_price_')]"))
	private List<WebElement> txtValidTotalPrice;
	

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement btnCancelAll;

	@FindBy(xpath=("//input[contains(@name,'ids[')]"))
	private WebElement clickCheckbox;
	
	
		
	public WebElement getClickCheckbox() {
		return clickCheckbox;
	}

	public WebElement getBtnCancelAll() {
		return btnCancelAll;
	}

	public List<WebElement> getTxtValidLocationname() {
		return txtValidLocationname;
	}

	public List<WebElement> getTxtValidRooms() {
		return txtValidRooms;
	}

	public List<WebElement> getTxtValidFirstName() {
		return txtValidFirstName;
	}

	public List<WebElement> getTxtValidLastName() {
		return txtValidLastName;
	}

	public List<WebElement> getTxtValidArrivalDate() {
		return txtValidArrivalDate;
	}

	public List<WebElement> getTxtValidDeparturedate() {
		return txtValidDeparturedate;
	}

	public List<WebElement> getTxtValidNoOfDays() {
		return txtValidNoOfDays;
	}

	public List<WebElement> getTxtValidRoomType() {
		return txtValidRoomType;
	}

	public List<WebElement> getTxtValidTotalPrice() {
		return txtValidTotalPrice;
	}

	public List<WebElement> getTxtValidateHotelname() {
		return txtValidateHotelname;
	}

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getBtnItinerary() {
		return btnItinerary;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getDrpDownCCType() {
		return drpDownCCType;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNum() {
		return txtCCNum;
	}

	public WebElement getDrpDownCCExpMonth() {
		return drpDownCCExpMonth;
	}

	public WebElement getDrpDownCCexpYear() {
		return drpDownCCexpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getClickRadioContinue() {
		return clickRadioContinue;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getValidateHotelName() {
		return validateHotelName;
	}

	public WebElement getValidateLocation() {
		return validateLocation;
	}

	public WebElement getValidateRooms() {
		return validateRooms;
	}

	public WebElement getValidateArrivalDate() {
		return validateArrivalDate;
	}

	public WebElement getValidateDepartureDate() {
		return validateDepartureDate;
	}

	public WebElement getValidatenoOfDays() {
		return validatenoOfDays;
	}

	public WebElement getValidateRoomType() {
		return validateRoomType;
	}

	public WebElement getPrintTotalPrice() {
		return printTotalPrice;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getDropDownLocation() {
		return dropDownLocation;
	}

	public WebElement getDropDownHotel() {
		return dropDownHotel;
	}

	public WebElement getDropDownRoomType() {
		return dropDownRoomType;
	}

	public WebElement getDropDownRoomNo() {
		return dropDownRoomNo;
	}

	public WebElement getTxtDatePickIn() {
		return txtDatePickIn;
	}

	public WebElement getTxtDatePickOut() {
		return txtDatePickOut;
	}

	public WebElement getDropDownAdultRoom() {
		return dropDownAdultRoom;
	}

	public WebElement getDropDownChildRoom() {
		return dropDownChildRoom;
	}

	public WebElement getTxtId() {
		return txtId;
	}

	public WebElement getTxtPwd() {
		return txtPwd;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}


}
