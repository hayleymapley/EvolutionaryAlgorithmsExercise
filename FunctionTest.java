package com.hayleymapley;

import java.util.ArrayList;
import nz.ac.vuw.kol.OptimisationFunction;

public class FunctionTest {
	
	private static ArrayList<Candidate> candidates = new ArrayList<>();
	
	public static void main(String[] args) {

		Candidate parent = new Candidate();
		System.out.println("START");
		System.out.println("Evaluation: " + OptimisationFunction.unknownFunction(parent.getValues()));
		parent.printValues();
		
		for(int i=0; i<5000; i++) {
			
			Candidate child = new Candidate();
			for(int j=0; j<child.getValues().length; j++) {
				int chance = (int) Math.ceil(Math.random()*2);
				if (chance == 1) {
					child.getValues()[j] = parent.getValues()[j] + Math.random()-0.5;
				}
			}
			
			if(OptimisationFunction.unknownFunction(child.getValues()) < OptimisationFunction.unknownFunction(parent.getValues())) {
				parent = child;
			}
		}
		
		System.out.println("\nEND");
		System.out.println("Evaluation: " + OptimisationFunction.unknownFunction(parent.getValues()));
		parent.printValues();
		
		//Initialise population with random candidates and print
//		for (int i=0; i<5; i++) {
//			double[] parentValues = {getRandomValue(),getRandomValue(),getRandomValue(),getRandomValue(),getRandomValue()};
//			Candidate parent = new Candidate(parentValues);
//			System.out.println("Candidate " + i);
//			for (int j=0; j<parent.getValues().length; j++) {
//				System.out.print(parent.getValues()[j] + " ");
//			}
//			System.out.println(" ");
//			candidates.add(parent);
//			
//		}
		
		//Evaluate each candidate and choose parents
//		for(Candidate c : candidates) {
//			c.setEvaluation(OptimisationFunction.unknownFunction(c.getValues()));
//			System.out.println(c.getEvaluation());
//			if(c.getEvaluation() < candidates.get(0).getEvaluation()) {
//				candidates.remove(c);
//				candidates.add(0, c);
//			}
//		}
		
		
		//Inside for loop or timing
		
//		ArrayList<Candidate> parents = new ArrayList<>();
//		parents.add(candidates.get(0));
//		parents.add(candidates.get(1));
		

	}
}
