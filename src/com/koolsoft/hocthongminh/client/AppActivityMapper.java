package com.koolsoft.hocthongminh.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.koolsoft.hocthongminh.client.examPreparation.ExamPreparationActivity;
import com.koolsoft.hocthongminh.client.examPreparation.ExamPreparationPlace;
import com.koolsoft.hocthongminh.client.home.HomeActivity;
import com.koolsoft.hocthongminh.client.home.HomePlace;
import com.koolsoft.hocthongminh.client.ratedCapacityExam.RatedCapcityExamActivity;
import com.koolsoft.hocthongminh.client.ratedCapacityExam.RatedCapcityExamPlace;

public class AppActivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;

	public AppActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		// This is begging for GIN
		if (place instanceof HomePlace)
			return new HomeActivity((HomePlace) place, clientFactory);
		else if (place instanceof ExamPreparationPlace)
			return new ExamPreparationActivity((ExamPreparationPlace) place, clientFactory);
		else if (place instanceof RatedCapcityExamPlace)
			return new RatedCapcityExamActivity((RatedCapcityExamPlace) place, clientFactory);

		return null;
	}

}
