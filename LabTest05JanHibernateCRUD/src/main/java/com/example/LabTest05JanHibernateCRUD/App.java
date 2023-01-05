package com.example.LabTest05JanHibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
//		StudentEntity s1 = new StudentEntity(1, "Sakshi", "BCM");
//		StudentEntity s2 = new StudentEntity(2, "Khushi", "IT");
//		StudentEntity s3 = new StudentEntity(3, "Raunak", "BCA");
//		StudentEntity s4 = new StudentEntity(4, "Dhiraj", "IAS");
//		s.save(s1);
//		s.save(s2);
//		s.save(s3);
//		s.save(s4);

//		StudentEntity stu = s.get(StudentEntity.class, 4);
//		stu.setStu_dept("Civil");
//		s.save(stu);

//		StudentEntity stu = s.get(StudentEntity.class, 4);
//		s.delete(stu);

		StudentEntity stu = s.get(StudentEntity.class, 1);
		System.out.println(stu);
		tr.commit();

//		System.out.println("Object Saved !!!!!!");
	}
}
