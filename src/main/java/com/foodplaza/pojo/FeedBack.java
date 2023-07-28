package com.foodplaza.pojo;

public class FeedBack {
	private int feedbackid;
	
	

	private String custName;
	private String emailId;
	private String review;
	private String ranking;
	private String suggestion;
	
	public FeedBack() {
		
	}
	
	public FeedBack(String custName,String emailId, String review, String ranking, String suggestion )
	{
		this.custName=custName;
		this.emailId=emailId;
		this.review=review;
		this.ranking=ranking;
		this.suggestion=suggestion;
	}
	public int getFeedbackid() {
		return feedbackid;
	}

	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "FeedBack [feedbackid=" + feedbackid + "]";
	}
	
	
}
