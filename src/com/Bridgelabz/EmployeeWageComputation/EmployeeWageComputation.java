package com.Bridgelabz.EmployeeWageComputation;

public class EmployeeWageComputation {
	static int empAttendance;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		empAttendance = isEmpPresent();
		
		if (empAttendance == 0) {
			System.out.println("Employee is present");	
		}
		else {
			System.out.println("Employee is absent");
		}		
	}

	static int isEmpPresent() {
		int n1 = (int) (Math.random()*2);
		return n1;
		
	}
}
