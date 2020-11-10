package com.diskonscrapper.controllers;

// Discount Scrapper / Promo scrapper backend Controller API
// ChronomeDev 2020

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diskonscrapper.helper.webDriverHelper;
import com.diskonscrapper.models.dana;
import com.diskonscrapper.models.discount_model;
import com.diskonscrapper.models.gopay;
import com.diskonscrapper.models.ovo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;

@Controller
@ResponseBody
public class scrapper_controller {
	
	@RequestMapping(value="/testing", produces="application/json", method=RequestMethod.GET)
	public HashMap<String, String> testingController() {
		
		// inisialisasi objek promo 
		discount_model dana = new dana();
		dana.initURLDiscount();
		//driverHelper.tungguPage();
		//driverHelper.driverGogel.get("https://gmail.com");
		HashMap<String,String> eh = new HashMap<String, String>();
		eh.put("test", "tabz");
		return eh;
		
	}
	
	@RequestMapping(value="/gopay", produces="application/json", method=RequestMethod.GET)
	public HashMap<String,String> PromoGoPay() {

		// inisialisasi objek promo 
		discount_model gopay = new gopay();
		gopay.initURLDiscount();
		gopay.getDiscountData();
		gopay.getDiscountImageData();
		gopay.getDiscountLinkDetailData();
		HashMap<String,String> eh = new HashMap<String, String>();
		eh.put("test", "tabz");
		return eh;
	}
	
	@RequestMapping(value="/dana", produces="application/json", method=RequestMethod.GET)
	public HashMap<String,String> PromoDana() {

		// inisialisasi objek promo 
		discount_model dana = new dana();
		dana.initURLDiscount();
		dana.getDiscountData();
		dana.getDiscountImageData();
		dana.getDiscountLinkDetailData();
		HashMap<String,String> eh = new HashMap<String, String>();
		eh.put("test", "tabz");
		return eh;
	}
	@RequestMapping(value="/ovo", produces="application/json", method=RequestMethod.GET)
	public HashMap<String,Object> diskonOvo() {
		
		// inisialisasi objek promo 
		String status = "1";
		discount_model ovo = new ovo();
		ovo.initURLDiscount();
		ovo.getDiscountData();
		ovo.getDiscountImageData();
		ovo.getDiscountLinkDetailData();
		ovo.selesai();

		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("juduldiskon", ovo.judulDiskon);
		data.put("detaildiskon", ovo.url_diskonDetail);
		data.put("gambardiskon", ovo.imageDiskon);
		HashMap<String,Object> datarespon = new HashMap<String, Object>();
		datarespon.put("status", status);
		datarespon.put("datadiskon", data);
		
		
//		Gson gson = new Gson();
//		String jsonConvert = gson.toJson(ovo.judulDiskon);
//		System.out.println("INI BAWAH JSON CONVERT-->");
//		System.out.print(jsonConvert);
		
		return datarespon;
	}
	
}
