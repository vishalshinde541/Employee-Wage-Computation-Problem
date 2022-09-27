package com.Bridgelabz.EmployeeWageComputation;

public class EmployeeWageComputation {
	static int empAttendance;
	static int full_Day_Hours = 8;
	static int part_Time_Hours = 4;
	static int wage_Per_Hour = 20;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		System.out.println("-------------");
		
		int dailyWage = 0;
		int monthlyWage = 0;
		
		for (int i = 1; i <= 20; i++) {
			empAttendance = isEmpPresent();
			if (empAttendance == 0) {
				System.out.println("Employee is present");	
				dailyWage = full_Day_Hours*wage_Per_Hour;
				monthlyWage += dailyWage;
			}
			else if (empAttendance == 1) {
				System.out.println("Employee is part time today");
				dailyWage = part_Time_Hours*wage_Per_Hour;
				monthlyWage += dailyWage;
			}
			else {
				System.out.println("Employee is absent");
			}
		}
		
		System.out.println("-------------");
 	    System.out.println("Monthly wage of employee of 20 working days : " + monthlyWage);
		
		
	}

	static int isEmpPresent() {
		int n1 = (int) (Math.random()*3);
		return n1;
		
	}
}
