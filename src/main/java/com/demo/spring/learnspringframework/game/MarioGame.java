package com.demo.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component 
public class MarioGame implements GamingConsole {

	public void up() {

		System.out.println("jump");

	}

	public void down() {

		System.out.println("down in the pit");

	}

	public void left() {

		System.out.println("stop");

	}

	public void right() {

		System.out.println("accelerate");

	}

}
