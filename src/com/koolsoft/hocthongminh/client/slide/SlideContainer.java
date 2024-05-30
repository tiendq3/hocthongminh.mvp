package com.koolsoft.hocthongminh.client.slide;

import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Div;

import com.google.gwt.dom.client.Element;

public class SlideContainer extends Div {

	public SlideContainer() {
		this.setStyleName("owl-carousel owl-theme");
	}

	public SlideContainer(String... imageUrls) {
		for (String url : imageUrls) {
			Image image = new Image(url);
			this.add(image);
		}
		this.setStyleName("owl-carousel owl-theme");
	}

	public native void controlSlider(Element e, int numberItem, boolean dotsStyle) /*-{
		$wnd.jQuery(e).owlCarousel({
			loop : true,
			items : numberItem,
			autoplay : true,
			marginRight:30,
			autoplayTimeout : 1000,
			autoplayHoverPause : true,
			dots : dotsStyle
		});
	}-*/;

	public native void controlSlideUtils(Element e) /*-{
		$wnd.jQuery(e).owlCarousel({
			loop : true,
			autoplay : true,
			autoplayTimeout : 10000,
			autoplayHoverPause : true,
			marginRight:30,
			dots : false,
			responsive : {
				0 : {
					items : 1
				},
				
				920 : {
					items : 3
				},
				1024 : {
					items : 3
				}
			}
		});
	}-*/;
}
