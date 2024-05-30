package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;
import org.gwtbootstrap3.client.ui.html.Paragraph;

import com.google.gwt.user.client.ui.HTML;
import com.koolsoft.hocthongminh.client.slide.SlideContainer;

public class HomeFeedback extends Div {
	
	private SlideContainer feedbackSlider = new SlideContainer();

	private final String STAR_ICON = "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-star-fill\" viewBox=\"0 0 16 16\">\r\n"
			+ "  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\r\n"
			+ "</svg>";

	private final String FEEDBACK_CONTENT = "Mình nhận thấy web thực sự hữu ích cho học sinh, giao diện thân thiện, bài tập chi tiết và rõ ràng giúp các con dễ dàng luyện tập.";

	public HomeFeedback() {
		Container homeFeedbackContent = new Container();
		homeFeedbackContent.add(initHomeFeedbackHeader());
		homeFeedbackContent.add(initHomeFeedbackBody());
		homeFeedbackContent.addStyleName("home-feedback-content");
		this.add(homeFeedbackContent);
		this.addStyleName("home-feedback");
	}

	Div initHomeFeedbackHeader() {
		Div header = new Div();
		HTML headerContent = new HTML("Mọi người nghĩ gì về chúng tôi");
		header.add(headerContent);
		header.addStyleName("home-feedback-header");
		return header;
	}

	Div initHomeFeedbackBody() {
		feedbackSlider.add(initSlideItem("images/dieuhuong.svg","Diệu Hương",FEEDBACK_CONTENT));
		feedbackSlider.add(initSlideItem("images/trungkien.svg","Trung Kiên",FEEDBACK_CONTENT));
		feedbackSlider.add(initSlideItem("images/phuonglinh.svg","Phương Linh",FEEDBACK_CONTENT));
		feedbackSlider.add(initSlideItem("images/maianh.svg","Mai Anh",FEEDBACK_CONTENT));
		feedbackSlider.addStyleName("feedback-slide");
		Div homeFeedbackBody = new Div();
		homeFeedbackBody.add(feedbackSlider);
		homeFeedbackBody.addStyleName("home-feedback-body");
		return homeFeedbackBody;
	}

	Div initSlideItem(String urlImage, String namePerson, String feedbackMessage) {
		Image feedbackPersonImage = new Image(urlImage);
		HTML namePersonElement = new HTML("<h1>" + namePerson + "</h1>");
		HTML rate = new HTML(STAR_ICON + STAR_ICON + STAR_ICON + STAR_ICON + STAR_ICON);
		Paragraph feedbackContent = new Paragraph(feedbackMessage);
		Div feedbackItem = new Div();
		feedbackItem.add(feedbackPersonImage);
		feedbackItem.add(namePersonElement);
		feedbackItem.add(rate);
		feedbackItem.add(feedbackContent);
		feedbackItem.addStyleName("feedback-item");
		return feedbackItem;
	}

	public SlideContainer getFeedbackSlider() {
		return feedbackSlider;
	}

	public void setFeedbackSlider(SlideContainer feedbackSlider) {
		this.feedbackSlider = feedbackSlider;
	}

}
