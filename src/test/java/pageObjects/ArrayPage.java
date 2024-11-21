package pageObjects;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utils;


public class ArrayPage {
	
	private WebDriver driver;
	Utils utils = new Utils();
	
	// Locators
	@FindBy (xpath = "//a[@href='array']") WebElement getStarted_Arrays;
	@FindBy (xpath = "//a[@href ='arrays-in-python']") WebElement arrays_in_python;
	@FindBy (xpath ="//a[@href ='arrays-using-list']") WebElement arrays_using_list;
	@FindBy (xpath ="//a[@href ='basic-operations-in-lists']") WebElement basic_operations_in_lists;
	@FindBy (xpath ="//a[@href ='applications-of-array']") WebElement applications_of_array;
	@FindBy (xpath ="//a[@href='/tryEditor']") WebElement try_here;
	@FindBy (xpath = "//div[@class = 'CodeMirror-scroll']") WebElement codeEditor;
	@FindBy (id = "output")WebElement codeOutput;
	
	@FindBy (xpath = "//a[@href = '/array/practice']") WebElement practice_Questions;
	@FindBy (xpath = "//a[@href = '/question/1']") WebElement question1;
	@FindBy (xpath = "//a[@href = '/question/2']") WebElement question2;
	@FindBy (xpath = "//a[@href = '/question/3']") WebElement question3;
	@FindBy (xpath = "//a[@href = '/question/4']") WebElement question4;
	
	@FindBy (xpath = "//textarea[@tabindex='0']")WebElement question_CodeInput;
	@FindBy (xpath = "//button[text() = 'Run']") WebElement run_button;
	@FindBy (xpath = "//input[@type = 'submit']") WebElement submit_button;
	@FindBy (id = "output") WebElement question_Output;
	

	public ArrayPage(WebDriver browserDriver) {
		driver = browserDriver;
		PageFactory.initElements(driver,this);
	}
	public void click_getStarted_Arrays() {
		getStarted_Arrays.click();
	}
	
	public String arrayTitle() {
		return driver.getTitle();
	}
		
	public void click_ArrayOptions(String arrayOptions) {
		switch(arrayOptions) {
		case "Arrays in Python":
			arrays_in_python.click();break;
		case "Arrays Using List":
			arrays_using_list.click();break;
		case "Basic Operations in Lists":
			basic_operations_in_lists.click();break;
		case "Applications of Array":
			applications_of_array.click();break;
		case "Practice Questions":
			practice_Questions.click();break;
		default:
			break;
			}
		}
	
	public void click_TryHere() {
		try_here.click();
	}
	
	public void click_PracticeQuestions() {
		practice_Questions.click();
	}
	
	public void click_PracticeQuestionsOptions(String Questions) {
		switch (Questions) {
		case "Search the array":
			question1.click();break;
		case "Max Consecutive Ones":
			question2.click();break;
		case "Find Numbers with Even Number of Digits":
			question3.click();break;
		case "Squares of  a Sorted Array":
			question4.click();break;
		default:
			break;
			}
	}
	
	public String practiceQuestionsTitle() {
		return driver.getTitle();
	}
	
	public void click_Run() {
		run_button.click();
	}
	
	public void click_Submit() {
		submit_button.click();
	}
	
	public String getEditorOutput() {
		return codeOutput.getText();
	}
	
	public String getQuestionOutput() {
		return question_Output.getText();
	}
	public String getResult() {
		utils.waitForElement(question_Output);
		return question_Output.getText();
	}
	
	public void enterCodePython(String sheetname, int rownumber) throws InvalidFormatException, IOException  {
		Utils utils = new Utils();
		String code = utils.getCodefromXls(sheetname, rownumber);
		this.enterCode(code, codeEditor);
	}
	
	public void enterCode(String code, WebElement element) {
         new Actions(driver).sendKeys(element, code).perform();
	}
	
	public String getCodeOutput(String sheetname, int rownumber) throws InvalidFormatException, IOException  {
		String result = utils.getOutputFromXls(sheetname, rownumber);
		return result;
	}	
	
	public void enterCodePractice(String sheetname, int rownumber) throws InvalidFormatException, IOException, InterruptedException {
		String code = utils.getCodefromXls(sheetname, rownumber);
		utils.enterCodePractice(code, question_CodeInput, driver);
	}
	
	public String getQuestionOutput(String sheetname, int rownumber) throws InvalidFormatException, IOException  {
		Utils utils = new Utils();
		String result = utils.getOutputFromXls(sheetname, rownumber);
		return result;
	}

}