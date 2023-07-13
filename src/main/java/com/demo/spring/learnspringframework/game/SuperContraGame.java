package com.demo.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole{

	public void up() {

		System.out.println("SuperContraGame jump");

	}

	public void down() {

		System.out.println("SuperContraGame down in the pit");

	}

	public void left() {

		System.out.println("SuperContraGame stop");

	}

	public void right() {

		System.out.println("SuperContraGame accelerate");

	}

}
