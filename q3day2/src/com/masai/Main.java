package com.masai;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class Main {
	

	
		 static void displayCountryList(List<Country> list) {
		        Consumer<Country> countryConsumer = (Country country) ->
		                System.out.println(country.getCountryName() + " from the " + country.getContinentName() +
		                        " is of " + country.getArea() + " square Km");
		        list.forEach(countryConsumer);
		    }

		    static List<Country> filterCountry(List<Country> list, Predicate<Country> filterByArea) {
		        List<Country> filteredList12 = new ArrayList<>();
		        for (Country country : list) {
		            if (filterByArea.test(country)) {
		                filteredList12.add(country);
		            }
		        }
		        return filteredList12;
		    }
		    

		 
		public static void main(String args[]) {
		    List<Country> countryList = new ArrayList<>();
		    //Add countries from Asia
		    countryList.add(new Country("China", "Asia", 9596961));
		    countryList.add(new Country("Japan", "Asia", 377975));
		    countryList.add(new Country("India", "Asia", 3287263));
		    countryList.add(new Country("Russia", "Asia", 17098246));

		    //Add countries from Europe
		    countryList.add(new Country("Belgium", "Europe", 30528));
		    countryList.add(new Country("Denmark", "Europe", 43094));
		    countryList.add(new Country("Germany", "Europe", 357168));
		    countryList.add(new Country("Norway", "Europe", 385203));

		    //Add countries from Africa
		    countryList.add(new Country("Egypt", "Africa", 1010408));
		    countryList.add(new Country("Morocco", "Africa", 446300));
		    countryList.add(new Country("South Africa", "Africa", 1221037));
		    countryList.add(new Country("Kenya", "Africa", 580367));
		    
		   

		    Scanner sc = new Scanner(System.in);
		    int choice = -1;
		    

		    List<Country> filterList = countryList;
		    
		    do {
		        System.out.println("\n1. By Area Range");
		        System.out.println("2. By content in country name");
		        System.out.println("3. By continent name");
		        System.out.println("4. Clear Filter ");
		        System.out.println("5. Print Country List");
		        System.out.println("0. Exit");
		        System.out.print("Enter selection: ");

		        choice = sc.nextInt();

		        switch (choice) {
		        case 1:
		            System.out.print("Enter minimum area: ");
		            double minArea = sc.nextDouble();
		            System.out.print("Enter maximum area: ");
		            double maxArea = sc.nextDouble();
		            Predicate<Country> filterByAreaRange = c -> c.getArea() >= minArea && c.getArea() <= maxArea;
		            List<Country> filteredList34 = filterCountry(countryList, filterByAreaRange);
		            displayCountryList1(filteredList34);
		            countryList=filteredList34;
		            break;
		            case 2:
		                System.out.print("Enter search string: ");
		                String searchStr = sc.next();

		                Predicate<Country> filter4 = country -> country.getCountryName().contains(searchStr);
		                List<Country> filteredList3 = filterCountry(countryList, filter4);
		                displaybbyname(filteredList3);
		                countryList=filteredList3;
		                break;
		            case 3:
		                System.out.print("Enter continent name: ");
		                String continentName = sc.next();

		                Predicate<Country>  filter6 = country -> country.getContinentName().equals(continentName);
		                List<Country> filteredList8 = filterCountry(countryList, filter6);
		                displaybycontinent(filteredList8 );
		                countryList=filteredList8;
		                break;
		            case 4:
		            	 countryList=filterList ;
		                
		                break;
		            case 5:
		               
		                    displayCountryList(countryList);
		               
		        }
		    } while (choice != 0);
		    System.out.println("Exit!");
		    sc.close();
		}

		 static void displaybycontinent(List<Country> filteredList8) {
			 Consumer<Country> displayCountry = c -> System.out.println(c.getCountryName() + " from the " + c.getContinentName() + " is of " + c.getArea() + " square Km");
			 filteredList8.forEach(displayCountry);
			
		}

		static void displaybbyname(List<Country> filteredList3) {
			 Consumer<Country> displayCountry = c -> System.out.println(c.getCountryName() + " from the " + c.getContinentName() + " is of " + c.getArea() + " square Km");
			 filteredList3.forEach(displayCountry);
			
		}

		static void displayCountryList1(List<Country> list) {
		    Consumer<Country> displayCountry = c -> System.out.println(c.getCountryName() + " from the " + c.getContinentName() + " is of " + c.getArea() + " square Km");
		    list.forEach(displayCountry);
		}


	}

