package com.bridgelabz.Fellowship_Batch;

public class EmployeeWage {
	public static final int IsPartTime = 1;
	public static final int IsFullTime = 2;
	public static final int EmpRatePerHour = 20;

	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case IsPartTime:
			empHrs = 4;
			break;
		case IsFullTime:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EmpRatePerHour;
		System.out.println("Employee Wage= " + empWage);
	}

}
