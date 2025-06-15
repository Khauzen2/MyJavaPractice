import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        String[] fruits = { "banana", "Apple", "Orange", "Pier", "Peace" };
        String[] cars = new String[4];
        String[] people = new String[4];
        String[] sports = new String[4];
        String[] provinces = new String[9];
        String[] seasons = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("My first fruit choice is " + fruits[0]);
        System.out.println("My second fruit choice is " + fruits[1]);
        System.out.println("My third fruit choice is " + fruits[2]);
        System.out.println("My fourth fruit choice is " + fruits[3]);
        System.out.println("My fith fruit choice is " + fruits[4]);

        // cars input output
        System.out.println("Enter the first car choice");
        cars[0] = input.nextLine();
        System.out.println("Enter second car choice");
        cars[1] = input.nextLine();
        System.out.println("Enter third car choice");
        cars[2] = input.nextLine();
        System.out.println("Enter fourth car choice");
        cars[3] = input.nextLine();

        // output
        System.out.println("Your first car choice is " + cars[0]);
        System.out.println("Your second car choice is " + cars[1]);
        System.out.println("Your third car choice is " + cars[2]);
        System.out.println("Your fourth car choice is " + cars[3]);

        // people input output
        System.out.println("Enter first person");
        people[0] = input.nextLine();
        System.out.println("Enter second person");
        people[1] = input.nextLine();
        System.out.println("Enter third person");
        people[2] = input.nextLine();
        System.out.println("Enter fourth person");
        people[3] = input.nextLine();
        System.out.println("The first person is " + people[0]);
        System.out.println("The second person is " + people[1]);
        System.out.println("The third person is " + people[2]);
        System.out.println("The fourth person is " + people[3]);

        // Sports input output
        System.out.println("Enter first sports");
        sports[0] = input.nextLine();
        System.out.println("Enter second sports");
        sports[1] = input.nextLine();
        System.out.println("Enter third sports");
        sports[2] = input.nextLine();
        System.out.println("Enter fourth sports");
        sports[3] = input.nextLine();

        // output
        System.out.println("The first sports is " + sports[0]);
        System.out.println("The second sports is " + sports[1]);
        System.out.println("The third spots is " + sports[2]);
        System.out.println("The fourth sports is " + sports[3]);

        // Province input output
        System.out.println("Enter first province ");
        provinces[0] = input.nextLine();
        System.out.println("Enter second province ");
        provinces[1] = input.nextLine();
        System.out.println("Enter third province ");
        provinces[2] = input.nextLine();
        System.out.println("Enter fourth province ");
        provinces[3] = input.nextLine();
        System.out.println("Enter fith province");
        provinces[4] = input.nextLine();
        System.out.println("Enter sixth province");
        provinces[5] = input.nextLine();
        System.out.println("Enter seventh province");
        provinces[6] = input.nextLine();
        System.out.println("Enter eight province");
        provinces[7] = input.nextLine();
        System.out.println("Enter nineth province");
        provinces[8] = input.nextLine();

        // output
        System.out.println("First province is " + provinces[0]);
        System.out.println("Second province is " + provinces[1]);
        System.out.println("Third province is " + provinces[2]);
        System.out.println("Fourth province is " + provinces[3]);
        System.out.println("Fith province is " + provinces[4]);
        System.out.println("Sixth province is " + provinces[5]);
        System.out.println("Seventh province is " + provinces[6]);
        System.out.println("Eith province is " + provinces[7]);
        System.out.println("Nineth province is " + provinces[8]);

        // season input output
        System.out.println("Enter first season");
        seasons[0] = input.nextLine();
        System.out.println("Enter second season");
        seasons[1] = input.nextLine();
        System.out.println("Enter third season");
        seasons[2] = input.nextLine();
        System.out.println("Enter fouth season");
        seasons[3] = input.nextLine();

        // output
        System.out.println("First season is " + seasons[0]);
        System.out.println("Second season is " + seasons[1]);
        System.out.println("Third season is " + seasons[2]);
        System.out.println("Third season is " + seasons[3]);
    }
}