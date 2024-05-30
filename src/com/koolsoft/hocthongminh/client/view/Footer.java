package com.koolsoft.hocthongminh.client.view;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;

import com.google.gwt.user.client.ui.HTML;

public class Footer extends Div {
	private final String LOCALTION_ICON = "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\""
			+ " fill=\"currentColor\" class=\"bi bi-geo-alt-fill\" viewBox=\"0 0 16 16\">\r\n"
			+ "  <path d=\"M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z\"/>\r\n"
			+ "</svg>";
	private final String LOCALTION = "Tầng 3, Lô NT KĐT mới Phùng Khoang, Phường Trung Văn,"
			+ " Quận Nam Từ Liêm, Hà Nội";

	private final String EMAIL_ICON = "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-envelope-fill\" viewBox=\"0 0 16 16\">\r\n"
			+ "  <path d=\"M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414.05 3.555ZM0 4.697v7.104l5.803-3.558L0 4.697ZM6.761 8.83l-6.57 4.027A2 2 0 0 0 2 14h12a2 2 0 0 0 1.808-1.144l-6.57-4.027L8 9.586l-1.239-.757Zm3.436-.586L16 11.801V4.697l-5.803 3.546Z\"/>\r\n"
			+ "</svg>";
	private final String EMAIL = "hotro.hocthongminh@gmail.com";

	public Footer() {
		Container footerContent = new Container();
		footerContent.add(initBody());

		footerContent.addStyleName("footer-content");
		this.add(footerContent);
		this.addStyleName("footer");
	}

	Div initBody() {
		Div footerBody = new Div();
		footerBody.add(initLeftFooter());
		footerBody.add(initCenterFooter());
		footerBody.add(initRightFooter());
		footerBody.addStyleName("footer-body");
		return footerBody;
	}

	Div initLeftFooter() {
		Image logo = new Image("images/logo.svg");
		HTML location = new HTML(LOCALTION_ICON + "<span>" + LOCALTION + "</span>");
		HTML company = new HTML("Cơ quan chủ quản: Công ty Cổ phần Đầu tư và Phát triển Koolsoft");
		HTML email = new HTML(EMAIL_ICON + "<span>" + EMAIL + "</span>");
		Div leftFooter = new Div();
		leftFooter.add(logo);
		leftFooter.add(location);
		leftFooter.add(company);
		leftFooter.add(email);
		leftFooter.addStyleName("col-md-4 col-sm-12");
		leftFooter.addStyleName("footer-left");
		return leftFooter;
	}

	Div initCenterFooter() {
		Div centerFooter = new Div();
		Div item1 = new Div();
		item1.add(new HTML("<h3>Về chúng tôi</h3><p>Giới thiệu</p><p>Liên hệ</p>"));
		Div item2 = new Div();
		item2.add(new HTML("<h3>Chính sách</h3><p>Điều khoản sử dụng</p><p>Chính sách bảo mật</p>"));
		Div item3 = new Div();
		item3.add(new HTML("<h3>Thông tin</h3><p>Chia sẻ kiến thức</p><p>Tin tức</p>"));
		centerFooter.add(item1);
		centerFooter.add(item2);
		centerFooter.add(item3);
		centerFooter.addStyleName("footer-center");
		centerFooter.addStyleName("col-md-5 col-sm-12");
		return centerFooter;
	}

	Div initRightFooter() {
		Div rightFooter = new Div();
		rightFooter.add(new HTML("<h3>Kết nối với Hocthongminh</h3>"));
		rightFooter.addStyleName("col-md-3 col-sm-12");
		return rightFooter;
	}
}
