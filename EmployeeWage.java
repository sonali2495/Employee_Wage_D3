package com.bridgelabz.Fellowship_Batch;

public class EmployeeWage {

	public static void main(String[] args) {
		int IsFullTime = 1;
		int EmpRatePerHour = 20;
		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IsFullTime)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EmpRatePerHour;
		System.out.println("Employee Wage= " + empWage);
	}

}
