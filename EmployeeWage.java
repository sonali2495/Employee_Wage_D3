package com.bridgelabz.Fellowship_Batch;

public class EmployeeWage {

	final int IsPartTime = 1;
	final int IsFullTime = 2;
	final int EmpRatePerHour = 20;
	final int numOfWorkingDays = 20;
	final int maxHrsInMonth = 100;

	void calculateWage() {
		int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Employee Hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs + EmpRatePerHour;
		System.out.println("Total Employee Wage " + totalEmpWage);

	}

	public static void main(String[] args) {
		EmployeeWage e = new EmployeeWage();
		e.calculateWage();
	}

}