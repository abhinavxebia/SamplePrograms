import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new FirefoxDriver();
		dr.get("http://in.bookmyshow.com/national-capital-region-ncr");
		
		WebElement comboBox = dr.findElement(By.xpath("//span[@class='ic-ardn']"));
		comboBox.click();
		List<WebElement> list = dr.findElements(By.xpath("//div[@class='wrap']/ul/li"));
		
		
		for(int i=0; i<list.size();i++)
		{
			if(!list.get(i).getAttribute("data-value").equalsIgnoreCase(""))
			System.out.println("Value of i = "+i+" : "+list.get(i).getText()+" and data value is "+list.get(i).getAttribute("data-value"));
		}
		dr.close();
	}

}
