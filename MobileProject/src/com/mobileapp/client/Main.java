package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceImpl;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice:\n 1.Get Mobile By Id\n 2.Get Mobiles by brand\n 3.Get All mobiles ");
		int choice = scanner.nextInt();
		MobileService mobileService = new MobileServiceImpl();
		switch (choice) {
		case 1:
			System.out.println("Enter the mobile id");
			int mobileId = scanner.nextInt();
			try {
				System.out.println(mobileService.getById(mobileId));

			} catch (MobileNotFoundException e) {
				System.out.println(e.getMessage());

			}
			break;
		case 2:
			System.out.println("Enter the brand name");
			String brand = scanner.next();
			try {
				Mobile[] mobilesByBrand = mobileService.getByBrand(brand);
				for (Mobile mobile : mobilesByBrand) {
					if (mobile != null) {
						System.out.println(mobile);
					}
				}
			} catch (MobileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Available Mobiles:");
			Mobile[] mobiles = mobileService.getAll();
			for (Mobile mobile : mobiles) {
				System.out.println(mobile);
			}
		}
		scanner.close();

	}
}
