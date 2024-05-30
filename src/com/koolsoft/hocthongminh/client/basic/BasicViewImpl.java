package com.koolsoft.hocthongminh.client.basic;

import org.gwtbootstrap3.client.ui.html.Div;

import com.koolsoft.hocthongminh.client.view.Footer;
import com.koolsoft.hocthongminh.client.view.Header;
import com.koolsoft.hocthongminh.client.view.NavBarHeader;

public class BasicViewImpl extends Div implements BasicView {

	protected Header header;

	protected NavBarHeader navBarHeader;

	protected Footer footer;
	
	protected Div content = new Div();
	
	public BasicViewImpl() {
		this.header = new Header();
		this.navBarHeader = new NavBarHeader();
		this.footer = new Footer();
		this.add(header);
		this.add(navBarHeader);
		this.add(content);
		this.add(footer);
		this.content.setId("content");
	}

	@Override
	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	@Override
	public NavBarHeader getNavBarHeader() {
		return navBarHeader;
	}

	public void setNavBarHeader(NavBarHeader navBarHeader) {
		this.navBarHeader = navBarHeader;
	}

	@Override
	public Footer getFooter() {
		return footer;
	}

	public void setFooter(Footer footer) {
		this.footer = footer;
	}

	@Override
	public Div getContent() {
		return content;
	}

	public void setContent(Div content) {
		this.content = content;
	}
}
