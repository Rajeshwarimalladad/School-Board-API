package com.school.sba.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.sba.entity.ClassHour;

public interface ClassHourRepository extends JpaRepository<ClassHour, Integer>{

	
	boolean existsByRoomNoAndBeginsAtBetween(int roomNo, LocalDateTime beginsAt, LocalDateTime endsAt);

}
