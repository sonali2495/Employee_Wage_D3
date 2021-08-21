package com.bridgelabz.Fellowship_Batch;

public class EmployeeWage {

	public static void main(String[] args) {
		int IsFullTime = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IsFullTime)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
