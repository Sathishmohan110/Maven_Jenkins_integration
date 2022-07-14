package mavendemo.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest {
	@Test
	public void aTest() {
		System.out.println("hi kkkkkkkkkkkkk");
		Assert.assertTrue(false);
	}
	
		@Test
		public void bTest() {
			System.out.println("hi in Second");
			//Assert.assertTrue(false);
		}

}
