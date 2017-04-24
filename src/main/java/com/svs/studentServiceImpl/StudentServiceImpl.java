package com.svs.studentServiceImpl;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svs.bean.StudentBean;
import com.svs.entity.Email;
import com.svs.entity.Student;
import com.svs.repository.EmailRepo;
import com.svs.repository.StudentRepo;
import com.svs.studentService.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private static final Mapper mapper = new DozerBeanMapper();

	@Autowired
	StudentRepo studentRepo;
	@Autowired
	EmailRepo emailRepo;

	@Override
	public String studentRegistration(StudentBean studentBean) {
		Student student = new Student();
		student = mapper.map(studentBean, Student.class);
		Email email = new Email();
		email.setEmail(studentBean.getEmail());
		studentRepo.save(student);
		email.setStudent(student);
		emailRepo.save(email);
		System.out.println("-----"+studentBean.getGender());
		return "saved";
	}
}
