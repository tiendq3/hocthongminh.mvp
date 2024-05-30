package com.koolsoft.hocthongminh.client.home;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.koolsoft.hocthongminh.client.ClientFactory;
import com.koolsoft.hocthongminh.client.basic.BasicActivity;
import com.koolsoft.hocthongminh.client.basic.BasicPlace;
import com.koolsoft.hocthongminh.client.basic.BasicViewImpl;
import com.koolsoft.hocthongminh.client.home.component.HomeContentView;
import com.koolsoft.hocthongminh.client.slide.SlideContainer;

public class HomeActivity extends BasicActivity {

	private ClientFactory clientFactory;
	
	private HomeView homeView;
	
	
	public HomeActivity(BasicPlace place, ClientFactory clientFactory) {
		super(place, clientFactory);
		this.clientFactory = clientFactory;
		this.homeView = this.clientFactory.getHomeView();
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		container.setWidget((HomeViewImpl)homeView);
		super.init((HomeViewImpl)homeView);
		initHomeView();
	}

	void initHomeView() {
		HomeContentView homeContentView = homeView.getHomeContentView();
		homeContentView.getSlideContainer().controlSlider(homeContentView.getSlideContainer().getElement(), 1, true);

		SlideContainer utilsSlide = homeContentView.getHomeUtils().getSlideUtils();
		utilsSlide.controlSlideUtils(utilsSlide.getElement());
		homeContentView.getHomeUtils().controllBodyUtils();

		SlideContainer feedbackSlide = homeContentView.getHomeFeedback().getFeedbackSlider();
		feedbackSlide.controlSlider(feedbackSlide.getElement(), 3, false);

		homeContentView.getCategoryTest().handleClickButton();
		homeContentView.getHomeBase().cssHomeBaseItem();
		homeContentView.getKnowledgeView().appearWhenScrolling();
		homeView.getNavBarHeader().scrollDown();
		homeView.getNavBarHeader().responsiveNavBar(HomeContentView.MENU_ICON + HomeContentView.LOGO);
	}
}
