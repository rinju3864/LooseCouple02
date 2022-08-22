package com.example.demo;

import org.springframework.stereotype.Component;

public class MarioGame implements GamingConsole            {
	public void up() {
		System.out.println("UP");
	}

	public void down() {
		System.out.println("DOWN");
	}

	public void left() {
		System.out.println("LEFT");
	}

	public void right() {
		System.out.println("RIGHT");
	}
	 
}
