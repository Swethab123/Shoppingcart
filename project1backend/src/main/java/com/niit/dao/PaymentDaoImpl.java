package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.PaymentDao;
import com.niit.model.Payment;

@Repository("paymentDao")
public class PaymentDaoImpl implements PaymentDao {
	
	@Autowired
	PaymentDao paymentDao;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void PaymentDAOImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;

	}
	
	
	
	public PaymentDaoImpl()
	{
		
	}
	
	 
	@Transactional
	public void insertPayment(Payment payment)
	{
		sessionFactory.getCurrentSession().save(payment);
	}
	 
}