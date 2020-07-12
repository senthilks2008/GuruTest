package TestNgPack;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
BEFORESUITE This will execute before the Test Suite
BEFORETEST This will execute before the Test
BEFORECLASS This will execute before the Class

	TEST Annotation starts
BEFOREMETHOD  This will execute before every Method
TEST This is the A Normal Test Case ONE 
AFTERMETHOD  This will execute after every Method
BEFOREMETHOD  This will execute before every Method
TEST This is the A Normal Test Case Two
AFTERMETHOD  This will execute after every Method
	TEST Annotation ENDS

AFTERCLASS This will execute after the Class
AFTERTEST This will execute after the Test
AFTERSUITE This will execute after the Test Suite
 */
public class Annot {


	
	@Test
	public void testCase1() {

		System.out.println("TEST This is the A Normal Test Case ONE ");
	}

	@Test
	public void testCase2() {

		System.out.println("TEST This is the A Normal Test Case Two");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("BEFOREMETHOD  This will execute before every Method");

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("AFTERMETHOD  This will execute after every Method");
	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("BEFORECLASS This will execute before the Class");

	}

	@AfterClass

	public void afterClass() {

		System.out.println("AFTERCLASS This will execute after the Class");

	}

	@BeforeTest

	public void beforeTest() {

		System.out.println("BEFORETEST This will execute before the Test");

	}

	@AfterTest

	public void afterTest() {

		System.out.println("AFTERTEST This will execute after the Test");

	}

	@BeforeSuite

	public void beforeSuite() {

		System.out.println("BEFORESUITE This will execute before the Test Suite");

	}

	@AfterSuite

	public void afterSuite() {

		System.out.println("AFTERSUITE This will execute after the Test Suite");

	}

}