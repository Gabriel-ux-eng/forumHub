package br.com.alura.forumhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.alura.forumhub")
public class ForumHubApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ForumHubApplication.class, args);
	}

}
