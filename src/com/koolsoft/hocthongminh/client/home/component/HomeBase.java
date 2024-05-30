package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.html.Div;
import org.gwtbootstrap3.client.ui.html.Paragraph;

import com.google.gwt.user.client.ui.HTML;

public class HomeBase extends Div {

	public HomeBase() {
		Container homeBaseContent = new Container();
		homeBaseContent.addStyleName("home-base-content");
		homeBaseContent.add(initHomeBaseHeader());
		homeBaseContent.add(initHomeBaseBody());
		this.add(homeBaseContent);
		this.addStyleName("home-base");
//		this.cssHomeBaseItem();
	}

	HTML initHomeBaseHeader() {
		HTML header = new HTML("Nền tảng Học Thông Minh có gì?");
		header.setStyleName("home-base-header");
		return header;
	}

	Div initHomeBaseBody() {
		Div body = new Div();
		body.setStyleName("home-base-body");
		Div homeBaseItem1 = homeBaseItem("100K+", "Học viên");
		Div homeBaseItem2 = homeBaseItem("150K+", "Câu hỏi trắc nghiệm");
		Div homeBaseItem3 = homeBaseItem("3000+", "Đề luyện");
		body.add(homeBaseItem1);
		body.add(homeBaseItem2);
		body.add(homeBaseItem3);
		return body;
	}

	Div homeBaseItem(String itemContent, String itemDes) {
		Div homeBaseItem = new Div();
		HTML itemContentTag = new HTML(itemContent);
		Paragraph itemDesTag = new Paragraph(itemDes);
		homeBaseItem.add(itemContentTag);
		homeBaseItem.add(itemDesTag);
		homeBaseItem.addStyleName("col-sm-4");
		homeBaseItem.addStyleName("home-base-item");
		return homeBaseItem;
	}

	public native void cssHomeBaseItem() /*-{
		var homeBaseItems = $doc.getElementsByClassName("home-base-item");
		//		console.log(homeBaseItems)
		homeBaseItems[1].style.borderLeft = "solid";
		homeBaseItems[1].style.borderRight = "solid";
		function checkScroll() {
			var homeBaseHeader = $doc
					.getElementsByClassName("home-base-header")[0];
			var itemRect = homeBaseHeader.getBoundingClientRect();
			var windowHeight = $wnd.innerHeight;

			// Kiểm tra xem phần tử có hiển thị trên màn hình không
			if (itemRect.top < windowHeight && itemRect.bottom >= 0) {
				homeBaseHeader.style.transform = 'scale(1,1)';
			} else {
				homeBaseHeader.style.transform = 'scale(0,0)';
			}
		}

		$wnd.addEventListener('scroll', checkScroll);
	}-*/;
}
