package testNGListnerPractice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListnerDemo2 {

	@Test
	public void test4() {
		System.out.println("Test 4");
	}
	@Test
	public void test5() {
		System.out.println("Test 5");
		Assert.assertTrue(false);
	}
	@Test
	public void test6() {
		System.out.println("Test 6");
		throw new SkipException("Skip Exception");
	}
}
