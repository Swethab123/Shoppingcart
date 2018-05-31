package com.niit.controllers;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.PaymentDao;
import com.niit.model.CustomerOrder;
import com.niit.model.Payment;

@SuppressWarnings("unused")
@Controller
public class PaymentController {
	 @Autowired
	 Payment payment;
	
	@Autowired

     PaymentDao paymentDao;
	 
	
	/* @RequestMapping("/payment")
		public ModelAndView()
		{
			ModelAndView mv = new ModelAndView("payment");
			return mv;
		}*/
//	@ModelAttribute("order")
//	public  CustomerOrder newpayorder()
//	{
//		System.out.println("Payment obj created");
//		return new CustomerOrder();
//	}


@RequestMapping(value="/payment", method=RequestMethod.POST)
       public String pay(@ModelAttribute("order") CustomerOrder order,Model m)
     {
	    System.out.println("Payment details, taking order, addtopymt is created");
	    m.addAttribute("addtopymt",payment);
	    System.out.println(payment.getPymtemail());
	       return "payment";
     
     }



//@ModelAttribute("addtopymt")
//public Payment newpayt()
//{
//	System.out.println("Payment obj created");
//	return new Payment();
//}

@PostMapping(value="/addpayment")
public String addingpytm(@ModelAttribute("addtopymt") Payment addtopymt )
{
	System.out.println("Trying to pay");
	System.out.println(addtopymt.getPymtname());
	System.out.println(addtopymt.getPymtnameoncard());
	System.out.println("paying");
	paymentDao.insertPayment(addtopymt);
	return "redirect:/home";
}

@RequestMapping("/checkout")
public String check()
{
	return "payment";
}

}