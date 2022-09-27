package com.Bridgelabz.EmployeeWageComputation;

public class EmployeeWageComputation {
	static int empAttendance;
	static int full_Day_Hours = 8;
	static int wage_Per_Hour = 20;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		empAttendance = isEmpPresent();
		int dailyWage = 0;
		
		if (empAttendance == 0) {
			System.out.println("Employee is present");	
			dailyWage = full_Day_Hours*wage_Per_Hour;
		}
		else {
			System.out.println("Employee is absent");
		}
		
		System.out.println("Daily Wage of employee : " + dailyWage);
	}

	static int isEmpPresent() {
		int n1 = (int) (Math.random()*2);
		return n1;
		
	}
}
