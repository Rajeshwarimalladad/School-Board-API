package com.school.sba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.sba.request_dto.ClassHourRequest;
import com.school.sba.service.ClassHourService;
import com.school.sba.util.ResponseStructure;

@RestController
public class ClassHourController {
	
	@Autowired
	private ClassHourService classHourService;

	@PostMapping("/academic-program/{programId}/class-hours")
	public ResponseEntity<ResponseStructure<String>> generateClassHourForAcademicProgram(@PathVariable int programId)
	{
		return classHourService.generateClassHourForAcademicProgram(programId);
	}
	
	@PutMapping("/class-hours")
	public ResponseEntity<ResponseStructure<String>> updateClassHour(@RequestBody List<ClassHourRequest> classHourRequests)
	{
		return classHourService.updateClassHour(classHourRequests);
	}
	
}
