package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService {

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		Mobile[] mobiles = allMobiles();
		for (Mobile m : mobiles) {
			if (m.getMobileId() == id) {
				return m;
			}
		}
		throw new MobileNotFoundException("Mobile Not Found");
	}

	@Override
	public Mobile[] getAll() {
		return allMobiles();
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		Mobile[] mobiles = allMobiles();
		Mobile[] mobileByBrand = new Mobile[7];
		int index = 0, flag = 0;
		for (Mobile mobile : mobiles) {
			if (mobile.getBrand().equals(brand)) {
				mobileByBrand[index++] = mobile;
				flag = 1;
			}
		}
		if (flag == 0) {
			throw new MobileNotFoundException("Mobile Not Found");
		}
		return mobileByBrand;

	}

	private Mobile[] allMobiles() {
		Mobile[] mobiles = new Mobile[7];
		mobiles[0] = new Mobile(1, "A", "AA", 10000);
		mobiles[1] = new Mobile(2, "B", "BB", 12000);
		mobiles[2] = new Mobile(3, "C", "CC", 19000);
		mobiles[3] = new Mobile(4, "D", "DD", 13000);
		mobiles[4] = new Mobile(5, "E", "EE", 16000);
		mobiles[5] = new Mobile(6, "F", "FF", 14000);
		mobiles[6] = new Mobile(7, "G", "GG", 17000);
		return mobiles;

	}

}
