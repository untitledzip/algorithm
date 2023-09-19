package org.example.ch01;

import java.util.Scanner;

class Max3 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값 구하기");
        System.out.println("a의 값: ");
        int a = stdIn.nextInt();
        System.out.println("b의 값: ");
        int b = stdIn.nextInt();
        System.out.println("c의 값: ");
        int c = stdIn.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 " + max +" 입니다.");


    }

    Scanner stdIn = new Scanner(System.in);
//
//        System.out.println("int a: ");
//        int a = stdIn.nextInt();
//        System.out.println("int b: ");
//        int b = stdIn.nextInt();
//        System.out.println("int c: ");
//        int c = stdIn.nextInt();
//        System.out.println("int d: ");
//        int d = stdIn.nextInt();
//
//        int max = a;
//
//        if(max < b) max = b;
//        if(max < c) max = c;
//        if(max < d) max = d;
//
//        System.out.println("최댓값은 " +max+ " 입니다.");
//    }

//    public static void main(String[] args){
//        //세 값의 최솟값을 구하는 max4 메서드
//
//        Scanner stdInt = new Scanner(System.in);
//
//        System.out.println("세 값의 최솟값을 구하는 예제");
//        System.out.println("int a: ");
//        int a= stdInt.nextInt();
//        System.out.println("int b: ");
//        int b = stdInt.nextInt();
//        System.out.println("int c: ");
//        int c = stdInt.nextInt();
//
//        int min = a;
//        if(min > b) min = b;
//        if(min > c) min = c;
//
//        System.out.println("최솟값은 " + min +" 입니다.");
//    }

//    public static void main(String[] args){
//        //네 값의 최솟값을 구하는 max4 메서드
//
//        Scanner stdId = new Scanner(System.in);
//
//        System.out.println("네 값의 최솟값을 구하는 max4 메서드");
//        System.out.println("int a: ");
//        int a = stdId.nextInt();
//        System.out.println("int b: ");
//        int b = stdId.nextInt();
//        System.out.println("int c: ");
//        int c = stdId.nextInt();
//        System.out.println("int d: ");
//        int d = stdId.nextInt();
//
//        int min = a;
//        if(b < min) min = b;
//        if(c < min) min = c;
//        if(d < min) min = d;
//
//        System.out.println("네 값의 최솟값은 " + min +" 입니다.");
//    }

}
