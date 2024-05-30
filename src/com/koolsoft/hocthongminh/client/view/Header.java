package com.koolsoft.hocthongminh.client.view;

import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;

public class Header extends Div {

	private Div leftHeader;
	
	private Image logo;

	public Header() {
		Container headerContent = new Container();
		headerContent.add(initLeftHeader());
		headerContent.add(initRightHeader());
		headerContent.addStyleName("header-content");

		this.add(headerContent);
		this.addStyleName("header");
	}

	Div initLeftHeader() {
		logo = new Image("images/logo.svg");
		leftHeader = new Div();
		leftHeader.add(logo);
		leftHeader.addStyleName("left-header");
		leftHeader.setId("logo-home");
		return leftHeader;
	}

	Div initRightHeader() {
		Button loginBtn = new Button("Đăng nhập");
		Button signupBtn = new Button("Đăng ký");
		Div rightHeader = new Div();
		loginBtn.setId("login-btn");
		signupBtn.setId("signup-btn");
		rightHeader.add(loginBtn);
		rightHeader.add(signupBtn);
		rightHeader.addStyleName("right-header");
		return rightHeader;
	}

	public Div getLeftHeader() {
		return leftHeader;
	}

	public void setLeftHeader(Div leftHeader) {
		this.leftHeader = leftHeader;
	}

	public Image getLogo() {
		return logo;
	}

	public void setLogo(Image logo) {
		this.logo = logo;
	}
}
