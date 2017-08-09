package com.hackrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
	
  static	String a="cde";
  
	static String b="abc";

	public static void main(String[] args) {
		String resulta = a;
		String resultb = b;
		String[] splitedArraya = resulta.split("");
		String[] splitedArrayb = resultb.split("");
		StringBuilder asd=new StringBuilder(a).reverse();

		List<String> dataLista = Arrays.asList(splitedArraya);
		List<String> dataListb = Arrays.asList(splitedArrayb);
		List<Long> outPut = new ArrayList<>();
		Map<Object, Long> dataCalculatedList_A = dataLista.stream()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		Map<Object, Long> dataCalculatedList_B = dataListb.stream()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		dataCalculatedList_A.entrySet().stream().forEach(amap -> {
			Long data = dataCalculatedList_B.remove(amap.getKey());
			if (null == data && null != amap.getValue()) {
				outPut.add(amap.getValue());
			} else if (null == amap.getValue() && null != data) {
				outPut.add(data);
			} else if (amap.getValue() > data) {
				outPut.add(amap.getValue() - data);
			} else {
				outPut.add(data - amap.getValue());
			}

		});
		if (!dataCalculatedList_B.isEmpty()) {
			dataCalculatedList_B.entrySet().forEach((dta) -> {
				outPut.add(dta.getValue());
			});
		}
		
		int sumresult = outPut.stream().mapToInt(i -> i.intValue()).sum();
		System.out.println(sumresult);

		/*
		 * List<String> dataLista_collected=
		 * dataLista.stream().distinct().collect(Collectors.toList()); List<String>
		 * dataListb_collected=
		 * dataListb.stream().distinct().collect(Collectors.toList());
		 * 
		 * List<Long> duplicates =
		 * dataLista_collected.stream().collect(Collectors.groupingBy(c->c,Collectors.
		 * counting())) .entrySet().stream() .filter(e->e.getValue()>1) .map( e ->
		 * e.getValue() ) .collect( Collectors.toList() );
		 * 
		 * int sum= duplicates.stream().mapToInt(i->i.intValue()).sum();
		 */
		// System.out.println(dataLista_collected.size()-sum);

	}

}
