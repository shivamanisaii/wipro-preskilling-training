package com.wipro.Day_seven;
import java.util.*;

public class LearnerLinklist {
	public static void main(String[] args) {
		List<Learner> learnerlist=new LinkedList<Learner>();

		Learner l1 =new Learner();
		l1.setName("Shiva");
		l1.setVideo("Video: On");
		l1.setMic("Mic: on");
		
		Learner l2 =new Learner();
		l2.setName("sahith");
		l2.setVideo("Video: On");
		l2.setMic("Mic: on");
		
		Learner l3 =new Learner();
		l3.setName("Shiva");
		l3.setVideo("Video: On");
		l3.setMic("Mic: on");

	
		learnerlist.add(l1);
		learnerlist.add(l2);
		learnerlist.add(l3);
	
		
		for (Learner obj:learnerlist) {
			System.out.println(obj.getName());
			System.out.println(obj.getVideo());
			System.out.println(obj.getMic());
		}
	}
}
