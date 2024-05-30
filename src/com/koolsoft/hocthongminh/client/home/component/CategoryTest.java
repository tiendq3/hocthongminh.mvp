package com.koolsoft.hocthongminh.client.home.component;

import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.html.Div;
import org.gwtbootstrap3.client.ui.html.Paragraph;
import org.gwtbootstrap3.client.ui.html.Span;

public class CategoryTest extends Div {
	private final String TEST_DES = "Luyện thi THPT QG các môn Toán, Lý, Hóa, Sinh, Sử, Địa, Giáo Dục Công Dân, Tiếng Anh"
			+ " với đề thi chọn lọc từ các trường và những dạng bài thi bám sát với chương trình thi đại học.";

	public CategoryTest() {
		Container container = new Container();
		container.addStyleName("category-test-content");
		container.add(initTabsBox());
		Span tabIndicator = new Span();
		tabIndicator.setStyleName("tab-indicator");
		container.add(tabIndicator);
		container.add(initContent());
		this.add(container);
		this.setStyleName("category-test");
//		this.handleClickButton();
	}

	Div initTabsBox() {
		Div tabsBox = new Div();
		tabsBox.setStyleName("tabs-box");
		Button deThiBtn = new Button("Đề thi ĐGNL");
		Button luyenThiBtn = new Button("Luyện thi THPT");
		deThiBtn.addStyleName("btn-category-test");
		luyenThiBtn.addStyleName("btn-category-test");
		tabsBox.add(deThiBtn);
		tabsBox.add(luyenThiBtn);
		return tabsBox;
	}

	Div itemTest() {
		Div cellWrapBtn = new Div();
		Button itemTest = new Button("Test");
		cellWrapBtn.add(itemTest);
		cellWrapBtn.addStyleName("col-md-4 col-sm-6 col-xs-12");
		return cellWrapBtn;
	}

	Div initContent() {
		Div testContent = new Div();
		testContent.addStyleName("category-test-body");
		testContent.addStyleName("row");
		Paragraph testDescription = new Paragraph(TEST_DES);
		Div testDescriptionWrap = new Div();
		testDescriptionWrap.add(testDescription);
		testContent.add(testDescriptionWrap);
		for (int i = 0; i < 10; i++) {
			Div itemTest = itemTest();
			testContent.add(itemTest);
		}
		return testContent;
	}

	public native void handleClickButton() /*-{
		var btnCategoryTests = $doc.getElementsByClassName("btn-category-test");
		var tabIndicator = $doc.getElementsByClassName("tab-indicator")[0];
		setTabDefault();

		$wnd.addEventListener('resize', function() {
			setTabDefault();
		});

		//		console.log(btnCategoryTests[0].offsetLeft)
		//		console.log(tabIndicator.offsetLeft)

		btnCategoryTests[0].addEventListener("click", function() {
			var tabCurrent = btnCategoryTests[0];
			var rect = tabCurrent.getBoundingClientRect();
			tabCurrent.classList.add('tab-active');
			tabIndicator.style.left = rect.left + "px";
			inactiveOrthersTab(tabCurrent)
		});
		btnCategoryTests[1].addEventListener("click", function() {
			var tabCurrent = btnCategoryTests[1];
			var rect = tabCurrent.getBoundingClientRect();
			tabCurrent.classList.add('tab-active');
			tabIndicator.style.left = rect.left + "px";
			inactiveOrthersTab(tabCurrent)
		});

		function inactiveOrthersTab(tabCurrent) {
			for (var i = 0; i < btnCategoryTests.length; i++) {
				if (btnCategoryTests[i] !== tabCurrent) {
					btnCategoryTests[i].classList.remove('tab-active');
				}
			}
		}

		function setTabDefault() {
			var tabCurrent = btnCategoryTests[0];
			var rect = tabCurrent.getBoundingClientRect();
			tabCurrent.classList.add('tab-active');
			tabIndicator.style.left = rect.left + "px";
		}
	}-*/;
}
