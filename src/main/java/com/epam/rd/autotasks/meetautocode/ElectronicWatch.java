package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int H = seconds / 60;
        int minute = H % 60;
        int sec = seconds % 60;
        H = H / 60;

        H = H == 24 ? 0 : H;

        System.out.printf("%d:%02d:%02d", H, minute, sec);


    }
}
