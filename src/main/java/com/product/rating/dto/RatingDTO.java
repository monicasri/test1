package com.product.rating.dto;

public class RatingDTO {
	
	private long ratingId;
	private long productId;
	private long reviewId;
	private int rating;
	
	public long getRatingId() {
		return ratingId;
	}
	public void setRatingId(long ratingId) {
		this.ratingId = ratingId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}