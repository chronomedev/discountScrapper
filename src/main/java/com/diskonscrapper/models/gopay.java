package com.diskonscrapper.models;

import com.diskonscrapper.helper.webDriverHelper;
import com.diskonscrapper.interfaces.discount_interface;

public class gopay extends discount_model {

	@Override
	public void initURLDiscount() {
		// TODO Auto-generated method stub
		this.driverHelper = new webDriverHelper();
		this.driverHelper.driverGogel.get("https://www.gojek.com/blog/gopay/"); // url diskon gopay
	}
	
	@Override
	public void getDiscountData() {
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public void getDiscountImageData() {
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public void getDiscountLinkDetailData() {
		// TODO Auto-generated method stub
		
	}

	
}
