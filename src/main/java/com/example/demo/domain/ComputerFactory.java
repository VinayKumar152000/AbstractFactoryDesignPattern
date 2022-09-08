package com.example.demo.domain;

public class ComputerFactory {

	public static Computer getComputer(AbstractComputerFactory factory) {
		return factory.createComputer();
	}
}
