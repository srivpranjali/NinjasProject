package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import driverFactory.MyDriverFactory;
import utilities.ConfigReader;
import pageObjects.ArrayPage;
import pageObjects.HomePage;

public class ArraySD {
	
	private ConfigReader reader = new ConfigReader();
	private WebDriver driver = MyDriverFactory.getDriver();
	private ArrayPage arrayPage = new ArrayPage(driver);
	private HomePage homePage = new HomePage();
	
	@Given("User is on Login Page of portal")
	public void user_is_on_login_page_of_portal() {
		    
	    
	}

	@When("User enter valid username {string} and password {string}")
	public void user_enter_valid_username_and_password(String string, String string2) {
	    
	    
	}

	@Then("User is redirected to Home Page")
	public void user_is_redirected_to_home_page() {
	    
	    
	}

	@Given("User is logged in to Home Page")
	public void user_is_logged_in_to_home_page() {
	    
	    
	}

	@When("User clicks Get Started button under Array")
	public void user_clicks_get_started_button_under_array() {
		arrayPage.click_getStarted_Arrays();
	    
	    
	}

	@Then("User should be redirected to the {string} page")
	public void user_should_be_redirected_to_the_page(String string) {
		Assert.assertEquals(arrayPage.arrayTitle(),string );
	    
	}

	@Given("User is on the Array page")
	public void user_is_on_the_array_page() {
	    MyDriverFactory.getDriver().get(reader.getProperty("Arrays_URL"));
	    
	}

	@When("User clicks link from the list of topics covered {string}")
	public void user_clicks_link_from_the_list_of_topics_covered(String string) {
	    arrayPage.click_ArrayOptions(string);
	    
	}

	@Then("User should be redirected to respective page of {string}")
	public void user_should_be_redirected_to_respective_page_of(String destinationURL) {
		Assert.assertEquals(driver.getCurrentUrl(), destinationURL);
			    
	}

	@Given("User is on the particular page {string}")
	public void user_is_on_the_particular_page(String arrayOptions) {
		switch(arrayOptions) {
		case "Arrays in python":
			MyDriverFactory.getDriver().get(reader.getProperty("Array_In_Python_URL"));
			break;			
		case "Arrays Using List":
			MyDriverFactory.getDriver().get(reader.getProperty("Array_Using_List_URL"));
			break;
		case "Basic Operations in Lists":
			MyDriverFactory.getDriver().get(reader.getProperty("Basic_Operations_In_List_URL"));
			break;
		case "Applications of Array":
			MyDriverFactory.getDriver().get(reader.getProperty("Applications_Of_Array_URL"));
			break;
		default:
			break;
		}
	    
	}

	@When("User clicks on Try Here button of page {string}")
	public void user_clicks_on_try_here_button_of_page(String options) {
	    arrayPage.click_TryHere();
	    
	}

	@Then("User should be redirected to TryEditor page having Run button")
	public void user_should_be_redirected_to_try_editor_page_having_run_button() {
		Assert.assertEquals(driver.getCurrentUrl(),reader.getProperty("tryEditorUrl"));
		// code for checking if the run button is displayed
	    
	}

	@Given("User is on the tryEditor page of Array with Run button")
	public void user_is_on_the_try_editor_page_of_array_with_run_button() {
	    MyDriverFactory.getDriver().get(reader.getProperty("tryEditorUrl"));
	    
	}

	@When("User writes the valid code in editor from {string} and {int} and click Run button")
	public void user_writes_the_valid_code_in_editor_from_and_and_click_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	    arrayPage.enterCodePython(sheetname, rownumber);
	    arrayPage.click_Run();
	    
	}

	@Then("User should be able to see correct output in the console")
	public void user_should_be_able_to_see_correct_output_in_the_console() throws InvalidFormatException, IOException {
		Assert.assertEquals(arrayPage.getCodeOutput("dsalgocode", 0),arrayPage.getEditorOutput());
	    
	}

	@When("User writes the invalid code in editor from {string} and {int} and click Run button")
	public void user_writes_the_invalid_code_in_editor_from_and_and_click_run_button(String string, Integer int1) throws InvalidFormatException, IOException {
	    arrayPage.enterCodePython(string, 0);
	    arrayPage.click_Run();
	    
	}

	@Then("User should be able to see error message in alert window")
	public void user_should_be_able_to_see_error_message_in_alert_window() {
		driver.switchTo().alert().accept();
	    
	}
	
	@Given("User is on the Applications of Array page")
	public void user_is_on_the_applications_of_array_page() {
		driver.get(reader.getProperty("Applications_Of_Array_URL"));

	}

	@When("User clicks Array Practice Questions link")
	public void user_clicks_array_practice_questions_link() {
	   arrayPage.click_PracticeQuestions();
	}

	@Then("User is redirected to practice page having {int} links")
	public void user_is_redirected_to_practice_page_having_links(Integer int1) {
		Assert.assertEquals(driver.getCurrentUrl(),reader.getProperty("Array_Practice_Questions_URL"));
	}

	@Given("User is on Array Practice Questions page")
	public void user_is_on_array_practice_questions_page() {
		MyDriverFactory.getDriver().get(reader.getProperty("Array_Practice_Questions_URL"));
	      
	}

	@When("User clicks link from the list {string}")
	public void user_clicks_link_from_the_list(String questions) {
	    arrayPage.click_PracticeQuestionsOptions(questions);
	    
	}

	@Then("User should be redirected to {string} page having a question, tryEditor with Run and Submit buttons")
	public void user_should_be_redirected_to_page_having_a_question_try_editor_with_run_and_submit_buttons(String destinationUrl) {
		Assert.assertEquals(driver.getCurrentUrl(), destinationUrl);
	    
	}

	@Given("User is on the {string} practice editor page")
	public void user_is_on_the_practice_editor_page(String string) {
		driver.get(reader.getProperty("Search_The_Array_URL"));
	    
	}

	@When("User writes the valid code in practice editor from {string} and {int} and click Run button")
	public void user_writes_the_valid_code_in_practice_editor_from_and_and_click_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
	    arrayPage.enterCodePractice(sheetname, rownumber);
	    Thread.sleep(2000);
	    arrayPage.click_Run();
	}
	
	@Then("User should be able to see correct output in the practice console")
	public void user_should_be_able_to_see_correct_output_in_the_practice_console() {
	    arrayPage.getResult();
	    //code for assertion
	}
	
	@When("User writes the valid code in editor from {string} and {int} and click Submit button")
	public void user_writes_the_valid_code_in_editor_from_and_and_click_submit_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
	    arrayPage.enterCodePractice(sheetname, rownumber);
	    arrayPage.click_Submit();
	    
	}

	@Then("User should be able to see correct output on submission")
	public void user_should_be_able_to_see_correct_output_on_submission() {
	    arrayPage.getQuestionOutput();
	    //add code to assert
	    
	}

}
