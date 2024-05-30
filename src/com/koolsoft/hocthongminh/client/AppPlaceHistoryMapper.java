package com.koolsoft.hocthongminh.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.koolsoft.hocthongminh.client.basic.BasicPlace;

@WithTokenizers({ BasicPlace.Tokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
