import gcdNum.*;
import lcmNum.*;

public class Main {
    public static void main(String[] args) {
        gcd g = new gcd();
        g.show();

        lcm l = new lcm();
        l.show();
    }
}
//write a java program to implement packages where package 1 being calculates gcd and package 2 lcm of two numbers write the class wich import these two packages
//Create a public enum week day with constants for monday tuesday untill sunday the enum should have instance method boolean isweekday and an instance method isholiday the isholiday method should method return oppositer of isweekday thod
//write a program which demonstrates ths enum can be used, which has a mehod which takes weekday as an argument and prints the messege the weekday is holiday of not.
//The main method loops over all values in the weekday enum and sends them as argument to the method
//write a java program which has two packages named square and cube. Aclass which imports sqaure and cube generates a 10 random number between one to hundread and calsulates square and cube of the numbers generated, class also inherites an abstract class which has data member number and a method random