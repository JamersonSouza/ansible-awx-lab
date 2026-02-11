package tech.jamersondev.ansible_awx_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AnsibleAwxLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnsibleAwxLabApplication.class, args);
	}

}
