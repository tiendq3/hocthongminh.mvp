package com.koolsoft.hocthongminh.client.examPreparation;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.koolsoft.hocthongminh.client.ClientFactory;
import com.koolsoft.hocthongminh.client.basic.BasicActivity;
import com.koolsoft.hocthongminh.client.basic.BasicPlace;

public class ExamPreparationActivity extends BasicActivity{
	
	private ClientFactory clientFactory;

	private ExamPreparationViewImpl examPreparationViewImpl;

	public ExamPreparationActivity(BasicPlace place, ClientFactory clientFactory) {
		super(place, clientFactory);
		this.clientFactory = clientFactory;
		this.examPreparationViewImpl = this.clientFactory.getExamPreparationView();
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		container.setWidget(examPreparationViewImpl);
		super.init(examPreparationViewImpl);
	}
}
