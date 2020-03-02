package Handlers;

import java.util.Random;

public class RandomGen {
    private static Random random = new Random();
    public static final String[] Subjects = {"Norwegian", "Math", "History", "English", "Sports", "Geography"};
    public static final String[] names = {"Per", "Ola", "Kari", "Mari", "Lisa", "Kristan", "Jon", "Martin", "Bjørnar", "Hilde"};
    public static final String[] city = {"Kristiansand", "Grimstad", "Arendal", "Bø"};


    public static int getRandomNum() {
        int x = 0;
        return x = random.nextInt(6) + 1;

    }
    public static int getRandomNumOfStudents() {
        return random.nextInt(30) + 9;
    }

    public static int getRandomAge() {
        return random.nextInt(20) + 10;
    }

    public static String getRandomName() {
        int y = random.nextInt(9);
        return names[y];
    }
    public static String getRandomCity() {
        int c = random.nextInt(4);
        return city[c];
    }


}
