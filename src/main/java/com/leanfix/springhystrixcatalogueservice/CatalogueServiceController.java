package com.leanfix.springhystrixcatalogueservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.leanfix.springhystrixcatalogueservice.CatalogueServiceDelegate;

@RestController
public class CatalogueServiceController {
	
	 @Autowired
	    CatalogueServiceDelegate catalogueServiceDelegate;
	 
	    @RequestMapping(value = "/getProductDetails/{category}", method = RequestMethod.GET)
	    public String getProducts(@PathVariable String category) {
	        System.out.println("Going to call procuct service to get data!");
	        return catalogueServiceDelegate.callProductServiceAndGetData(category);
	    }

}
