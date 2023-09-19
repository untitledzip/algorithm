package org.example.ch01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력하기
class Median {

    static int med3(int a, int b, int c){
        if(a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            }
            return c;
        } else if(a > c){
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙 값 구하기");
        System.out.println("int a: ");
        int a = stdIn.nextInt();
        System.out.println("int b: ");
        int b = stdIn.nextInt();
        System.out.println("int c: ");
        int c = stdIn.nextInt();

        System.out.println("세 정수의 중앙값은 " + med3(a,b,c) + " 입니다.");
    }
}
