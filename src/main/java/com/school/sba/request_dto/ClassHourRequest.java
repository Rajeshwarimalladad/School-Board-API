package com.school.sba.request_dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassHourRequest {

	private int classHourId;
	private int userId;
	private int roomNo;
}
