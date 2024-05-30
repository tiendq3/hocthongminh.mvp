package com.koolsoft.hocthongminh.client.view;

import org.gwtbootstrap3.client.ui.AnchorButton;
import org.gwtbootstrap3.client.ui.AnchorListItem;
import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.DropDownMenu;
import org.gwtbootstrap3.client.ui.ListDropDown;
import org.gwtbootstrap3.client.ui.constants.Toggle;
import org.gwtbootstrap3.client.ui.html.Div;

public class NavBarHeader extends Div {
	private AnchorListItem examPreparationNav;
	private AnchorListItem ratedCapacityExamNav;

	public NavBarHeader() {
		this.add(initNavBarHeader());
		this.addStyleName("nav-bar-header");
	}

	Container initNavBarHeader() {
		Container navBarContent = new Container();
		navBarContent.addStyleName("nav-bar-header-content");

		examPreparationNav = initNavItem("Luyện Thi THPT QG");
		navBarContent.add(examPreparationNav);

		navBarContent.add(initDropDownItem("THCS", "Lớp 6", "Lớp 7", "Lớp 8", "Lớp 9"));
		navBarContent.add(initDropDownItem("THPT", "Lớp 10", "Lớp 11", "Lớp 12"));

		ratedCapacityExamNav = initNavItem("Đề Thi ĐGNL");
		navBarContent.add(ratedCapacityExamNav);

		navBarContent.add(initNavItem("Tài Liệu"));
		navBarContent.add(initNavItem("Kiến Thức"));
		return navBarContent;
	}

	AnchorListItem initNavItem(String value) {
		AnchorListItem navItem = new AnchorListItem(value);
		navItem.addStyleName("nav-item");
		return navItem;
	}

	ListDropDown initDropDownItem(String value, String... subValues) {
		ListDropDown dropDown = new ListDropDown();
		AnchorButton button = new AnchorButton();
		button.setText(value);
		button.setDataToggle(Toggle.DROPDOWN);
		DropDownMenu dropDownMenu = new DropDownMenu();
		for (String subValue : subValues) {
			dropDownMenu.add(new AnchorListItem(subValue));
		}
		dropDown.add(button);
		dropDown.add(dropDownMenu);
		dropDown.addStyleName("nav-item");
		return dropDown;
	}

	public native void scrollDown() /*-{
		var navBarHeader = $doc.querySelector('.nav-bar-header');
		var rightHeader = $doc.querySelector('.right-header');
		$wnd.addEventListener("scroll", function() {
			if ($wnd.scrollY >= 50) {
				navBarHeader.style.position = 'fixed';
				navBarHeader.style.top = 0;
				navBarHeader.style.zIndex = 100;
				navBarHeader.style.width = '100%';

				rightHeader.style.position = 'fixed';
				rightHeader.style.zIndex = 101;
				rightHeader.style.right = '100px';
			} else {
				navBarHeader.style.position = 'relative';
				rightHeader.style.position = 'relative';
			}
		});
	}-*/;

	public native void responsiveNavBar(String menuIcon) /*-{
		var navBarContent = $doc.querySelector('.nav-bar-header-content');

		setDefault()
		initNavBarLeft()
		function setDefault() {
			var windowWidth = $wnd.innerWidth;
			var navBarHeader = $doc.querySelector('.nav-bar-header');
			var iconMenu = menuIcon;
			if (windowWidth <= 980) {
				navBarHeader.innerHTML = iconMenu;
				var logoMobile = $doc.querySelector('.logo-mobile');
				logoMobile.style.display = 'none';
			} else {
				navBarHeader.innerHTML = '';
				navBarHeader.appendChild(navBarContent);
			}
			//			console.log(navBarContent)
		}

		// onclick menu
		function initNavBarLeft() {
			navBarContent.style.flexDecorate = 'column';
		}

		$wnd.addEventListener('resize', function() {
			setDefault()
		});

		$wnd.addEventListener("scroll", function() {
			var logoMobile = $doc.querySelector('.logo-mobile');
			if ($wnd.scrollY >= 50)
				logoMobile.style.display = 'inline';
			else
				logoMobile.style.display = 'none';
		})
	}-*/;

	public AnchorListItem getExamPreparationNav() {
		return examPreparationNav;
	}

	public void setExamPreparationNav(AnchorListItem examPreparationNav) {
		this.examPreparationNav = examPreparationNav;
	}

	public AnchorListItem getRatedCapacityExamNav() {
		return ratedCapacityExamNav;
	}

	public void setRatedCapacityExamNav(AnchorListItem ratedCapacityExamNav) {
		this.ratedCapacityExamNav = ratedCapacityExamNav;
	}

}
