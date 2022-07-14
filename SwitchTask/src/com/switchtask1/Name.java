package com.switchtask1;

import java.util.Scanner;

public class Name {
	
public static void main(String[]args) 
{
		Scanner s=new Scanner(System.in) ;
		System.out.println("ENTERTHENAME" );
		String user=s.nextLine();
		
	
		String user1 ="PRAVEEN";
		switch(user)
		{
		case "pravee":
			System.out.println("useris wrong"); 
			break;
		case "Pravee":
			System.out.println("user is wrong 1");
			break;
		case "PRAVEEN":
			System.out.println("USER IS RIGHT");
			break;
			default :
				System.out.println("USER BLOCKED");
		
		}
	}
		
	}


