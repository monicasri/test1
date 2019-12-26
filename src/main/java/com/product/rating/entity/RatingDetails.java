package com.product.rating.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="RatingDetails")
@NamedQuery(name="RatingDetails.findAll", query="SELECT rd FROM RatingDetails rd")
public class RatingDetails {
	
	@Id
	@Column(name="ratingId")
	private long ratingId; //primary key
 
	@Column(name="productId")
	private long productId;
	
	@Column(name="reviewId")
	private long reviewId;
	
	@Column(name="rating")
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
	

