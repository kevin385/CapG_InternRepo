package com.cg.eis.dao;

import com.cg.eis.bean.*;
import java.util.*;

public interface IEmployeeDAO {
	public double getSumSal(List<Employee> elist);
	
	public List<Employee> sortByName(List<Employee> elist);
	
	public Employee findById(int id);
}
