package com.Stepdefinition.adactin;

import org.com.cucumber.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.Runnerclass.adactin.Runnerclass;

import io.cucumber.java.en.*;

public class stepdefinition {
	public static WebDriver driver;
	
	
	@Given("user on the Login Page")
	public void user_on_the_login_page() {
		System.out.println("Successful Login");
		driver = new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@When("user enters login id with {string}")
	public void user_enters_login_id_with(String string) {
		driver.findElement(By.id("username")).sendKeys(string);
	}
	@When("user enters password with {string}")
	public void user_enters_password_with(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@When("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.id("login")).click();
	}
	@Then("user should see Search Hotal Page")
	public void user_should_see_search_hotal_page() {
		System.out.println("Search Hotal Page");
	}
	
	
	
	
	

	@Given("User enters on Details in Manidatory Field")
	public void user_enters_on_details_in_manidatory_field() {
		System.out.println("User Filled on all Details");
	}
	
	@When("User Select a location in location field")
	public void user_select_a_location_in_location_field() {
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByIndex(2);
	}
	
	@When("User Select a Hotals in Hotals Field")
	public void user_select_a_hotals_in_hotals_field() {
		WebElement loc = driver.findElement(By.id("hotels"));
		Select s = new Select(loc);
		s.selectByIndex(2);

	}
	
	@When("User Select a Room Type in Room Type Field")
	public void user_select_a_room_type_in_room_type_field() {
		WebElement loc = driver.findElement(By.id("room_type"));
		Select s = new Select(loc);
		s.selectByIndex(2);

	}
	
	@When("User select a Number of Rooms in NOR Field")
	public void user_select_a_number_of_rooms_in_nor_field() {
		WebElement loc = driver.findElement(By.id("room_nos"));
		Select s = new Select(loc);
		s.selectByIndex(2);

	}
	
	@When("User enters on check in date in Check in date Field")
	public void user_enters_on_check_in_date_in_check_in_date_field() {
		driver.findElement(By.id("datepick_in")).sendKeys("02/03/2022");
	}
	
	@When("User enters on check out date in Check out date Field")
	public void user_enters_on_check_out_date_in_check_out_date_field() {
		driver.findElement(By.id("datepick_out")).sendKeys("04/03/2022");
	}
	
	@When("User Select a Adults per Room in Adults per Room Field")
	public void user_select_a_adults_per_room_in_adults_per_room_field() {
		WebElement loc = driver.findElement(By.id("adult_room"));
		Select s = new Select(loc);
		s.selectByIndex(2);

	}
	
	@When("User Select a Children per Room in Children per Room Field")
	public void user_select_a_children_per_room_in_children_per_room_field() {
		WebElement loc = driver.findElement(By.id("child_room"));
		Select s = new Select(loc);
		s.selectByIndex(2);

	}
	
	@When("if any issues Click on Reset button or if ok click on search button")
	public void if_any_issues_click_on_reset_button_or_if_ok_click_on_search_button() {
		driver.findElement(By.id("Submit")).click();
	}
	
	@Then("If verifes The Search Hotal Page an move to next page is successful")
	public void if_verifes_the_search_hotal_page_an_move_to_next_page_is_successful() {
		System.out.println("Successfully Filled The Details on Page and Next Page moveed");
	}
	
	@Then("navigate to the Select Hotal  page")
	public void navigate_to_the_select_hotal_page() {
		System.out.println("Select Hotal  page");
	}



	@Given("User click to select the Hotal on Select field")
	public void user_click_to_select_the_hotal_on_select_field() {
		driver.findElement(By.name("radiobutton_0")).click();
	}
	
	@When("if user Given  any incorrect Details cilck on Cancle Button Or if ok Click on Continue Button")
	public void if_user_given_any_incorrect_details_cilck_on_cancle_button_or_if_ok_click_on_continue_button() {
       driver.findElement(By.name("continue")).click();
	}
	
	@Then("Verifies the Select Hotal page is successfully Move to Next page")
	public void verifies_the_select_hotal_page_is_successfully_move_to_next_page() {
		System.out.println("Select Hotal page is successfully moved to next page");
	}
	
	@Then("navigate to Book a Hotal Page")
	public void navigate_to_book_a_hotal_page() {
		System.out.println("Book a Hotal Page");
	}

	
	
	
	

	@Given("User  check the Details in Manidatory Field")
	public void user_check_the_details_in_manidatory_field() {
		System.out.println("All Details Will be Checked on User");
	}
	
	@When("User enters on Frist name in frist name field")
	public void user_enters_on_frist_name_in_frist_name_field() {
		driver.findElement(By.id("first_name")).sendKeys("KAMESH");
	}
	
	@When("User enters on last name in last name field")
	public void user_enters_on_last_name_in_last_name_field() {
		driver.findElement(By.id("last_name")).sendKeys("K");
	}
	
	@When("User enters on Billing Address in Billing Address field")
	public void user_enters_on_billing_address_in_billing_address_field() {
		driver.findElement(By.id("address")).sendKeys("1/208 Budur");
	}
	
	@When("User enters on Credit Card No in Credit Card No field")
	public void user_enters_on_credit_card_no_in_credit_card_no_field() {
		driver.findElement(By.id("cc_num")).sendKeys("2222444488885555");
	}
	
	@When("User Select a Credit Card Type in Credit Card Type field")
	public void user_select_a_credit_card_type_in_credit_card_type_field() {
		WebElement loc = driver.findElement(By.id("cc_type"));
		Select s = new Select(loc);
		s.selectByIndex(3);

		
	}
	
	@When("User Select a Expiry Date in Expiry Date field")
	public void user_select_a_expiry_date_in_expiry_date_field() {
		WebElement loc = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(loc);
		s.selectByIndex(2);

		WebElement loc1 = driver.findElement(By.id("cc_exp_year"));
		Select s1 = new Select(loc1);
		s1.selectByIndex(2);

	}
	
	@When("User enters on CVV Number in CVV Number field")
	public void user_enters_on_cvv_number_in_cvv_number_field() {
		driver.findElement(By.id("cc_cvv")).sendKeys("200");
	}
	
	@When("if ok for user Given details Click on Book Button or if any in corrct details Click on cancel Button")
	public void if_ok_for_user_given_details_click_on_book_button_or_if_any_in_corrct_details_click_on_cancel_button() throws InterruptedException {
	driver.findElement(By.id("book_now")).click();
	Thread.sleep(12000);
	}
	
	@Then("if verify the user is Successful hotal booking")
	public void if_verify_the_user_is_successful_hotal_booking() {
		System.out.println("Successfully hotal booking");
	}
	
	@Then("navigate To Booked Itinerary Page")
	public void navigate_to_booked_itinerary_page() {
		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
		System.out.println("Itinerary Page Opened");
	}
	



	
	

	@Given("User select a Orders")
	public void user_select_a_orders() {
		driver.findElement(By.name("ids[]")).click();
		
	}
	
	@When("Click on Cancel Button")
	public void click_on_cancel_button() {
		driver.findElement(By.name("cancelall")).click();
		driver.switchTo().alert().accept();
	}
	
	@Then("if verifies the Booking Cancel")
	public void if_verifies_the_booking_cancel() {
		System.out.println("Booking Cancled");
	}
	
	@Then("navigate LogOut page")
	public void navigate_log_out_page() {
		System.out.println("navigate LogOut page");
		
	}




	@Given("Click on LogOut Button")
	public void click_on_log_out_button() {
		driver.findElement(By.id("logout")).click();
	}
	
	@Then("if adactin Hotal Booking page is successfully LogOut")
	public void if_adactin_hotal_booking_page_is_successfully_log_out() {
		System.out.println("adactin Hotal Booking page is successfully LogOut");

	}
	
	@Then("Broswer will be Closed")
	public void broswer_will_be_closed() {
		driver.close();
		System.out.println("Url Closed");
	}
	



	
	






}
