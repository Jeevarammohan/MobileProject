package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public interface MobileService {
	Mobile getById(int id) throws MobileNotFoundException;

	Mobile[] getAll();

	Mobile[] getByBrand(String brand) throws MobileNotFoundException;
}
