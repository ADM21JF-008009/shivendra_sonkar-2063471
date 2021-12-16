package com.validate;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;
@Component
public class CustomValidator implements Validator{
	public void validate(Object arg0, Errors arg1) {
	   ValidationUtils.rejectIfEmpty(arg1,"userName","User Name cannot be blank");
	   ValidationUtils.rejectIfEmpty(arg1,"emailId","Email ID cannot be blank");
	   ValidationUtils.rejectIfEmpty(arg1,"confirmEmailId","Confirm Email ID cannot be blank");
	    
	   RegistrationBean bean=(RegistrationBean)arg0;
	   String email="[\\w\\d._-]+@[\\w\\d.-]+(\\.[\\w]{2,3}){1,2}$";
	   boolean emailflag=false;
	   boolean confirmEmailFlag=false;
	   if(Long.toString(bean.getContactNumber()).length()!=10) {
		   arg1.rejectValue("contactNumber","","Contact Number should be of 10 digits/Contact Number should not be blank");
	   }
	   if(!bean.getEmailId().matches(email)) {
		   arg1.rejectValue("emailId","","Should be a proper email Id format");
	   }else {
		   emailflag=true;
	   }
	   if(!bean.getConfirmEmailId().matches(email)) {
		   arg1.rejectValue("emailId","","Should be a proper email Id format");
	   }else {
		   confirmEmailFlag=true;
	   }
	   if(emailflag && confirmEmailFlag && !bean.getConfirmEmailId().equals(bean.getEmailId())) {
		   arg1.rejectValue("confirmEmailId","","Email and Confirm Email should be same");
	   }
	   if(!bean.isStatus()) {
		   arg1.rejectValue("status","","please agree to the terms and conditions");
	   }
	}	 	  	    	    	     	      	 	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
