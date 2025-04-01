package it.carmine.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AggiungoClassedabranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Ciao Come va aggiungo classeaaaa");
System.out.println("Aggiungo seconda classe");
System.out.println("Aggiungo terza classe classe");
System.out.println("Aggiungo quarta classe");
System.out.println("2026");
removeDuplicate();
GetDistinct_Objects();
	}
private static  void removeDuplicate() {
	ArrayList<Integer> numbersList
	= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	 
	Set<Integer> setWithoutDuplicates = numbersList.stream()
	.collect(Collectors.toSet());
	 
	System.out.println(setWithoutDuplicates);
}
/*
 * ArrayList<Integer> numbersList
= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
 
Set<Integer> setWithoutDuplicates = numbersList.stream()
.collect(Collectors.toSet());
 
System.out.println(setWithoutDuplicates);
 */
private static void GetDistinct_Objects() {
	Person p1=new Person(1,"alfio","rosso");
	Person p2=new Person(3,"alfio","rosso");
	Person p3=new Person(3,"tralfio","rossi");
	Person p4=new Person(4,"alfio","rosso");
	Person p5=new Person(4,"alo","rossi");
	Person p6=new Person(3,"CARMINE","rossi");
	Person p7=new Person(3,"CARMINE","bianchei");
	
	//Add some random personshttps://howtodoinjava.com/java8/stream-find-remove-duplicates/
	List<Person> list = Arrays.asList(p1, p2, p3, p4, p5, p6);
	for (Person persona : list) {
	    System.out.println(persona.getFname()); 
	}

	// Get distinct people by full name
	List<Person> distinctPeople = list.stream()
	              .filter( distinctByKey(p -> p.getFname() + " " + p.getLname()) )
	              .collect( Collectors.toList() );

	//********The distinctByKey() method need to be created**********
	for (Person persona : distinctPeople) {
	    System.out.println(persona.getFname()+persona.getId()); 
	}

	
}
public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
{
  Map<Object, Boolean> map = new ConcurrentHashMap<>();
  return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
}

}
