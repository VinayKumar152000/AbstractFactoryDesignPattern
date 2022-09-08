package com.example.demo.domain;

public class Runner {

	public static void main(String args[]) {
		Computer PC = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer Server = ComputerFactory.getComputer(new ServerFactory("4 GB", "500 GB", "2.8 GHz"));
		System.out.println(PC);
		System.out.println(Server);
	}
}
