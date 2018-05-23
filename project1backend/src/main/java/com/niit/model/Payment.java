package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Controller;

@Controller
@Entity
public class Payment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pymtid;
	public int getPymtid() {
		return pymtid;
	}
	public void setPymtid(int pymtid) {
		this.pymtid = pymtid;
	}
	@NotEmpty(message="Payment Name is required(*)")
	private String pymtname;
	@NotEmpty(message="Enter a valid Email Address(*)")
	private String pymtemail;
	@Min(value=10,message="Enter a valid Phone Number")
	private int pymtphone;
	@NotEmpty(message="Payment Delivery Address is required(*)")
	private String pymtdeliveryaddress;
	@Min(value=6,message="Enter a valid Post code")
	private int pymtpostcode;
	@NotEmpty(message="Country name is required")
	private String pymtcountry;	
	@Min(value=3,message="Enter a valid Security code")
	private int pymtsecuritycode;
	@NotEmpty(message="Name on card is required")
	private String pymtnameoncard;
	@Min(value=16,message="Enter a valid Card Number")
	private int pymtcardnumber;
	
	
	
	
	public int getPymtcardnumber() {
		return pymtcardnumber;
	}
	public void setPymtcardnumber(int pymtcardnumber) {
		this.pymtcardnumber = pymtcardnumber;
	}
	public String getPymtname() {
		return pymtname;
	}
	public void setPymtname(String pymtname) {
		this.pymtname = pymtname;
	}
	public String getPymtemail() {
		return pymtemail;
	}
	public void setPymtemail(String pymtemail) {
		this.pymtemail = pymtemail;
	}
	public int getPymtphone() {
		return pymtphone;
	}
	public void setPymtphone(int pymtphone) {
		this.pymtphone = pymtphone;
	}
	public String getPymtdeliveryaddress() {
		return pymtdeliveryaddress;
	}
	public void setPymtdeliveryaddress(String pymtdeliveryaddress) {
		this.pymtdeliveryaddress = pymtdeliveryaddress;
	}
	public int getPymtpostcode() {
		return pymtpostcode;
	}
	public void setPymtpostcode(int pymtpostcode) {
		this.pymtpostcode = pymtpostcode;
	}
	public String getPymtcountry() {
		return pymtcountry;
	}
	public void setPymtcountry(String pymtcountry) {
		this.pymtcountry = pymtcountry;
	}
	
	public int getPymtsecuritycode() {
		return pymtsecuritycode;
	}
	public void setPymtsecuritycode(int pymtsecuritycode) {
		this.pymtsecuritycode = pymtsecuritycode;
	}
	public String getPymtnameoncard() {
		return pymtnameoncard;
	}
	public void setPymtnameoncard(String pymtnameoncard) {
		this.pymtnameoncard = pymtnameoncard;
	}
	

}