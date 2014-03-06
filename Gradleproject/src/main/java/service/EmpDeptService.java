package main.java.service;

import main.java.dao.EmpDao;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpDeptService {

	@Autowired
	EmpDao empDao;
	
	 public void addData(){
		 empDao.addEmployee();
	    }
}
