package Myselpackage;

    import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Creatlead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	     //find the username enter the username value
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    //Find the password and enter the password value (crmsfa)
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //click the button
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //GetText
	    String text = driver.findElement(By.tagName("h2")).getText();
	    //print the tagname
	    System.out.println(text);
	    //verify by title
	      String title =driver.getTitle(); //ctrl+2+l //Leaftaps - TestLeaf Automation Platform
	     //print the title
	     System.out.println(title);
	     //click the crm/sfa
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     //click leads
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Create Lead")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aishwarya");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Soundar");
	     driver.findElement(By.className("smallSubmit")).click();
	     String title2 =driver.getTitle(); //ctrl+2+l //Leaftaps - TestLeaf Automation Platform
	     //print the title
	     System.out.println(title2);
	     //Find the password and enter the password value (crmsfa)
	     //Find the password and enter the password value (crmsfa)
	     //Find the password and enter the password value (crmsfa)
	     //driver.findElement(By.className("subMenuButton")).click();
	}


}
