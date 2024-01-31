package com.school.sba.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.sba.request_dto.ClassHourRequest;
import com.school.sba.util.ResponseStructure;

public interface ClassHourService {

	ResponseEntity<ResponseStructure<String>> generateClassHourForAcademicProgram(int programId);

	ResponseEntity<ResponseStructure<String>> updateClassHour(List<ClassHourRequest> classHourRequests);

}
