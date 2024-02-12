package com.aston.courses;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------------");
        ListArray<King> castle = new ListArray<>();
        castle.add(new King("Arthur"));
        castle.add(new King("Lui"));
        castle.add(new King("Georg"));
        castle.add(new King("Richard"));
        castle.add(new King("Karl"));
        viewCastle("\u001B[32m" + "Kings in castle", castle);
        ListArray<King> castle1 = new ListArray<>();
        castle1.add(new King("Arthur1"));
        castle1.add(new King("Lui1"));
        castle1.add(new King("Georg1"));
        castle1.add(new King("Richard1"));
        castle1.add(new King("Karl1"));
        viewCastle("\u001B[32m" + "Kings in castle1", castle1);
        castle.remove(1);
        viewCastle("\u001B[32m" + "Kings in castle without king #2", castle);
        castle.addAll(castle1);
        viewCastle("\u001B[32m" + "Kings in all castle", castle);
        castle.bubbleSort();
        viewCastle("\u001B[32m" + "Sorted kings in all castle", castle);
        System.out.println("\u001B[0m");
    }

    private static void viewCastle(String mes, ListArray<King> cast){
        System.out.println(mes + "\u001B[37m");
        for (int i = 0; i < cast.size(); i++) {
            System.out.println(cast.get(i).name());
        }
        System.out.println("-------------------");
    }
}