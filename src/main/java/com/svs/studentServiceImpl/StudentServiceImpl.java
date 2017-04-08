package com.svs.studentServiceImpl;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svs.bean.StudentBean;
import com.svs.entity.Student;
import com.svs.repository.StudentRepo;
import com.svs.studentService.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private static final Mapper mapper = new DozerBeanMapper();
	
	@Autowired
	 StudentRepo studentRepo;

	@Override
	public String studentRegistration(StudentBean studentBean) {
		Student student = new Student();
		 student = mapper.map(studentBean, Student.class);
		studentRepo.save(student);
		return "saved";
	}
}
