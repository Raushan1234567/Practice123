package com.masai;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	    public static void main(String[] args) {
	        List<Fruit> fruits = Arrays.asList(
	            new Fruit("Orange", 10, 89),
	            new Fruit("Papaya", 20, 90),
	            new Fruit("Apple", 10, 45),
	            new Fruit("Watermelon", 10, 56),
	            new Fruit("Guava", 10, 40),
	            new Fruit("Pomegranate", 10, 200)
	        );

	      
	        Map<String, Double> map = fruits.stream() .collect(Collectors.toMap( Fruit::getName, F -> F.getPrice()*F.getQuantity()));
	        System.out.println(map);

	        double total = fruits.stream().mapToDouble(Fruit::getPrice).sum();
	          
	           
	        System.out.println("Total price for all fruits: " + total);

	       
	        List<Fruit> filteredList = fruits.stream().sorted((a,b) -> a.getPrice()>b.getPrice()?1:-1)
	            .filter(fruit -> fruit.getPrice() >= 50).collect(Collectors.toList());
	        System.out.println("Fruit with per kg price >= 50: " + filteredList);
	       
	          List<Fruit> tf=filteredList.stream().skip(2).limit(2).toList();
	          
	          System.out.println();
	          System.out.println("thirs and fourth element are:");
	          
	          tf.forEach(b -> {
	        	  System.out.println(b);
	        	  });
	          }
	        
	    
	}


