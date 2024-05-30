package com.koolsoft.hocthongminh.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.koolsoft.hocthongminh.client.basic.BasicPlace;
import com.koolsoft.hocthongminh.client.basic.PlaceConfig;
import com.koolsoft.hocthongminh.client.examPreparation.ExamPreparationPlace;
import com.koolsoft.hocthongminh.client.home.HomePlace;
import com.koolsoft.hocthongminh.client.ratedCapacityExam.RatedCapcityExamPlace;

public class Hocthongminh implements EntryPoint {

	private SimplePanel simplePanel = new SimplePanel();

	@Override
	public void onModuleLoad() {
		configActivityAndPlace();
	}

	void configActivityAndPlace() {
		ClientFactory clientFactory = GWT.create(ClientFactoryImpl.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(new AppPlaceHistoryMapper() {
			@Override
			public Place getPlace(String token) {
				if ("".equals(token) || null == token || PlaceConfig.HOME_PLACE.equals(token)) {
					return new HomePlace();
				} else if (PlaceConfig.LUYEN_THI_THPTQG.equals(token)) {
					return new ExamPreparationPlace(token);
				} else if (PlaceConfig.DE_THI_DGNL.equals(token)) {
					return new RatedCapcityExamPlace(token);
				}
				return null;
			}

			@Override
			public String getToken(Place place) {
				if (place instanceof HomePlace) {
					return ((HomePlace) place).getToken();
				} else if (place instanceof ExamPreparationPlace) {
					return ((ExamPreparationPlace) place).getToken();
				} else if (place instanceof RatedCapcityExamPlace) {
					return ((RatedCapcityExamPlace) place).getToken();
				}
				return "";
			}
		});
		BasicPlace homePlace = new HomePlace();
		historyHandler.register(placeController, eventBus, homePlace);
		ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);

		activityManager.setDisplay(simplePanel);
		RootPanel.get().add(simplePanel);
		historyHandler.handleCurrentHistory();
	}
}
