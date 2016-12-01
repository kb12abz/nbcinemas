package com.nbcinemas.offlineManager;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Address;
import com.nbcinemas.manager.AddressRepository;

import com.nbcinemas.initialData.InitialData;
@Default
@Stateless
public class AddressRepositoryOffline implements AddressRepository{
	
	@Inject
	private InitialData initialData;

	//Create
	@Override
	public void persistAddress(Address a){
		a.setId(initialData.getAddresses().size() + 1);
		initialData.addAddress(a);
	}

	@Override
	public Address getAddressById(int id) {
		for(Address a : initialData.addresses)
		{
			if (a.getId() == id)
			{
				return a;
			}
		}
		return null;
	}

	@Override
	public Address getAddressIdByFirstLineAndPostcode(String firstLine, String postcode) {
		for (Address a : initialData.addresses)
		{
			if ((a.getLine1().equals(firstLine))&&(a.getPostcode().equals(postcode))){
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Address> getAllAddresses() {
		return initialData.getAddresses();
	}
	
	@Override
	public void updateAddressFirstLine(String line1, int id) {
		for (Address a : initialData.addresses)
		{
			if (a.getId() == id){
				a.setLine1(line1);
			}
		}
		
	}

	@Override
	public void updateAddressSecondLine(String line2, int id) {
		for (Address a : initialData.addresses)
		{
			if (a.getId() == id){
				a.setLine2(line2);
			}
		}		
	}

	@Override
	public void updatePostCode(String postcode, int id) {
		for (Address a : initialData.addresses)
		{
			if (a.getId() == id){
				a.setPostcode(postcode);;
			}
		}
		
	}

	@Override
	public void updateCounty(String county, int id) {
		for (Address a : initialData.addresses)
		{
			if (a.getId() == id){
				a.setCounty(county);
			}
		}
		
	}	

	@Override
	public void deleteAddress(int id) {
		for (Address a : initialData.addresses)
		{
			if (a.getId() == id){
				a.setDeleted(true);;
			}
		}		
	}	
}
