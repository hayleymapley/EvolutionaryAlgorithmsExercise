package com.hayleymapley;

public class Candidate {

	private double[] values;
	private double evaluation = Double.MAX_VALUE;
	
	public Candidate(double[] values) {
		this.values = values;
	}
	
	public Candidate() {
		this.values = new double[5];
	}
	
	public void printValues() {
		System.out.print("Values: ");
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println("");
	}
	
	public double[]	createOffspring(double[] partner) {
		
		//TODO: Recombine DNA and return offspring
		return partner;
	}
			
	public double[] getValues() {
		return values;
	}
	public void setValues(double[] values) {
		this.values = values;
	}

	public double getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(double evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
