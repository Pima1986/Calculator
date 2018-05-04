package telran.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.Calculator.dto.CalculateData;

import java.util.*;

@SpringBootApplication // для посторения аппл контента
@RestController // джексон принимеает и выдает в джейсон

public class CalculatorAppl {
	@RequestMapping(value = "operations")
	Set<String> getOperations() {
		return calculator.getOperations();
	}

	Calculator calculator = new Calculator();

	@RequestMapping(value = "padla")
	String greetings() {
		return "Hello";
	}

	@PostMapping(value = "calculate")
	int getResult(@RequestBody CalculateData data) {
		return calculator.getResult(data.operation, data.op1, data.op2);
	}

	public static void main(String[] args) {
		SpringApplication.run(CalculatorAppl.class, args);
	}

}
