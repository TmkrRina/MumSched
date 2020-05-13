package mum.swe.mumsched.repository;

import mum.swe.mumsched.enums.MonthEnum;
import mum.swe.mumsched.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("facultyRepository")
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
	
	@Query("select f from Faculty f join f.user u WHERE u.username = :userName")
	public Faculty findByUsername(@Param("userName") String userName);
	
	@Query("select f from Faculty f WHERE :month MEMBER OF f.monthEnums")
	public List<Faculty> findAllByMonth(@Param("month") MonthEnum month);
}