package com.koolsoft.hocthongminh.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.koolsoft.hocthongminh.client.basic.BasicView;
import com.koolsoft.hocthongminh.client.basic.BasicViewImpl;
import com.koolsoft.hocthongminh.client.examPreparation.ExamPreparationViewImpl;
import com.koolsoft.hocthongminh.client.home.HomeView;
import com.koolsoft.hocthongminh.client.home.HomeViewImpl;
import com.koolsoft.hocthongminh.client.ratedCapacityExam.RatedCapcityExamView;

public class ClientFactoryImpl implements ClientFactory {

	private final EventBus eventBus = new SimpleEventBus();
	private final PlaceController placeController = new PlaceController(eventBus);

	public ClientFactoryImpl() {

	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return this.placeController;
	}

	@Override
	public BasicView getBasicView() {
		return new BasicViewImpl();
	}

	@Override
	public HomeView getHomeView() {
		return new HomeViewImpl();
	}

	// lẽ ra trả về interface
	@Override
	public ExamPreparationViewImpl getExamPreparationView() {
		return new ExamPreparationViewImpl();
	}
	
	// lẽ ra trả về interface
	@Override
	public RatedCapcityExamView getRatedCapcityExamView() {
		return new RatedCapcityExamView();
	}
}
