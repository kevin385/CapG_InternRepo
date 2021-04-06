package com.cg.service;

import com.cg.dao.DaoI;

public class ServiceImpl implements ServiceI {

	DaoI dao;
	
	public void setDao(DaoI dao) {
		this.dao = dao;
	}


	@Override
	public void connectWhichWay() {
		dao.connectionFunc();
	}

}
