package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 19;
        String name = "Stalbek ";
        int temperature = 45;
        if ((temperature > 30 || temperature < -20) && (age > 45 || age < 20)) {
            System.out.println(name + "Не выходит гулять");
        } else if ((temperature > 0 || temperature < 28) && (age > 20)) {
            System.out.println(name + "Не выходит гулять");
        } else if ((temperature> -10 || temperature < 25) && (age < 45)) {
                System.out.println(name + "Не выходит гулять");

        } else{

            System.out.println("идем в гости к другу");
        }


    }
}
