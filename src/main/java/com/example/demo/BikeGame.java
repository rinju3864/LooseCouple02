package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BikeGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("ACCELERATE");
	}

	@Override
	public void down() {
		System.out.println("BRAKE");
	}

	@Override
	public void left() {
		System.out.println("TURN LEFT");
	}

	@Override
	public void right() {
		System.out.println("TURN RIGHT");
	}
}
