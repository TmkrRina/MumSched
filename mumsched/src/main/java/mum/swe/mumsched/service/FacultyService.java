package mum.swe.mumsched.service;

import mum.swe.mumsched.enums.MonthEnum;
import mum.swe.mumsched.model.Faculty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface FacultyService {    
	Faculty save(Faculty faculty);
	Faculty findOne(Long id);
	void delete(Long id);
	Page<Faculty> findAll(Pageable pageable);
	Faculty findByUsername(String userName);

	List<Faculty> findAll();
	List<Faculty> findAllByMonth(MonthEnum month);
}
