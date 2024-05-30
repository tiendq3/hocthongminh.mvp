package com.koolsoft.hocthongminh.client.home;

import com.koolsoft.hocthongminh.client.basic.BasicView;
import com.koolsoft.hocthongminh.client.home.component.HomeContentView;

public interface HomeView extends BasicView{
	public static final HomeContentView homeContentView = new HomeContentView();

	HomeContentView getHomeContentView();
}
