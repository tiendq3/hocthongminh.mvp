package com.koolsoft.hocthongminh.client.home;

import com.koolsoft.hocthongminh.client.basic.BasicViewImpl;
import com.koolsoft.hocthongminh.client.home.component.HomeContentView;

public class HomeViewImpl extends BasicViewImpl implements HomeView {

	public HomeViewImpl() {
		content.add(homeContentView);
	}

	@Override
	public HomeContentView getHomeContentView() {
		return homeContentView;
	}
}
