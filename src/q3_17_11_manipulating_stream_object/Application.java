package q3_17_11_manipulating_stream_object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("83", "Electric sander", 7, 57.98D);
		Invoice invoice2 = new Invoice("24", "Power saw", 18, 99.99);
		Invoice invoice3 = new Invoice("7", "Sledge hammer", 11, 21.50);
		Invoice invoice4 = new Invoice("77", "Hammer", 76, 11.99);
		Invoice invoice5 = new Invoice("39", "Lawn mower", 3, 79.50);
		Invoice invoice6 = new Invoice("68", "Screwdriver", 106, 6.99);
		Invoice invoice7 = new Invoice("56", "Jig saw", 21, 11.00);
		Invoice invoice8 = new Invoice("3", "Wrench", 34, 7.50);
		List<Invoice> list = new ArrayList<>();
		list.add(invoice1);
		list.add(invoice2);
		list.add(invoice3);
		list.add(invoice4);
		list.add(invoice5);
		list.add(invoice6);
		list.add(invoice7);
		list.add(invoice8);
		invoice8.getPricePerItem();

		System.out.println(" Sorted by part description");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getPartDescription() ))
		.forEach(System.out::println);
		
		System.out.println("\n Sorted by part price");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getPricePerItem() ))
		.forEach(System.out::println);
		
		System.out.println("\n Sorted by quantity");
		System.out.printf("%15s %5s %n","desc", "price");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getQuantity()))
		.map(invoice -> String.format("%15s %5d", invoice.getPartDescription(), invoice.getQuantity()))
		.forEach(System.out::println);
		
		System.out.println("\n Sorted by value");
		System.out.printf("%15s %5s %n","desc", "value");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getQuantity()*invoice.getPricePerItem()))
		.map(invoice -> String.format("%15s %5f", invoice.getPartDescription(), invoice.getQuantity()*invoice.getPricePerItem()))
		.forEach(System.out::println);
		
		System.out.println("\n Sorted by value, between $200 and $500");
		System.out.printf("%15s %5s %n","desc", "value");
		list.stream()
		.sorted(Comparator.comparing(invoice ->invoice.getQuantity()*invoice.getPricePerItem()))
		.filter(invoice ->
			invoice.getQuantity()*invoice.getPricePerItem() >= 200 && 
			invoice.getQuantity()*invoice.getPricePerItem() <= 500)
		.map(invoice -> String.format("%15s %5f", invoice.getPartDescription(), invoice.getQuantity()*invoice.getPricePerItem()))
		.forEach(System.out::println);
	}
}
