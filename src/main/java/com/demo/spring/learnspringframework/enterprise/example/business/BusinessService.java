
package com.demo.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class BusinessService{
	
	//Field based injection
//	@Autowired
//	private DataService dataService;
	
	private DataService dataService;
	
	//Setter based injection
	@Autowired
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
		}
}

