package com.demo.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		// SuperContraGame game = new SuperContraGame();
		// GamingConsole game = new PacManGame();

//we don't need to create this anymore as Spring framework would create for us		 
//		 GamingConsole game = new MarioGame();
//		 GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
//		MyWebController controller = context.getBean(MyWebController.class);
//		controller.returnValueFromBusinessService();
	}

}
