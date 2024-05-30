package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;
import org.gwtbootstrap3.client.ui.html.Paragraph;

import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.koolsoft.hocthongminh.client.slide.SlideContainer;

public class HomeUtils extends Div {
	private final String ITEM_DES = "Mục tiêu học tập rõ ràng với các chủ đề đã được"
			+ " tổng hợp sẵn từ chương trình học mới nhất";

	private SlideContainer slideUtils = new SlideContainer();

	public HomeUtils() {
		Container homeUtilsContent = new Container();
		homeUtilsContent.add(initUtilsHeader());
		homeUtilsContent.add(initUtilsBody());

		homeUtilsContent.addStyleName("home-utils-content");
		this.setStyleName("home-utils");
		this.add(homeUtilsContent);

	}

	public Div initUtilsHeader() {
		Div utilsHeader = new Div();
		HTML utilsTitle = new HTML("LỢI ÍCH");
		Paragraph utilsDes = new Paragraph("Phương pháp phát triển khả năng tự học của Học Thông Minh");
		utilsHeader.add(utilsTitle);
		utilsHeader.add(utilsDes);
		utilsHeader.addStyleName("home-utils-header");
		return utilsHeader;
	}

	public Div initUtilsBody() {
		FlowPanel div = new FlowPanel();
		Image utilsImage = new Image("images/utils_image.webp");
		div.add(utilsImage);
		div.getElement().getStyle().setTextAlign(TextAlign.CENTER);
		utilsImage.addStyleName("utils-image");

		slideUtils.add(initSlideItem("images/utils-image-1.webp", ITEM_DES));
		slideUtils.add(initSlideItem("images/utils-image-2.webp", ITEM_DES));
		slideUtils.add(initSlideItem("images/utils-image-3.webp", ITEM_DES));
		slideUtils.add(initSlideItem("images/utils-image-4.webp", ITEM_DES));
		slideUtils.addStyleName("slide-utils");

		Div utilsBody = new Div();
		utilsBody.addStyleName("home-utils-body");
		utilsBody.add(div);
		utilsBody.add(slideUtils);
		return utilsBody;
	}

	public FlowPanel initSlideItem(String urlImage, String itemDes) {
		Div slideItem = new Div();
		Image image = new Image(urlImage);
		Paragraph paragraph = new Paragraph(itemDes);
		slideItem.add(image);
		slideItem.add(paragraph);
		FlowPanel flowPanel = new FlowPanel();
		slideItem.addStyleName("slide-item-utils");
		flowPanel.add(slideItem);
		slideItem.getElement().getStyle().setWidth(134, Unit.PX);
		return flowPanel;
	}

	public native void controllBodyUtils() /*-{
		var imageUtils = $doc.querySelector('.utils-image');
		var imageUtilsWidth = imageUtils.clientWidth;
		
		setSlidePosition(imageUtilsWidth)
		$wnd.addEventListener('resize', function() {
			setSlidePosition(imageUtilsWidth)
		});
		
		function setSlidePosition(imageUtilsWidth) {
			var slideUtils = $doc.querySelector('.slide-utils');
			slideUtils.style.bottom = 0;
			var slideItems = $doc.getElementsByClassName("slide-item-utils");
			for (var i = 0; i < slideItems.length; i++) {
				slideItems[i].style.width = "150px";
				slideItems[i].style.margin = "0 auto"
			}
		}
	}-*/;

	public SlideContainer getSlideUtils() {
		return slideUtils;
	}

	public void setSlideUtils(SlideContainer slideUtils) {
		this.slideUtils = slideUtils;
	}

}
