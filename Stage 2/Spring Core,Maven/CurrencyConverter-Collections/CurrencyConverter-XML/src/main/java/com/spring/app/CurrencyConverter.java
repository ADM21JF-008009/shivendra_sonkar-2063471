package com.spring.app;

import java.util.*;
public class CurrencyConverter {
	
	    private Map<String, String> mObj;
	    public Map<String, String> getmObj() {
			return mObj;
		}
		public void setmObj(Map<String, String> mObj) {
			this.mObj = mObj;
		}
	    public int getTotalCurrencyValue(String value)
    	{
	    	int sum=1;
	    	for(String s:mObj.keySet()) {
	    		String val=value.toUpperCase();
	    		if(val.contains(s)) {
	    			int a=Integer.parseInt(mObj.get(s));
	    			int b=Integer.parseInt(val.substring(0,val.indexOf(s)));
	    			sum=a*b;
	    		}
	    	}
	    	return sum;
	    }	
}
