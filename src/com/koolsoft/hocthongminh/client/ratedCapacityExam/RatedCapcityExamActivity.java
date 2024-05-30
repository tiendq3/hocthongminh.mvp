package com.koolsoft.hocthongminh.client.ratedCapacityExam;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.koolsoft.hocthongminh.client.ClientFactory;
import com.koolsoft.hocthongminh.client.basic.BasicActivity;
import com.koolsoft.hocthongminh.client.basic.BasicPlace;

public class RatedCapcityExamActivity extends BasicActivity {
	
	private ClientFactory clientFactory;

	private RatedCapcityExamView ratedCapcityExamView;

	public RatedCapcityExamActivity(BasicPlace place, ClientFactory clientFactory) {
		super(place, clientFactory);
		this.clientFactory = clientFactory;
		this.ratedCapcityExamView = this.clientFactory.getRatedCapcityExamView();
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		container.setWidget(ratedCapcityExamView);
		super.init(ratedCapcityExamView);
	}
}
