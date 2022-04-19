package ru.skypro;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Task 2
        System.out.println("Task 2");
        String upperName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperName);

        // Task 3
        System.out.println("Task 3");
        String fullName2 = "Иванов Семён Семёнович";
        String editName = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + editName);

        // Task 5
        System.out.println("Task 5");
        String fullName3 = "Ivanov Ivan Ivanovich";
        String firstName3;
        String middleName3;
        String lastName3;
        int spaceOne = fullName3.indexOf(" ");
        int spaceTwo = fullName3.lastIndexOf(" ");

        firstName3 = fullName3.substring(spaceOne+1,spaceTwo);
        lastName3 = fullName3.substring(0, spaceOne);
        middleName3 = fullName3.substring(spaceTwo+1);
        System.out.println("Имя сотрудника - " + firstName3);
        System.out.println("Фамилия сотрудника - " + lastName3);
        System.out.println("Отчество сотрудника - " + middleName3);

        // Task 6
        System.out.println("Task 6");
        String fullName4 = "ivanov ivan ivanovich";
        char[] str = fullName4.toCharArray();
        int x = 0;
        for (int i = 0; i < str.length; i++) {
            if (i != 0){
              x  = Character.compare(str[i-1], ' ');
            }

            if ((i == 0) || (x == 0)){
                str[i] = Character.toUpperCase(str[i]);
            }
            x = 0;
        }
        System.out.println(String.valueOf(str));

        // Task 7
        System.out.println("Task 7");
        String str1 = "135";
        String str2 = "246";
        int idx = 0;
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);

        for (int num = 0; sb.length() > num; num++){
            while(true){
                if (idx+num == sb.length()) {
                    break;
                };
                if (sb.charAt(num) > sb.charAt(num+idx)){
                    sb.insert((num+idx), sb.charAt(num));
                    sb.insert(num, sb.charAt(num+idx+1));
                    sb.deleteCharAt((num+1));
                    sb.deleteCharAt((num+idx+1));
                }
                idx++;
            }
            idx = 0;
        }
        System.out.println("Данные строки - " + sb.toString());

        // Task 8
        System.out.println("Task 8");
        String strTask8 = "aabccddefgghiijjkk";
        int idx8 = 0;
        StringBuilder sb8 = new StringBuilder(strTask8);
        StringBuilder sbNew8 = new StringBuilder();

        for (int num = 0; sb8.length() > num; num++){
            while(true){
                if (idx8+num == sb8.length()) {
                    break;
                };

                if (sb8.charAt(num) == sb8.charAt(num+idx8) && idx8 != 0){
                    sbNew8.append(sb8.charAt(num));
                    break;
                }
                idx8++;
            }
            idx8 = 0;
        }
        System.out.println(sbNew8.toString());




    }
}