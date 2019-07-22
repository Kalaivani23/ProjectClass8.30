package org.maven.project.Selenium_Cucumber;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainProg extends Base{
	LocatorClass loc = new LocatorClass();
	String order=null,hotel=null,location=null,fname,lname,arrival,departure,room,roomType,pricePerNight,totalPrice;
	int text=0,days=0;
@Given("^User Performs Login in adactin application$")
public void user_Performs_Login_in_adactin_application(DataTable login) {
	Launch();
	loc = new LocatorClass();
	List<Map<String, String>> values = login.asMaps(String.class, String.class);
	type(loc.getTxtId(),values.get(0).get("UserName"));
	type(loc.getTxtPwd(),values.get(0).get("Password"));
	click(loc.getBtnLogin());
}

@Given("^User searches for the hotel$")
public void user_searches_for_the_hotel(DataTable search) {
	loc = new LocatorClass();
	Map<String,String> values = search.asMap(String.class, String.class);
	dropDown(loc.getDropDownLocation(),values.get("Location"));
	dropDown(loc.getDropDownHotel(), values.get("Hotels"));
	dropDown(loc.getDropDownRoomType(), values.get("RoomType"));
	dropDown(loc.getDropDownRoomNo(), values.get("NumberOfRooms"));
	clear(loc.getTxtDatePickIn());
	type(loc.getTxtDatePickIn(), values.get("Datepick_in"));
	clear(loc.getTxtDatePickOut());
	type(loc.getTxtDatePickOut(), values.get("Datepick_out"));
	dropDown(loc.getDropDownAdultRoom(), values.get("Adults_Per_Room"));
	dropDown(loc.getDropDownChildRoom(), values.get("Children_Per_Room"));
	click(loc.getBtnSubmit());
}

@When("^User validates and select the required hotel$")
public void user_validates_and_select_the_required_hotel(DataTable validate) throws InterruptedException {
	Thread.sleep(5000);
	loc = new LocatorClass();
	String txt = null;
	String val=null;
	int dt=0;
	int dt1=0;
	Map<String,String> values = validate.asMap(String.class, String.class);
	txt = get(loc.getValidateHotelName());
	hotel = values.get("Hotels");
	if(txt.equals(hotel))
		System.out.println("Hotel validated");
	else
		close();
	location = values.get("Location");
	txt = get(loc.getValidateLocation());
	if(txt.equals(location))
		System.out.println("Location validated");
	else
		close();
	val=values.get("NumberOfRooms");
	String temp []=val.split("-"); 
	txt = get(loc.getValidateRooms());
	room = temp[0];
	if(txt.contains(room))
		System.out.println("Rooms validated");
	else
		close();
	txt = get(loc.getValidateArrivalDate());
	arrival=values.get("Datepick_in");
	if(txt.equals(arrival))
		System.out.println("Arrival validated");
	else
		close();
	txt = get(loc.getValidateDepartureDate());
	departure = values.get("Datepick_out");
	if(txt.equals(departure))
		System.out.println("Departure validated");
	else
		close();
	val=arrival;
	String temp1 []=val.split("/"); 
	int date = Integer.parseInt(temp1[0]);
	val = departure;
	String tempdate []=val.split("/"); 
	int date1 = Integer.parseInt(tempdate[0]);
	if(date>date1)
	dt = date-date1;
	else
	dt = date1-date;
	txt = get(loc.getValidateArrivalDate());
	dt = dt+1;
	val=get(loc.getValidateArrivalDate());
	String temp2 []=val.split("/"); 
	int date2 = Integer.parseInt(temp2[0]);
	val =get(loc.getValidateDepartureDate());
	String tempdep []=val.split("/"); 
	int date3 = Integer.parseInt(tempdep[0]);
	if(date2>date3)
	dt1 = date2-date3;
	else
	dt1 = date3-date2;
	txt = get(loc.getValidateArrivalDate());
	dt1 = dt1+1;
	if(dt1==dt)
	{
		System.out.println("Days Validated");
		days=dt;
	}
	else
		close();
	txt = get(loc.getValidateRoomType());
	roomType= values.get("RoomType");
	if(txt.equals(roomType))
		System.out.println("Room Type validated");
	else
		close();
	totalPrice = get(loc.getPrintTotalPrice());
	System.out.println("Total Price : " +totalPrice);
	click(loc.getClickRadioContinue());
	click(loc.getBtnContinue());
}

@When("^User does hotel booking by giving required inputs$")
public void user_does_hotel_booking_by_giving_required_inputs(DataTable details) {
	Map<String, String> values = details.asMap(String.class, String.class);
	fname=values.get("Fname");
	type(loc.getTxtFirstName(),fname);
	lname=values.get("Lname");
	type(loc.getTxtLastName(),lname);
	type(loc.getTxtAddress(),values.get("Address"));
	type(loc.getTxtCCNum(),values.get("ccNum"));
	dropDown(loc.getDrpDownCCType(),values.get("ccType"));
	dropDown(loc.getDrpDownCCExpMonth(), values.get("Exp_month"));
	dropDown(loc.getDrpDownCCexpYear(), values.get("Exp_year"));
	type(loc.getTxtCvv(), values.get("cvv"));
	click(loc.getBtnBookNow());
}

@When("^User navigate to booking confirmation page$")
public void user_navigate_to_booking_confirmation_page() throws IOException, InterruptedException {
	Thread.sleep(5000);
	order = get(loc.getTxtOrderNo());
	System.out.println("Order number : " +order);
	screenShot();
	click(loc.getBtnItinerary());
}

@When("^User selects my itinery$")
public void user_selects_my_itinery() throws InterruptedException  {
	Thread.sleep(5000);
 List <WebElement> orderId = driver.findElements(By.tagName("input"));
 for (WebElement or : orderId) {
	 if(order.equals(or.getAttribute("value")))
	{
		System.out.println("Order validated");
		String hot = getList(loc.getTxtValidateHotelname());
		if(hotel.equals(hot));
		System.out.println("Hotel validated");
		String loca = getList(loc.getTxtValidLocationname());
		if(location.equals(loca));
		System.out.println("Location validated");
		String rm = getList(loc.getTxtValidRooms());
		if(room.equals(rm));
		System.out.println("Room validated");
		String fn = getList(loc.getTxtValidFirstName());
		if(fname.equals(fn));
		System.out.println("First name validated");
		String ln = getList(loc.getTxtValidLastName());
		if(fname.equals(ln));
		System.out.println("Last name validated");
		String a = getList(loc.getTxtValidArrivalDate());
		if(arrival.equals(a));
		System.out.println("arrival validated");
		String d = getList(loc.getTxtValidDeparturedate());
		if(departure.equals(d));
		System.out.println("departure validated");
		String dys = getList(loc.getTxtValidNoOfDays());
		String ds []= dys.split(" ");
		int day = Integer.parseInt(ds[0]);
		if(days==day);
		System.out.println("Days validated");
		String r = getList(loc.getTxtValidRoomType());
		if(roomType.equals(r));
		System.out.println("Room Type validated");
		String pr = getList(loc.getTxtValidTotalPrice());
		if(totalPrice.equals(pr));
		System.out.println("Total Price validated");
		click(loc.getClickCheckbox());
		break;
	}
}
 }

@Then("^User cancels the booking$")
public void user_cancels_the_booking() throws InterruptedException  {
	 click(loc.getBtnCancelAll());
	 Alert alrt = driver.switchTo().alert();
	 Thread.sleep(5000);
	 alrt.accept();
	 Thread.sleep(5000);

 close();  
}

	
}
