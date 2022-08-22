package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LooseCouple02Application {

	public static void main(String[] args) {
		
		//to run bikegame, bikegame and gamerunner will be made @comoponent
		//create context with components
		ConfigurableApplicationContext context = SpringApplication.run(LooseCouple02Application.class, args);
		//get object of gamerunner
		GameRunner runner = context.getBean(GameRunner.class);
	
		/*
		 * GamingConsole game = new MarioGame(); //GamingConsole game= new BikeGame();
		 * GameRunner runner = new GameRunner(game);
		 */
		runner.runGame();
	}

}
