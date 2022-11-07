package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sub1,sub2,sub3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of sub1:");
        sub1=sc.nextInt();
        System.out.println("enter marks of sub2:");
        sub2=sc.nextInt();
        System.out.println("enter marks of sub3:");
        sub3=sc.nextInt();
        if(sub1>60 && sub2>60 && sub3>60) {
            System.out.println("passed");
        }
        else if((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60)){
            System.out.println("prompted");
        }
        else if(sub1>60 || sub2>60 || sub3>60 || (sub1<60&&sub2<60&&sub3<60)) {
            System.out.println("failed");
        }
        }
    }

