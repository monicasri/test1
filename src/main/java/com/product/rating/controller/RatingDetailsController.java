package com.product.rating.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.rating.dao.RatingRepository;
import com.product.rating.dto.RatingDTO;
import com.product.rating.entity.RatingDetails;
import com.product.rating.service.RatingDetailsService;



@RestController
public class RatingDetailsController {

	
	@Autowired
	private RatingDetailsService ratingDetailsService;
	
	@Autowired
    private EntityManager entityManager;
    
    List<RatingDTO> rdtoList = new ArrayList<RatingDTO>();
	
	
	@RequestMapping(value = "/ratingDetails/{productId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<RatingDTO> getRatingDetails(
			@PathVariable("productId") long productId) {
		
		System.out.println("From Controller : "+productId);
		
		
		
		entityManager.clear();
        
            try {
                List<RatingDetails> ratingList = ratingDetailsService.getRatingDetails(productId);
                rdtoList.clear();
                
                for(int i=0;i<ratingList.size();i++) {
                    RatingDTO rd = new RatingDTO();
                    System.out.println(ratingList.get(i).getProductId()+""+ratingList.get(i).getRating()+""+ratingList.get(i).getReviewId()+""+ratingList.get(i).getRatingId());
                    
                    rd.setProductId(ratingList.get(i).getProductId());
                    rd.setRatingId(ratingList.get(i).getRatingId());
                    rd.setRating(ratingList.get(i).getRating());
                    rd.setReviewId(ratingList.get(i).getReviewId());
                    System.out.println(i);
                    rdtoList.add(rd); 
                    
                    
                }
                //BeanUtils.copyProperties(reviewList, rtoList);
                ratingList.clear();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

 

            
        return rdtoList; }
}