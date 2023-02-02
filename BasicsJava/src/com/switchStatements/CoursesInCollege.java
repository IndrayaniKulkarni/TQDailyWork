/*
 * Nested switch
 */
package com.switchStatements;

import java.util.Scanner;

public class CoursesInCollege {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String course;

		System.out.println("\nKindly enter the course name = ");
		course = sc.next();
		int no;
		switch (course) {
		case "CSE":
			System.out.println("\n Which semester you are studyding in = ");
			no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("\nFirst semester : \n1.CSE1001 2.CSE1002 3.CSE1003 4.CSE1004 5.CSE1005 6.CSE1006");
				break;
			case 2:
				System.out.println("\nSecond semester : \n1.CSE2001 2.CSE2002 3.CSE2003 4.CSE2004 5.CSE2005 6.CSE2006");
				break;
			case 3:
				System.out.println("\nThird semester : \n1.CSE3001 2.CSE3002 3.CSE3003 4.CSE2004 5.CSE3005 6.CSE3006");
				break;
			case 4:
				System.out.println("\nForth semester : \n1.CSE4001 2.CSE4002 3.CSE4003 4.CSE4004 5.CSE4005 6.CSE4006");
				break;
			case 5:
				System.out.println("\nFifth semester : \n1.CSE5001 2.CSE5002 3.CSE5003 4.CSE5004 5.CSE5005 6.CSE5006");
				break;
			case 6:
				System.out.println("\nSixth semester : \n1.CSE6001 2.CSE6002 3.CSE6003 4.CSE6004 5.CSE6005 6.CSE6006");
				break;
			default :System.out.println("\n Next data not available or your input might be wrong please check.");
			         break;
			}
			break;
		case "IT": System.out.println("\n Which semester you are studyding in = ");
		no = sc.nextInt();
		switch (no) {
		case 1:
			System.out.println("\nFirst semester : \n1.IT1001 2.IT1002 3.IT1003 4.IT1004 5.IT1005 6.IT1006");
			break;
		case 2:
			System.out.println("\nSecond semester : \n1.IT2001 2.IT2002 3.IT2003 4.IT2004 5.IT2005 6.IT2006");
			break;
		case 3:
			System.out.println("\nThird semester : \n1.IT3001 2.IT3002 3.IT3003 4.IT2004 5.IT3005 6.IT3006");
			break;
		case 4:
			System.out.println("\nForth semester : \n1.IT4001 2.IT4002 3.IT4003 4.IT4004 5.IT4005 6.IT4006");
			break;
		case 5:
			System.out.println("\nFifth semester : \n1.IT5001 2.IT5002 3.IT5003 4.IT5004 5.IT5005 6.IT5006");
			break;
		case 6:
			System.out.println("\nSixth semester : \n1.IT6001 2.IT6002 3.IT6003 4.IT6004 5.IT6005 6.IT6006");
			break;
		default :System.out.println("\n Next data not available or your input might be wrong please check.");
		         break;
		}
			break;
		case "ENTC": System.out.println("\n Which semester you are studyding in = ");
		no = sc.nextInt();
		switch (no) {
		case 1:
			System.out.println("\nFirst semester : \n1.ENTC1001 2.ENTC1002 3.ENTC1003 4.ENTC1004 5.ENTC1005 6.ENTC1006");
			break;
		case 2:
			System.out.println("\nSecond semester : \n1.ENTC2001 2.ENTC2002 3.ENTC2003 4.ENTC2004 5.ENTC2005 6.ENTC2006");
			break;
		case 3:
			System.out.println("\nThird semester : \n1.ENTC3001 2.ENTC3002 3.ENTC3003 4.ENTC2004 5.ENTC3005 6.ENTC3006");
			break;
		case 4:
			System.out.println("\nForth semester : \n1.ENTC4001 2.ENTC4002 3.ENTC4003 4.ENTC4004 5.ENTC4005 6.ENTC4006");
			break;
		case 5:
			System.out.println("\nFifth semester : \n1.ENTC5001 2.ENTC5002 3.ENTC5003 4.ENTC5004 5.ENTC5005 6.ENTC5006");
			break;
		case 6:
			System.out.println("\nSixth semester : \n1.ENTC6001 2.ENTC6002 3.ENTC6003 4.ENTC6004 5.ENTC6005 6.ENTC6006");
			break;
		default :System.out.println("\n Next data not available or your input might be wrong please check.");
		         break;
		}
			break;
		case "EE":
			System.out.println("\n Which semester you are studyding in = ");
			no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("\nFirst semester : \n1.EE1001 2.EE1002 3.EE1003 4.EE1004 5.EE1005 6.EE1006");
				break;
			case 2:
				System.out.println("\nSecond semester : \n1.EE2001 2.EE2002 3.EE2003 4.EE2004 5.EE2005 6.EE2006");
				break;
			case 3:
				System.out.println("\nThird semester : \n1.EE3001 2.EE3002 3.EE3003 4.EE2004 5.EE3005 6.EE3006");
				break;
			case 4:
				System.out.println("\nForth semester : \n1.EE4001 2.EE4002 3.EE4003 4.EE4004 5.EE4005 6.EE4006");
				break;
			case 5:
				System.out.println("\nFifth semester : \n1.EE5001 2.EE5002 3.EE5003 4.EE5004 5.EE5005 6.EE5006");
				break;
			case 6:
				System.out.println("\nSixth semester : \n1.EE6001 2.EE6002 3.EE6003 4.EE6004 5.EE6005 6.EE6006");
				break;
			default :System.out.println("\n Next data not available or your input might be wrong please check.");
			         break;
			}
			break;
		case "ME":
			System.out.println("\n Which semester you are studyding in = ");
			no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("\nFirst semester : \n1.ME1001 2.ME1002 3.ME1003 4.ME1004 5.ME1005 6.ME1006");
				break;
			case 2:
				System.out.println("\nSecond semester : \n1.ME2001 2.ME2002 3.ME2003 4.ME2004 5.ME2005 6.ME2006");
				break;
			case 3:
				System.out.println("\nThird semester : \n1.ME3001 2.ME3002 3.ME3003 4.ME2004 5.ME3005 6.ME3006");
				break;
			case 4:
				System.out.println("\nForth semester : \n1.ME4001 2.ME4002 3.ME4003 4.ME4004 5.ME4005 6.ME4006");
				break;
			case 5:
				System.out.println("\nFifth semester : \n1.ME5001 2.ME5002 3.ME5003 4.ME5004 5.ME5005 6.ME5006");
				break;
			case 6:
				System.out.println("\nSixth semester : \n1.ME6001 2.ME6002 3.ME6003 4.ME6004 5.ME6005 6.ME6006");
				break;
			default :System.out.println("\n Next data not available or your input might be wrong please check.");
			         break;
			}
			break;
		case "CE":System.out.println("\n Which semester you are studyding in = ");
		no = sc.nextInt();
		switch (no) {
		case 1:
			System.out.println("\nFirst semester : \n1.CE1001 2.CE1002 3.CE1003 4.CE1004 5.CE1005 6.CE1006");
			break;
		case 2:
			System.out.println("\nSecond semester : \n1.CE2001 2.CE2002 3.CE2003 4.CE2004 5.CE2005 6.CE2006");
			break;
		case 3:
			System.out.println("\nThird semester : \n1.CE3001 2.CE3002 3.CE3003 4.CE2004 5.CE3005 6.CE3006");
			break;
		case 4:
			System.out.println("\nForth semester : \n1.CE4001 2.CE4002 3.CE4003 4.CE4004 5.CE4005 6.CE4006");
			break;
		case 5:
			System.out.println("\nFifth semester : \n1.CE5001 2.CE5002 3.CE5003 4.CE5004 5.CE5005 6.CE5006");
			break;
		case 6:
			System.out.println("\nSixth semester : \n1.CE6001 2.CE6002 3.CE6003 4.CE6004 5.CE6005 6.CE6006");
			break;
		default :System.out.println("\n Next data not available or your input might be wrong please check.");
		         break;
		}
			break;

		}

		sc.close();

	}

}
