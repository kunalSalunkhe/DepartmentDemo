package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/depts")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/")
	public Department addDept(@RequestBody Department department) {
		return departmentService.addDept(department);
	}

	@GetMapping("/{id}")
	public Department getDept(@PathVariable("id") int deptId) {

		return departmentService.getDept(deptId);

	}
}
