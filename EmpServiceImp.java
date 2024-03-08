package com.registration.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.app.model.Emp;
import com.registration.app.repository.EmpRepository;


@Service
public class EmpServiceImp implements EmpService {
	
	//@Autowired
	private EmpRepository empRepo;
	
	

	public EmpServiceImp(EmpRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public Emp createEmp(Emp emp) {
		
		return empRepo.save(emp);
	}

	@Override
	public List<Emp> getAllEmp() {
		
		return empRepo.findAll();
	}

	@Override
	public Emp getEmpById(int id) {
		
		return empRepo.findById(id).get();
	}

	@Override
	public void deleteEmp(int id) {
		Emp emp=empRepo.findById(id).get();
		
		if(emp!=null) {
			empRepo.delete(emp);
		}
	}

	@Override
	public Emp updateEmp(int id, Emp emp) {
		Emp oldEmp=empRepo.findById(id).get();
		
		if(oldEmp!=null) {
			emp.setId(id);
		return empRepo.save(emp);
		}
		return null;
	}

	
	
	
	
	
	

}
