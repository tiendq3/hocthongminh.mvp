package com.koolsoft.hocthongminh.client.home;

import com.koolsoft.hocthongminh.client.basic.BasicPlace;
import com.koolsoft.hocthongminh.client.basic.PlaceConfig;

public class HomePlace extends BasicPlace {

	public HomePlace() {
		this.token = PlaceConfig.HOME_PLACE;
	}

	public HomePlace(String token) {
		super(token);
	}

}
