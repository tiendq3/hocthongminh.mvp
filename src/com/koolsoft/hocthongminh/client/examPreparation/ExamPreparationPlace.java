package com.koolsoft.hocthongminh.client.examPreparation;

import com.koolsoft.hocthongminh.client.basic.BasicPlace;
import com.koolsoft.hocthongminh.client.basic.PlaceConfig;

public class ExamPreparationPlace extends BasicPlace {
	public ExamPreparationPlace() {
		this.token = PlaceConfig.LUYEN_THI_THPTQG;
	}

	public ExamPreparationPlace(String token) {
		super(token);
	}
}
