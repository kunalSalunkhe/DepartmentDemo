package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	public Department addDept(Department department) {
		return departmentRepository.save(department);
	}

	public Department getDept(int deptId) {

		Optional<Department> de = departmentRepository.findById(deptId);
		Department d = de.orElse(null);

		return d;
	}
}
