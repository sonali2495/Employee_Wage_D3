package com.bridgelabz.Fellowship_Batch;

public class EmployeeWage {

	final int IsPartTime = 1;
	final int IsFullTime = 2;
	final int EmpRatePerHour = 20;
	int numOfWorkingDays;
	int maxHrsInMonth;

	void calculateWage(int workingDays, int workingHours) {
		this.numOfWorkingDays = workingDays;
		this.maxHrsInMonth = workingHours;
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
		System.out.println("Employee Wage for Company 1 is:");
		EmployeeWage company1 = new EmployeeWage();
		company1.calculateWage(100, 20);
		System.out.println("\nEmployee Wage for Company 2 is:");
		EmployeeWage company2 = new EmployeeWage();
		company2.calculateWage(120, 25);
		System.out.println("\nEmployee Wage for Company 3 is:");
		EmployeeWage company3 = new EmployeeWage();
		company3.calculateWage(150, 30);

	}

}
