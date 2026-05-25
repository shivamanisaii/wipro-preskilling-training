package com.wipro.Day_seven;
import java.io.ObjectInputStream.GetField;
import java.util.*;

public class LearnersArrList {
	public static void main(String[] args) {
		List<Learner> learners=new ArrayList<Learner>();
		
		Learner l1=new Learner();
		l1.setName("Shiva");
		
		Learner l2 = new Learner();
		l2.setName("Harshini");
		l2.setMic("Off");
		l2.setVideo("On");
		
		Learner l3 = new Learner();
		l3.setName("Baka");
		l3.setMic("Off");
		l3.setVideo("Off");
		Learner l4 = new Learner();
		l4.setName("Sahith");
		l4.setMic("On");
		l4.setVideo("On");
		
		learners.add(l1);
		learners.add(l2);
		learners.add(l3);
		learners.add(l4);
		
		
		System.out.println(learners);
		
		
		for (Learner obj:learners) {
			System.out.println("\n"+obj.getName()+"\n"+obj.getVideo()+"\n"+obj.getMic());
		}
	}
	
}
