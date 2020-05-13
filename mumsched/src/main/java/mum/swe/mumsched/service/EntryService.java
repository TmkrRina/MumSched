package mum.swe.mumsched.service;

import mum.swe.mumsched.model.Entry;

import java.util.List;


public interface EntryService {

	List<Entry> getList();

	Entry save(Entry entry);

	Entry findEntryById(Long id);

	void delete(Entry entry);

	boolean hasExistsEntryName(String name, long excludedId);

	boolean hasStudentRef(Entry entry);

	boolean hasScheduleRef(Entry entry);
}
