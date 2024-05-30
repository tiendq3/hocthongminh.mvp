package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;
import org.gwtbootstrap3.client.ui.html.Span;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.user.client.ui.HTML;

public class HomeBannerRegister extends Div {
	private final String ICON = "<svg width=\"26\" height=\"19\" viewBox=\"0 0 26 19\" fill=\"none\" "
			+ "xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M9.18971 18.0048L0.561523 8.97239L3.50526 "
			+ "6.20109L9.18971 11.7437C13.1688 3.53243 21.9797 1.06905 25.025 0.86377C16.5795 4.80518 11.1184 "
			+ "14.0018 9.18971 18.0048Z\" fill=\"#FFA800\"></path></svg>";

	public HomeBannerRegister() {
		Container bannerRegisterContent = new Container();
		bannerRegisterContent.addStyleName("home-banner-register-content");
		bannerRegisterContent.add(initBannerRegisterBody());
		this.add(bannerRegisterContent);
		this.addStyleName("home-banner-register");
	}

	Div initBannerRegisterBody() {
		Div bannerRegisterBody = new Div();
		bannerRegisterBody.add(initBannerLeft());
		bannerRegisterBody.add(initBannerRight());
		bannerRegisterBody.addStyleName("home-banner-register-body container");
		return bannerRegisterBody;
	}

	Div initBannerLeft() {
		Div bannerInfo = new Div();
		HTML bannerLeftTitle = new HTML("<h1>ĐĂNG KÝ</h1><h1 class=\"account\">TÀI KHOẢN</h1>");
		bannerLeftTitle.addStyleName("banner-left-title");
		HTML bannerLeftFree = new HTML("FREE");
		bannerLeftFree.addStyleName("banner-left-free");
		bannerInfo.add(bannerLeftTitle);
		bannerInfo.add(bannerLeftFree);
		bannerInfo.addStyleName("banner-left-info");

		Div bannerBody = new Div();
		Div item1 = bannerTextItem("Xem thống kê quá trình luyện tập");
		Div item2 = bannerTextItem("Xem giải thích miễn phí");
		Div item3 = bannerTextItem("Đề xuất học tập khi làm xong đề kiểm tra");
		Div item4 = bannerTextItem("Biết điểm mạnh, điểm yếu sau mỗi bài thi");
		bannerBody.add(item1);
		bannerBody.add(item2);
		bannerBody.add(item3);
		bannerBody.add(item4);

		Div bannerLeft = new Div();
		bannerLeft.add(bannerInfo);
		bannerLeft.add(bannerBody);
		bannerLeft.addStyleName("banner-left");
		return bannerLeft;
	}

	Div bannerTextItem(String text) {
		HTML icon = new HTML(ICON);
		icon.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
		Span textItem = new Span(text);
		Div bannerTextItem = new Div();
		bannerTextItem.add(icon);
		bannerTextItem.add(textItem);
//		bannerTextItem.getElement().getStyle().setPaddingLeft(20, null);
		return bannerTextItem;
	}

	Div initBannerRight() {
		Div bannerRight = new Div();
		Image bannerRightImage = new Image("images/banner-click.webp");
		bannerRight.add(bannerRightImage);
		bannerRight.addStyleName("banner-right");
		return bannerRight;
	}
}
