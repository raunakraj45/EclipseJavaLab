package com.example.LabTest05JanHibernateCRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
	@Id
	private int stu_id;
	private String stu_name;
	private String stu_dept;

}
