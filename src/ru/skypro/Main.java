package ru.skypro;

public class Main {
    public static void main(String[] args) {
        // Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Task 2
        String upperName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperName);

        // Task 3
        String fullName2 = "Иванов Семён Семёнович";
        String editName = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + editName);

    }
}