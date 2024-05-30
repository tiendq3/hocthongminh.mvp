package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Image;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.koolsoft.hocthongminh.client.slide.SlideContainer;

public class HomeContentView extends Composite{

	private static HomeContentViewUiBinder uiBinder = GWT.create(HomeContentViewUiBinder.class);

	interface HomeContentViewUiBinder extends UiBinder<Widget, HomeContentView> {
	}

	public static final String MENU_ICON = "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-list\" viewBox=\"0 0 16 16\">\r\n"
			+ "  <path fill-rule=\"evenodd\" d=\"M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z\"/>\r\n"
			+ "</svg>";

	public static final String LOGO = "<img class =\" logo-mobile\" src=\"images/logo_mobile.svg\" alt=\"logo\">";

	@UiField
	SlideContainer slideContainer;

	@UiField
	CategoryCourse categoryCourse;

	@UiField
	CategoryTest categoryTest;

	@UiField
	HomeUtils homeUtils;

	@UiField
	HomeBase homeBase;

	@UiField
	HomeBannerRegister homeBannerRegister;

	@UiField
	HomeFeedback homeFeedback;

	@UiField
	KnowledgeView knowledgeView;

	public HomeContentView() {
		initWidget(uiBinder.createAndBindUi(this));
		loadView();
	}

	void loadView() {
		slideContainer.add(new Image("images/banner1.webp"));
		slideContainer.add(new Image("images/banner2.webp"));
		slideContainer.add(new Image("images/banner3.webp"));
		slideContainer.add(new Image("images/banner4.webp"));
		slideContainer.add(new Image("images/banner5.webp"));
		slideContainer.add(new Image("images/banner6.webp"));
	}

	public SlideContainer getSlideContainer() {
		return slideContainer;
	}

	public void setSlideContainer(SlideContainer slideContainer) {
		this.slideContainer = slideContainer;
	}

	public CategoryCourse getCategoryCourse() {
		return categoryCourse;
	}

	public void setCategoryCourse(CategoryCourse categoryCourse) {
		this.categoryCourse = categoryCourse;
	}

	public CategoryTest getCategoryTest() {
		return categoryTest;
	}

	public void setCategoryTest(CategoryTest categoryTest) {
		this.categoryTest = categoryTest;
	}

	public HomeUtils getHomeUtils() {
		return homeUtils;
	}

	public void setHomeUtils(HomeUtils homeUtils) {
		this.homeUtils = homeUtils;
	}

	public HomeBase getHomeBase() {
		return homeBase;
	}

	public void setHomeBase(HomeBase homeBase) {
		this.homeBase = homeBase;
	}

	public HomeBannerRegister getHomeBannerRegister() {
		return homeBannerRegister;
	}

	public void setHomeBannerRegister(HomeBannerRegister homeBannerRegister) {
		this.homeBannerRegister = homeBannerRegister;
	}

	public HomeFeedback getHomeFeedback() {
		return homeFeedback;
	}

	public void setHomeFeedback(HomeFeedback homeFeedback) {
		this.homeFeedback = homeFeedback;
	}

	public KnowledgeView getKnowledgeView() {
		return knowledgeView;
	}

	public void setKnowledgeView(KnowledgeView knowledgeView) {
		this.knowledgeView = knowledgeView;
	}
}
