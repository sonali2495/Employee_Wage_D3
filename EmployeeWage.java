package com.bridgelabz.Fellowship_Batch;

public class EmployeeWage {
	public static final int IsPartTime = 1;
	public static final int IsFullTime = 2;
	public static final int EmpRatePerHour = 20;
	public static final int numOfWorkingDays = 2;
	public static final int maxHrsInMonth = 10;

	public static void main(String[] args) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
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
			System.out.println("Days#: " + totalWorkingDays + "Employee Hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs + EmpRatePerHour;
		System.out.println("Total Employee Wage " + totalEmpWage);
	}

}
