package com.bridgelabz.Fellowship_Batch;

public class EmployeeWage {
	public static final int IsPartTime = 1;
	public static final int IsFullTime = 2;
	public static final int EmpRatePerHour = 20;
	public static final int numOfWorkingDays = 2;

	public static void main(String[] args) {
		int empHrs = 0, empWage = 0, totalEmpWage = 0;

		for (int day = 0; day < numOfWorkingDays; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10 % 3);
			switch (empCheck) {
			case IsPartTime:
				empHrs = 4;
				break;
			case IsFullTime:
				empHrs = 8;
			default:
				empHrs = 0;
			}
			empWage = empHrs * EmpRatePerHour;
			totalEmpWage += empWage;
			System.out.println("Employee Wage= " + empWage);
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

}
