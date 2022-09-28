package com.Bridgelabz.EmployeeWageComputation;

public class EmployeeWageComputation {
	static int empAttendance;
	static final  int full_Day_Hours = 8;
	static final int part_Time_Hours = 4;
	static final int wage_Per_Hour = 20;
	static final  int MaxWorking_Hours_for_Month = 100;
	static final  int maxWorking_Days_For_Month = 20;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		System.out.println("-------------");
		
		int dailyWage = 0;
		int monthlyWage = 0;
		int day = 0;
		int workHours = 0;
		
		while (day <= maxWorking_Days_For_Month && workHours <= MaxWorking_Hours_for_Month) {
			empAttendance = isEmpPresent();
			if (empAttendance == 0) {
				System.out.println("day " + day + " Employee is present");	
				dailyWage = full_Day_Hours*wage_Per_Hour;
				monthlyWage += dailyWage;
				workHours +=full_Day_Hours;
			}
			else if (empAttendance == 1) {
				System.out.println("day " + day + " Employee is part time today");
				dailyWage = part_Time_Hours*wage_Per_Hour;
				monthlyWage += dailyWage;
				workHours += part_Time_Hours;
			}
			else {
				System.out.println("day " + day + " Employee is absent");
			}
			
			day++;
		}
		
		System.out.println("-------------");
		System.out.println("Total working days in this month : " + (day-1));
		System.out.println("Total working hours in month : " + workHours);
		System.out.println("-------------");
 	    System.out.println("Monthly wage of employee of 20 working days : " + monthlyWage);	
		
	}

	static int isEmpPresent() {
		int n1 = (int) (Math.random()*3);
		return n1;
		
	}
}
