package com.viji;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableSortingWithStreams04 {

	public static void main(String[] args) {
//		Click the column, values gets sorted
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("th[aria-label*='Veg/fruit name:']")).click();

//		Capture elements into list
		List<WebElement> allElements = driver.findElements(By.xpath("//tr/td[1]"));

//		Capture text of the element into new list(original list)
		List<String> OriginalList = allElements.stream().map(s -> s.getText()).collect(Collectors.toList());
//		sort the original list of step 3 - sorted list
		List<String> SortedList = OriginalList.stream().sorted().collect(Collectors.toList());
//		Compare original list vs sorted list
		Assert.assertTrue(OriginalList.equals(SortedList));

//		Get the price of rice
		List<String> price = allElements.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVeggiePrice(s))
				.collect(Collectors.toList());
		price.forEach(s -> System.out.println(s));

	}

	private static String getVeggiePrice(WebElement s) {

		return s.findElement(By.xpath("following-sibling::td[1]")).getText();

	}

//	@Test
//	public void WebTableSort(WebDriver driver) {

//	}

}
