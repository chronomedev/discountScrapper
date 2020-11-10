package com.diskonscrapper.helper;

import java.io.IOException;

//objek helper untuk selenium webdriver
//ChronomeDev 2020

// default direktori envi springboot appnya \eclipse-workspace\discountScrapper

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webDriverHelper {
	public ChromeDriver driverGogel;
	
	// konstruktor
	public webDriverHelper() {
		
		// inisialisasi driver
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\chromedriver.exe");
		
		//start cmd argumen chrome driver
        ChromeOptions opsiArgumen = new ChromeOptions();
        opsiArgumen.addArguments("--headless","--start-maximized");
        //opsiArgumen.addArguments("--start-maximized");
        this.driverGogel = new ChromeDriver(opsiArgumen);
	}
	
	public void fungsiJs(String source_code) {
        JavascriptExecutor eksekusi = (JavascriptExecutor) this.driverGogel;
        eksekusi.executeScript(source_code);
    }
	
	//tunggu page load
    public boolean tungguLoad(){
        return ((JavascriptExecutor) this.driverGogel).executeScript("return document.readyState").equals("complete");
    }

    public void tungguPage(){
        while (tungguLoad() !=  true) {
            System.out.println("belom bos");
        }
    }
    
    public void killProsesWebDriver() {
    	    if(System.getProperty("os.name").contains("Windows")) {
    	            Process process;
					try {
						process = Runtime. getRuntime(). exec("taskkill /F /IM chromedriver.exe /T");
	    	            process.destroy();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("ERRORRRR WAKTU MATIIN PROSES webdriver");
						e.printStackTrace();
					}
    	    }

    }
    
}
