/**
 * 
 */
package com.invoicebuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author jmens
 *
 */
@Entity
public class Job {
	private Long code;
	private String description;
	private float price;
	
	protected Job() {
	}
	/**
	 * @return the job_code
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCode() {
		return code;
	}
	/**
	 * @param job_code the job_code to set
	 */
	public void setCode(Long code) {
		this.code = code;
	}
	/**
	 * @return the job_description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param job_description the job_description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the job_price
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * @param job_price the job_price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
}
