package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//ssimport Common.*;

//import com.aventstack.extentreports.ExtentReporter;


public class WebDriverFactory {
	
	public static WebDriver driver;
	public static String chromeDriverPath = "D://selenium/chromedriver.exe";
	//public static ExtentReporter extent;
	//public static com.aventstack.extentreports.ExtentTest test;
	//public static PropertiesConfig LoginPagedata = new PropertiesConfig();
	//public static PropertiesConfig LoginPagedata =new PropertiesConfig();
	public static Properties prop = new Properties();
	public static InputStream input;
	
	
	
	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		/*String extentReportFile = System.getProperty("user.dir")
				+ "\\extentReportFile.html";
		extent = new ExtentReporter(extentReportFile,true);*/
		// Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
			input = new FileInputStream("C:\\Users\\nmane\\eclipse-workspace\\POM_project\\Env_config.properties");
			prop.load(input);
		
       
/*
        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "emulator-5554");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability(CapabilityType.VERSION, "8.0.0");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");
        
        capabilities.setCapability("app", "D:\\InitialSetup\\Saba Cloud_v1.5.0_apkpure.com.apk");

        // Set android appPackage desired capability. It is
        // com.android.calculator2 for calculator application.
        // Set your application's appPackage if you are using any other app.
        //capabilities.setCapability("appPackage", "4eb3b0fc u0 com.saba.spc");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
       //setCapability("appActivity", "com.saba.spc.SPCActivity");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.
        try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
*/
			
			
			
			
	}
	
	@BeforeMethod
	public void setDriver(Method method)
	{
		/*test=extent.startTest((this.getClass().getSimpleName()+" :: "+method.getName()),method.getName());
		test.assignCategory("SPSCommerce Tests...");
		test.log(LogStatus.INFO, "Launching the Browser...");
		*/
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		System.out.println("\n\t after system set property");
		driver = new ChromeDriver();
		System.out.println("BEFORE google\n");
		String url = prop.getProperty("url");
		//driver.get("https://www.google.co.in");
		driver.get(url);
		System.out.println("AFTER google\n");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void testClosure()
	{
		driver.close();
		driver.quit();
		//test.log(LogStatus.INFO, "Browser Closed successfully...");
		
		//extent.endTest(test);	
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	/*
	public static String capture(WebDriver dr,String screenShotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)dr;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") +"\\ScreenShots\\"+screenShotName+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);   
        return dest;
	}
	
	@AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        /*if(result.getStatus() == ITestResult.FAILURE)
        {
            String screenShotPath = capture(dr, "screenShotName");
            test.log(LogStatus.FAIL, result.getThrowable());
            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
        }
        //dr.close();
		//dr.quit();
		test.log(LogStatus.INFO, "Browser Closed successfully...");
        extent.endTest(test);
    }
	*/
	
	@AfterSuite
	public void afterSuite()
	{
	//	driver.quit();
		
		/*extent.flush();
		extent.close();*/
		
	}
	
	
}