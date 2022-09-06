package com.rick.test;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class TestResource {

	@Autowired
	private TestRepository testRepository;

	private static List<Test> tests = new ArrayList<>();

	static {
		tests.add(new Test("Rick", "captainmstar"));
		tests.add(new Test("Joe", "captainmstar"));
		tests.add(new Test("Bob", "captainmstar"));
		tests.add(new Test("Steve", "captainmstar"));
	}

	@GetMapping("/tests")
	public Test getTest() {
		return new Test("Rick", "captainmstar");
	}

	@GetMapping("/tests/{name}")
	public Test getTestByName(@PathVariable String name) {
		Optional<Test> test = tests.stream().filter(t -> t.getName().equalsIgnoreCase(name)).findFirst();
		return test.orElse(null);
	}

	@PostMapping("/tests")
	public ResponseEntity<Test> createTest(@RequestBody Test test) {
		Test newTest = testRepository.save(test);

		// Return url of new resource
		// First get current
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newTest.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

	@ExceptionHandler(ConstraintViolationException.class)
	ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
		System.out.println("ERERERERE");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}

}