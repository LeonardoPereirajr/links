package com.leonardo.devnology.links;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinksApplication {

	@Value("${supabase.url}")
	private String supabaseUrl;

	@Value("${supabase.key}")
	private String supabaseKey;

	public static void main(String[] args) {
		SpringApplication.run(LinksApplication.class, args);
	}

}
