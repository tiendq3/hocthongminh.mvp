package com.koolsoft.hocthongminh.client.basic;

import org.gwtbootstrap3.client.ui.html.Div;

import com.koolsoft.hocthongminh.client.view.Footer;
import com.koolsoft.hocthongminh.client.view.Header;
import com.koolsoft.hocthongminh.client.view.NavBarHeader;

public interface BasicView {
	Header getHeader();
	NavBarHeader getNavBarHeader();
	Div getContent();
	Footer getFooter();
}
