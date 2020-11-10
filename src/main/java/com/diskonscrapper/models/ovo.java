package com.diskonscrapper.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.diskonscrapper.helper.webDriverHelper;
import com.diskonscrapper.interfaces.discount_interface;
import java.util.List;

public class ovo extends discount_model {

	@Override
	public void initURLDiscount() {
		// TODO Auto-generated method stub
		this.driverHelper = new webDriverHelper();
		this.driverHelper.driverGogel.get("https://www.ovo.id/deals"); // url diskon ovo
		this.driverHelper.tungguPage();
	}
	
	@Override
	public void getDiscountData() {
		// TODO Auto-generated method stub
		System.out.println("MASUK GETDISCOUNT DATA");
		List<WebElement> elemenDiskon = this.driverHelper.driverGogel.findElements(By.cssSelector("div[class='ovo-deal-image-text ']"));
		this.judulDiskon = new String[elemenDiskon.size()];
		
		
		for(int z = 0;z<elemenDiskon.size();z++) {
			System.out.println("MASUK LOOP");
			WebElement subElemen = elemenDiskon.get(z).findElement(By.tagName("h5"));
			System.out.println(subElemen);
			this.judulDiskon[z] = subElemen.getAttribute("innerHTML").toString();
			System.out.println(this.judulDiskon[z]);
			//dataDiskon[z] = elemenDiskon.get(z).findElement(By.tagName("h5"));
		}
		System.out.println("MASUK SELESAI");
		//return null;
	}

	@Override
	public void getDiscountImageData() {
		// TODO Auto-generated method stub
		System.out.println("MASUK GETDISCOUNT DATA");
		List<WebElement> elemenDiskon = this.driverHelper.driverGogel.findElements(By.cssSelector("div[class='ovo-deal-image-wrapper ']"));
		this.imageDiskon = new String[elemenDiskon.size()];
		
		
		for(int z = 0;z<elemenDiskon.size();z++) {
			WebElement subElemen = elemenDiskon.get(z).findElement(By.tagName("img"));
			System.out.println(subElemen);
			this.imageDiskon[z] = subElemen.getAttribute("src").toString();
			System.out.println(this.imageDiskon[z]);
		}
		
	}

	@Override
	public void getDiscountLinkDetailData() {
		// TODO Auto-generated method stub
		System.out.println("MASUK DETAIL DATA");
		List<WebElement> elemenDiskon = this.driverHelper.driverGogel.findElements(By.cssSelector("a[class='ovo-deals-list-link inline ']"));
		this.url_diskonDetail = new String[elemenDiskon.size()];
		
		for(int z = 0;z<elemenDiskon.size();z++) {
			System.out.println("MASUK LOOP");
			this.url_diskonDetail[z] = elemenDiskon.get(z).getAttribute("href");
			System.out.println(this.url_diskonDetail[z]);
		}
		
		
	}
	
	

	
}
