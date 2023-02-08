package com.pluralcamp.demo;

import java.awt.print.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pluralcamp.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>  {
	long deleteById(int id);
}
