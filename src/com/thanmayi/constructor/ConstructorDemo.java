package com.thanmayi.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("the customer id is:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enetr the customer name:");
		name=sc.nextLine();
		System.out.println("enetr the city:");
		city=sc.nextLine();
		
		Customer c1= new Customer();
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		System.out.println(c1);
		
		Customer c2= new Customer(name, id,  city);
		System.out.println(c2);
		
		
		

	}

}