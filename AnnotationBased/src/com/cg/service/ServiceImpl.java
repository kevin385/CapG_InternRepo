package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.IDao;

@Component
public class ServiceImpl {
	@Autowired
	IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	public void myDisplay() {
		dao.connect();
	}
}
