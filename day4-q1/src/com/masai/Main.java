package com.masai;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
	
		List<Customer> clist=new ArrayList<>();
		
		clist.add(new Customer("Raushan", 23, "Male", "Patna"));
		clist.add(new Customer("Raushan2", 23, "Male", "khatna"));
		clist.add(new Customer("Raushan3", 24, "Male", "Patna"));
		clist.add(new Customer("Raushan4", 53, "Male", "watna"));
		clist.add(new Customer("Raushan5", 63, "Male", "ratna"));
		clist.add(new Customer("Raushan6", 23, "Male", "aatna"));
		clist.add(new Customer("Raushan7", 63, "Male", "eatna"));
		clist.add(new Customer("Raushan9", 93, "Male", "iatna"));
		clist.add(new Customer("Raushan1", 43, "Male", "yatna"));
		clist.add(new Customer("Raushan34", 73, "Male", "katna"));
		clist.add(new Customer("Raushan12", 23, "Male", "loatna"));
		
		List<Customer> filtlist=clist.stream().filter(a -> a.getAge()>30).collect(Collectors.toList());
		
		Consumer<Customer> cr=cus ->{
			
			System.out.println(cus);
		};
		System.out.println("Customer who have age more than 30");
filtlist.forEach(cr);


List<String> namelist=clist.stream().map(a -> a.getName()).collect(Collectors.toList());
System.out.println();
System.out.println("Nmae of all customers");
namelist.forEach(b -> {
   System.out.println(b);
});


List<Customer> cl=clist.stream().sorted((a,b) ->a.getAge()>b.getAge()?-1:1).collect(Collectors.toList());

Consumer<Customer> d=(vt) ->{
	
	System.out.println(vt);
};
System.out.println();

System.out.println("Sorted in Descending order");
cl.forEach(d);

	}

}
