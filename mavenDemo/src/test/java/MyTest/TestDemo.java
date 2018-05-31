package MyTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestDemo {
	
	@BeforeTest
	public void setup() {
		System.out.println("hello");
	}
	
	@AfterTest
	public void TearDown() {
		System.out.println("goodbay");
	}

}
