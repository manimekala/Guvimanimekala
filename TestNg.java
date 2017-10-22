package jira;

import org.testng.annotations.Test;

public class TestNg {
	@Test (priority=2,dependsOnGroups = {"yes"})
	public void test1()
	{
	 System.out.println("this is test method ONE");
	}
	@Test
	public void test2()
	{
		System.out.println("This is the test method TWO");
	}
	@Test( groups={"yes","bus"})
	public void test3()
	{
		System.out.println("This is the test method THREE");
	}
	@Test( groups={"yes","cat"})
	public void test5()
	{
		System.out.println("This is the test method FIVE");
	}
	
	@Test(priority=3, groups={"bus"})
	public void test4()
	{
		System.out.println("This is foru method");
	}

}
/*1)THREE GROUP,PRIORITY=0
2)FIVE GROUP
3)*/