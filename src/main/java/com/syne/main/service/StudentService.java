package com.syne.main.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.syne.main.entities.StudentCache;

@Service
public class StudentService {
	
	@Cacheable("abc")
	public StudentCache getStudentById(long id) {
		
		try {
			System.out.println("Sleeping 10 secs ...");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new StudentCache(id,"Anand","Solapur");
	}
	
	

}
