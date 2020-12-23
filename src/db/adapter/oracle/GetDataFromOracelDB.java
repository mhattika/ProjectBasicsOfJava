package db.adapter.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class GetDataFromOracelDB {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver, "C://Users//Mahesh//eclipse-workspace//ProjectOne//Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("http://newtours.demoaut.com/");
		
		
		Connection con=DriverManager.GetConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		Statement stmt = con.createStatement();
		
		String s = "select user,passwrd from users')"; 
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next())
		{
			String username=rs.GetString.username;
			String pasword = rs.GetString.passwrd;
			
			//System.out.print(username + "   ");
			//System.out.println(password);
			
			driver.findElement(By.name("username")).sentKeys(username);
			driver.findElement(By.name("password")).sentKeys(password);
			driver.finfElement(By.name("login")).click();
			
			if(driver.getTitle().equals("Find a Flight: Mefcury Tours") )
			{
				System.out.println("test case passed");
			}
			else 
			{
				
				System.out.println("test case failed");
			}
			
			driver.finfElement(By.linkText("Home"));
			
		}
		con.close();
	}

}
