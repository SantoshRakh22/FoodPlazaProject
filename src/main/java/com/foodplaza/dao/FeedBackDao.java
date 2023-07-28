package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.FeedBack;

public interface FeedBackDao {
	boolean addFeedBack(FeedBack feedback);

	List<FeedBack> getAllFeedBack();

}
