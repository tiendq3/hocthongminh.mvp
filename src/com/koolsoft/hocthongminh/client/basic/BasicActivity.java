package com.koolsoft.hocthongminh.client.basic;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.koolsoft.hocthongminh.client.ClientFactory;
import com.koolsoft.hocthongminh.client.examPreparation.ExamPreparationPlace;
import com.koolsoft.hocthongminh.client.home.HomePlace;
import com.koolsoft.hocthongminh.client.ratedCapacityExam.RatedCapcityExamPlace;

public class BasicActivity implements Activity {

	private ClientFactory clientFactory;

	private PlaceController placeController;

	protected BasicView basicView;

	public BasicActivity(BasicPlace basicPlace, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
		this.placeController = this.clientFactory.getPlaceController();
		this.basicView = clientFactory.getBasicView();
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
//		panel.setWidget(basicView);
	}

	public void init(BasicView basicView) {
		basicView.getNavBarHeader().getExamPreparationNav().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				
				placeController.goTo(new ExamPreparationPlace());

			}
		});
		basicView.getNavBarHeader().getRatedCapacityExamNav().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				placeController.goTo(new RatedCapcityExamPlace());

			}
		});

		basicView.getHeader().getLogo().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				placeController.goTo(new HomePlace());

			}
		});

	}

	@Override
	public String mayStop() {
		return null;
	}

	@Override
	public void onCancel() {

	}

	@Override
	public void onStop() {

	}

}
