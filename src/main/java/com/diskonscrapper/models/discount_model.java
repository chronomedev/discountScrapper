package com.diskonscrapper.models;

// PARENT KELAS ABSTRAK YANG DITURUNKAN UNTUK OBJEK DISKON 
// ChronomeDev 2020

import com.diskonscrapper.helper.webDriverHelper;
import com.diskonscrapper.interfaces.discount_interface;

public abstract class discount_model {
	private String diskon_url_loc;
	
	webDriverHelper driverHelper;
	public String[] judulDiskon;
	public String[] url_diskonDetail;
	public String[] imageDiskon;
	
	public abstract void initURLDiscount();
	public abstract void getDiscountData();
	public abstract void getDiscountImageData();
	public abstract void getDiscountLinkDetailData();
	
	public void selesai() { // quit webdrivernya
		this.driverHelper.driverGogel.close();
		this.driverHelper.killProsesWebDriver();
	}
	
	public String getDiskon_url_loc() {
		return diskon_url_loc;
	}

	public void setDiskon_url_loc(String diskon_url_loc) {
		this.diskon_url_loc = diskon_url_loc;
	}
	
	
}
