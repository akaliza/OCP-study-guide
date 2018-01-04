import java.util.stream.*;
import java.util.*;

public class Whiz61{
	
	public static void main(String[] args){
		Stream<Trade> list = Stream.of(new Trade(1,1000,"John"),
									   new Trade(5,200,"Alice"),
									   new Trade(4,250,"Lisa"));
		Stream<Double> totals = list.map(Trade::getTotal);
		/*
		map returns a double type stream not a Double Stream:
		DoubleStream totals = list.map(Trade::getTotal);
		
		mapToDouble will return a DoubleStream:
		Stream<Double> totals = list.mapToDouble(Trade::getTotal); 
			
		we don't pass function when invoking map:	
		Stream<Double> totals = list.map(); 	
		
		there is no such method called apply in a list class
		DoubleStream totals = list.apply(Trade::getTotal);

		*/
		System.out.print(totals.findFirst().get());		
	}
}

class Trade{
	int quantity;
	double price;
	double total;
	String buyer;
	
	Trade(int q,double p,String b){
		quantity = q;
		price = p;
		total = p*q;
		buyer = b;
	}
	
	public double getTotal(){
		return total;
	}
	
	public String toString(){
		return buyer + "," + total;
	}
	
}