package com.koolsoft.hocthongminh.client.ratedCapacityExam;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;

import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.koolsoft.hocthongminh.client.basic.BasicViewImpl;

public class RatedCapcityExamView extends BasicViewImpl {
	private final String TITLE_HEADER = "Luyện đề thi thử Đánh Giá Năng Lực";
	private final String DES_HEADER = "Tổng hợp mẫu các dạng đề thi đánh giá năng lực của các trường với ngân hàng câu hỏi và đề thi lớn giúp bạn chuẩn bị tốt cho kì thi ĐGNL.";

	public RatedCapcityExamView() {
		Container nav4Content = new Container();
		nav4Content.addStyleName("rated-capcity-exam-content");
		nav4Content.add(initNav4Header());
		nav4Content.add(initNav4Body());
		content.add(nav4Content);
	}

	HTML initNav4Header() {
		HTML nav1Header = new HTML("<h1>" + TITLE_HEADER + "</h1><p>" + DES_HEADER + "</p>");
		return nav1Header;
	}

	Div initNav4Body() {
		Div nav4Body = new Div();
		for (int i = 0; i < 5; i++) {
			Div itemBody = itemBody("images/knowledge2.jpg", "Test", DES_HEADER);
			itemBody.addStyleName("col-sm-3 col-xs-6");
			nav4Body.add(itemBody);
		}
		return nav4Body;
	}

	Div itemBody(String urlImage, String subjectName, String subjectDes) {
		Div itemBody = new Div();
		Image subjectImage = new Image(urlImage);
		subjectImage.getElement().getStyle().setWidth(100, Unit.PCT);
		HTML subDes = new HTML("<h1>" + subjectName + "</h1><p>" + subjectDes + "</p>");
		itemBody.add(subjectImage);
		itemBody.add(subDes);
		itemBody.getElement().getStyle().setTextAlign(TextAlign.CENTER);
		return itemBody;
	}
}
