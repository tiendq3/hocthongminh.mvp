package com.koolsoft.hocthongminh.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.koolsoft.hocthongminh.client.basic.BasicView;
import com.koolsoft.hocthongminh.client.examPreparation.ExamPreparationViewImpl;
import com.koolsoft.hocthongminh.client.home.HomeView;
import com.koolsoft.hocthongminh.client.ratedCapacityExam.RatedCapcityExamView;

public interface ClientFactory {

	EventBus getEventBus();

	PlaceController getPlaceController();

	BasicView getBasicView();

	HomeView getHomeView();

	ExamPreparationViewImpl getExamPreparationView();

	RatedCapcityExamView getRatedCapcityExamView();
}
