package mum.swe.mumsched.service;

import mum.swe.mumsched.enums.MonthEnum;
import mum.swe.mumsched.model.*;

import java.util.List;

public interface ScheduleService {

	Iterable<Schedule> findAll();

	Schedule findOneById(long id);

	Schedule save(Schedule item);

	Block generateBlock(MonthEnum month, int numberOfSection, List<Faculty> faculties, List<Course> courses);
	Block generateSpecificCourseBlock(MonthEnum month, int numberOfSection, List<Faculty> faculties, Course course);
	Schedule generateSchedule(Entry entry) throws Exception;

	Schedule findOneByEntryId(Long entryId);
}
