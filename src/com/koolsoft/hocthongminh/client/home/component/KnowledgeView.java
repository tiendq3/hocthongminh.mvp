package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;

import com.google.gwt.user.client.ui.HTML;

public class KnowledgeView extends Div {
	private final String TITLE = "Giải mã tất tần tật những thông tin về trạng từ trong tiếng Anh";
	private final String CONTENT = "Trạng từ là một phần không thể thiếu "
			+ "trong việc hiểu và vận dụng tiếng Anh một cách thành thạo."
			+ " Với sự hỗ trợ của trạng từ, câu mang một ý nghĩa khác và cụ thể hơn. ";

	public KnowledgeView() {
		Container knowledgeViewContent = new Container();
		knowledgeViewContent.add(initHeader());
		knowledgeViewContent.add(initBody());
		knowledgeViewContent.addStyleName("knowledgeView-content");
		this.add(knowledgeViewContent);
		this.addStyleName("knowledgeView");
//		this.appearWhenScrolling();
	}

	Div initHeader() {
		Div header = new Div();
		header.add(new HTML("Kiến Thức Hay"));
		header.addStyleName("knowledgeView-header");
		return header;
	}

	Div initBody() {
		Div body = new Div();
		Div item1 = itemBody("images/knowledge1.jpg", TITLE, CONTENT);
		Div item2 = itemBody("images/knowledge2.jpg", TITLE, CONTENT);
		Div item3 = itemBody("images/knowledge3.jpg", TITLE, CONTENT);
		Div item4 = itemBody("images/knowledge4.jpg", TITLE, CONTENT);
		body.add(item1);
		body.add(item2);
		body.add(item3);
		body.add(item4);
		body.addStyleName("knowledgeView-body");
		return body;

	}

	Div itemBody(String urlImage, String title, String content) {
		Image itemImage = new Image(urlImage);
		HTML itemContent = new HTML("<h1>" + title + "</h1>" + "<p>" + content + "</p>");
		Div itemBody = new Div();
		itemBody.add(itemImage);
		itemBody.add(itemContent);
		itemBody.addStyleName("knowledgeView-item");

		Div itemWrap = new Div();
		itemWrap.add(itemBody);
		itemWrap.addStyleName("knowledgeView-item-wrap");
		itemWrap.addStyleName("col-sm-3 col-xs-6");
		return itemWrap;
	}

	public native void appearWhenScrolling() /*-{
		function checkScroll() {
			var knowledgeItems = $doc
					.getElementsByClassName("knowledgeView-item");

			for (var i = 0; i < knowledgeItems.length; i++) {
				var item = knowledgeItems[i];
				var itemRect = item.getBoundingClientRect();
				var windowHeight = $wnd.innerHeight;

				// Kiểm tra xem phần tử có hiển thị trên màn hình không
				if (itemRect.top < windowHeight && itemRect.bottom >= 0) {
					item.style.opacity = 1;
					item.style.transform = 'translateY(0) scale(1,1)';
				} else {

					item.style.opacity = 0;
					item.style.transform = 'translateY(20px) scale(0,0)';
				}
			}
		}

		$wnd.addEventListener('scroll', checkScroll);
	}-*/;

}
