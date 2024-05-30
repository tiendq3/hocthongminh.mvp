package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.html.Div;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.koolsoft.hocthongminh.client.resource.CourseImages;

public class CategoryCourse extends Container {
	private final String TITLE_COURSE = "Làm bài tập các môn Toán, Hóa, Sinh, Địa, Sử,... "
			+ "theo chương trình mới nhất dưới hình thức trắc nghiệm."
			+ " Các em có thể luyện đề kiểm tra, đề thi học kỳ 1," + " học kỳ 2 ngay tại trang web Học Thông Minh";

	public CategoryCourse() {
		this.addStyleName("category-course");
		this.initTitleCategory();
		this.initBlockCategory();
		this.appearWhenScrolling();
	}

	void initTitleCategory() {
		Container titleCategory = new Container();
		HTML titleH1 = new HTML("<h1>Luyện tập trắc nghiệm online tại Học Thông Minh</h1>");
		HTML titleSummary = new HTML(
				"<p>Làm trắc nghiệm online các môn Toán, Lý, Hóa, Sinh, Sử, Địa, GDCD, Tiếng Anh, Văn với các bài luyện tập theo chương trình học và đề thi học kì, giữa kì, ... có đáp án, lời giải chi tiết. </p>");
		titleCategory.add(titleH1);
		titleCategory.add(titleSummary);
		titleCategory.setStyleName("title-category");
		this.add(titleCategory);
	}

	void initBlockCategory() {
		CourseImages courseImages = GWT.create(CourseImages.class);
		Div blockCategory = new Div();

		Div blockCategoryItemTHCS = new Div();
		HTML itemTitleTHCS = new HTML("<h1>Khối THCS</h1>");
		Div itemBodyTHCS = new Div();

		Div itemLop6 = initItem(courseImages.lop6(), TITLE_COURSE);
		Div itemLop7 = initItem(courseImages.lop7(), TITLE_COURSE);
		Div itemLop8 = initItem(courseImages.lop8(), TITLE_COURSE);
		Div itemLop9 = initItem(courseImages.lop9(), TITLE_COURSE);
		itemBodyTHCS.add(itemLop6);
		itemBodyTHCS.add(itemLop7);
		itemBodyTHCS.add(itemLop8);
		itemBodyTHCS.add(itemLop9);
		itemBodyTHCS.addStyleName("block-category-item");
		blockCategoryItemTHCS.add(itemTitleTHCS);
		blockCategoryItemTHCS.add(itemBodyTHCS);

		Div blockCategoryItemTHPT = new Div();
		HTML itemTitleTHPT = new HTML("<h1>Khối THPT</h1>");
		Div itemBodyTHPT = new Div();

		Div itemLop10 = initItem(courseImages.lop10(), TITLE_COURSE);
		Div itemLop11 = initItem(courseImages.lop11(), TITLE_COURSE);
		Div itemLop12 = initItem(courseImages.lop12(), TITLE_COURSE);
		itemBodyTHPT.add(itemLop10);
		itemBodyTHPT.add(itemLop11);
		itemBodyTHPT.add(itemLop12);
		itemBodyTHPT.addStyleName("block-category-item");
		blockCategoryItemTHPT.add(itemTitleTHPT);
		blockCategoryItemTHPT.add(itemBodyTHPT);

		blockCategory.add(blockCategoryItemTHCS);
		blockCategory.add(blockCategoryItemTHPT);
		blockCategory.addStyleName("category-body");
		this.add(blockCategory);
	}

	Div initItem(ImageResource imageResource, String titleCourse) {
		Div item = new Div();
		Container itemContent = new Container();
		itemContent.setStyleName("item-content");

		Image itemImage = new Image(imageResource);
		HTML itemTitle = new HTML("<p>" + titleCourse + "</p>");
		Button itemButton = new Button("Luyện ngay  >");
		itemContent.add(itemImage);
		itemContent.add(itemTitle);
		itemContent.add(itemButton);
		item.add(itemContent);

		item.setStyleName("col-xs-6 col-sm-3 col-md-3 col-lg-3");
		item.addStyleName("course-item");
		return item;
	}

	public native void appearWhenScrolling() /*-{
		function checkScroll() {
			var itemCourses = $doc.getElementsByClassName("course-item");

			for (var i = 0; i < itemCourses.length; i++) {
				var item = itemCourses[i];
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
