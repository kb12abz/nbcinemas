/**
 * 
 */
package com.nbcinemas.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author kieranbagnall
 *
 */
@Named("account")
@SessionScoped
public class AccountController implements Serializable {
	
	@Inject
	private CurrentUser user;
	
	public String accountView(){
		String returnValue = "login?faces-redirect=true";
		if (user.getCustomer() != null)
		{
			returnValue = "account?faces-redirect=true";
		}
		return returnValue;
	}
	

}
