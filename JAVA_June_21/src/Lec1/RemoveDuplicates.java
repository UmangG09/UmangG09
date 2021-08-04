package Lec1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("barry");
        
        List<String> list2=new ArrayList<String>();
        list2.add("apple");
        list2.add("banana12");
        list2.add("mango12");
        list2.add("barry");
        
        
        
        
        
        List<String> intersect = list.stream()
        	    .filter(list2::contains)
        	    .collect(Collectors.toList());
        
        System.out.println(intersect);
         list2.removeAll(intersect);
        System.out.println(list);
        System.out.println(list2);
        
        
        

	}

}
