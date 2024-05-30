package com.koolsoft.hocthongminh.client.examPreparation;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;

import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.koolsoft.hocthongminh.client.basic.BasicViewImpl;

public class ExamPreparationViewImpl extends BasicViewImpl implements ExamPreparationView {
	private final String TITLE_HEADER = "Ôn luyện thi trắc nghiệm THPT Quốc Gia các môn";
	private final String DES_HEADER = "Luyện thi THPT QG các môn Toán, Lý, Hóa, Sinh, Sử, Địa, Giáo Dục Công Dân, Tiếng Anh với đề thi chọn lọc từ các trường và những dạng bài thi bám sát với chương trình thi đại học.";

	public ExamPreparationViewImpl() {
		Container nav1Content = new Container();
		nav1Content.addStyleName("nav1-content");
		nav1Content.add(initNav1Header());
		nav1Content.add(initNav1Body());
		content.add(nav1Content);
	}

	HTML initNav1Header() {
		HTML nav1Header = new HTML("<h1>" + TITLE_HEADER + "</h1><p>" + DES_HEADER + "</p>");
		return nav1Header;
	}

	Div initNav1Body() {
		Div nav1Body = new Div();
		for (int i = 0; i < 10; i++) {
			Div itemBody = itemBody("images/knowledge1.jpg", "Test", DES_HEADER);
			itemBody.addStyleName("col-sm-3 col-xs-6");
			nav1Body.add(itemBody);
		}
		return nav1Body;
	}

	Div itemBody(String urlImage, String subjectName, String subjectDes) {
		Div itemBody = new Div();
		Image subjectImage = new Image(urlImage);
		subjectImage.getElement().getStyle().setWidth(100, Unit.PCT);
		HTML subDes = new HTML("<h1>" + subjectName + "</h1><p>" + subjectDes + "</p>");
		itemBody.add(subjectImage);
		itemBody.add(subDes);
		itemBody.getElement().getStyle().setTextAlign(TextAlign.CENTER);
		itemBody.addStyleName("nav1-item");
		return itemBody;
	}

}
