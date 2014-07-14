package com.kanjih.camel.business;

import org.springframework.stereotype.Service;

import com.kanjih.camel.canonical.v1.Merchant;
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

@Service
public class BusinessMerchant {
	
	
	
	public void put(Merchant merchant){
		  // create or get a named cache called mycache 
	      NamedCache myCache = CacheFactory.getCache("mycache");
	       
	       // put key, value pair into the cache. 
	       myCache.put(merchant.getNumber(), merchant);
	        
	       System.out.println("Value in cache is " + myCache.get(merchant.getNumber()));
	}
	
	public Merchant get(Long number){
		// create or get a named cache called mycache 
	      NamedCache myCache = CacheFactory.getCache("mycache");	      
	        
	      Object cacheValue = myCache.get(number);
	      
	      return (Merchant) cacheValue;
		
		
	}
	

}
