import java.util.Scanner;

public class tutorial_2 {
		
	public static String getNoType(int no) {
		String noType = "" ;
		if ( no > 0)
			noType = "positive";
		else if(no <0)
			noType = "negative";
		else noType = "0";
		return noType;
	}
	
	public static Integer greatestNo(int no1,int no2, int no3) {
		
		if ( no1 > no2) {
			if (no1 > no3)
				return no1;
			else return no3;
		}
		else {
			if(no2 > no3)
				return no2;
			else return no3;
		}
			
	}
	
	public static Integer avg(int a, int b, int c) {
		int avg;
		avg = (a + b + c)/3;
		return avg;
	}
	
	public static Boolean isLeapYear(int year) {
		Boolean isLeapYear = false;
		if (year % 100 == 0) {
			if(year%400 == 0) {
				
				isLeapYear = true;
			}
			else {
				isLeapYear = false;
			}
		}
		else if (year % 4 == 0) {
			isLeapYear = true;
		}
		return isLeapYear;
	}
	
	public static void main(String args[]) {
		int task;
		int no;
		String Str_ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the task no:");
		task = sc.nextInt();
		
		switch(task) {
		case 1:
			System.out.println("Enter any number :");
			no = sc.nextInt();
			Str_ans = getNoType(no);
			System.out.println("The entered no is "+ Str_ans);
			break;
		case 2:
			System.out.println("Enter three numbers : ");
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			int no3 = sc.nextInt();
			int grNo = greatestNo(no1,no2,no3);
			System.out.println("The greatest number is "+grNo);
			break;
		case 3:
			System.out.println("Enter the quiz scores :");
			System.out.println("quiz1 score :");
			int quiz1 = sc.nextInt();
			System.out.println("quiz2 score :");
			int quiz2 = sc.nextInt();
			System.out.println("quiz3 score :");
			int quiz3 = sc.nextInt();
			int avg = avg(quiz1,quiz2,quiz3);
			//System.out.println("The avg is "+avg);
			if (avg >=90) {
				System.out.println("grade=A");
			}
			else if (avg >= 80 &&  avg <90) {
				System.out.println("grade=B");
			}
			else if (avg >=60 &&  avg <80) {
				System.out.println("grade=C");
			}
			else if (avg <  60) {
				System.out.println("grade=F");
			}
			break;
		case 4:
			int year;
			System.out.println("Enter the year:");
			year = sc.nextInt();
			Boolean isLeapYear = isLeapYear(year);
			if(isLeapYear == true)
				System.out.println(year + " is a Leap Year.");
			else System.out.println(year + " is not a Leap Year.");
			System.out.println("Enter the month number:");
			int month = sc.nextInt();
			switch(month) {
			case 1:
				System.out.println("January "+ year + " has 31 days");
				break;
			case 2:
				if (isLeapYear(year) == true ) {
					System.out.println("February "+ year + " has 29 days");
				}
				else {
					System.out.println("February "+ year + " has 28 days");
				}
				break;
			case 3:
				System.out.println("March "+ year + " has 31 days");
				break;
			case 4:
				System.out.println("April "+ year + " has 30 days");
				break;
			case 5:
				System.out.println("May "+ year + " has 31 days");
				break;
			case 6:
				System.out.println("June "+ year + " has 30 days");
				break;
			case 7:
				System.out.println("July "+ year + " has 31 days");
				break;
			case 8:
				System.out.println("August "+ year + " has 31 days");
				break;
			case 9:
				System.out.println("September "+ year + " has 30 days");
				break;
			case 10:
				System.out.println("October "+ year + " has 31 days");
				break;
			case 11:
				System.out.println("November "+ year + " has 30 days");
				break;
			case 12:
				System.out.println("December "+ year + " has 31 days");
				break;
			}
			break;
		default:
			System.out.println("You have entered wrong task number!");
		}
		
	}

}
