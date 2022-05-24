package com.elxinoby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elxinoby.entidad.Estudiante;
import com.elxinoby.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudS1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudS1Application.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante("roman", "gonzales", "roman@gmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("lisa", "simpson", "lisa@gmail.com");
		repositorio.save(estudiante2);

	}

}
