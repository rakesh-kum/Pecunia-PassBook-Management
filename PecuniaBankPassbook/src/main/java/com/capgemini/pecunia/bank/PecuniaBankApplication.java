package com.capgemini.pecunia.bank;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.capgemini.pecunia.bank.entity.Account;
import com.capgemini.pecunia.bank.service.PBankService;
import com.capgemini.pecunia.bank.web.LoggerInterceptor;


@SpringBootApplication
public class PecuniaBankApplication implements CommandLineRunner{

	@Autowired
	public LoggerInterceptor loggerInterceptor;
	@Autowired
	PBankService service;
	
	@Bean(name="authenticatemap")
	public Map<String, Account> getAuthenticateMap(){
		return new HashMap<String, Account>();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PecuniaBankApplication.class, args);
		
			
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Rakesh started successfully");
   System.out.println(service.getBankTransactions("9876543219"));
		// TODO Auto-generated method stub
		
	}

}
