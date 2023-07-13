package com.demo.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {

	public void up() {

		System.out.println("PacManGame jump");

	}

	public void down() {

		System.out.println("PacManGame down in the pit");

	}

	public void left() {

		System.out.println("PacManGame stop");

	}

	public void right() {

		System.out.println("PacManGame accelerate");

	}

}
