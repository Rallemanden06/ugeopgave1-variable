public class Main {
    void main() {

//opgave 1
        /*
        double[] price = {25.50,15.00,30.00};
        double tax = 25.0;

        double sum = price[0] + price[1] + price[2];
        double withTax = sum + (sum * tax / 100);

        System.out.println("Total pris unden moms: " + sum + " kr.");
        System.out.println("Total pris med moms: " + withTax + " kr.");
        */

//opgave 2
        /*
        double food = 450.0;
        double drink = 120.0;
        double tip = 50;
        int numberOfPeople = 4;

        double grandTotal = food + drink + tip;
        double costPerPerson = grandTotal/numberOfPeople;

        System.out.println("Beløbet pr. person: " + costPerPerson + " kr.");
        */

//opgave 3
        /*
        double originalPrice = 300;
        double discountProcent = 20;
        double taxProcent = 25;

        double discount = originalPrice - (originalPrice * discountProcent) / 100;
        double tax = discount + (discount * taxProcent) / 100;

        System.out.println("Original pris: " + originalPrice + " kr.");
        System.out.println("Rabat pris: " + discount + " kr.");
        System.out.println("Afsluttene pris med moms og rabat: " + tax + " kr.");
        */

//opgave 4
        /*
        int guest = 15;
        int cupcakes = 40;

        int cupcakesPerPerson = cupcakes / guest;
        int cupcakesLeft = cupcakes % guest;

        System.out.println("Each guest gets " + cupcakesPerPerson + " cupcakes");
        System.out.println(cupcakesLeft + " cupcakes left over");
        */

//opgave 5
        /*
        StringBuilder sb = new StringBuilder();
        String name = "Anna";
        int age = 25;
        sb.append("Hello, ");
        sb.append(name);
        sb.append("!");
        sb.append(" You are ");
        sb.append(age);
        sb.append(" years old");

        System.out.println(sb.toString());
        */

//opgave 6
        /*
        int score = 100;

        System.out.println("Score: " + score);

        score += 50;

        System.out.println("Score: " + score);

        score += 25;

        System.out.println("Score: " + score);
        */

//opgave 7
        /*
        int pris = 100;

        System.out.println("Health: " + pris);

        pris -= 15;

        System.out.println("Health: " + pris);

        pris -= 20;

        System.out.println("Health: " + pris);
        */

//opgave 8
        /*
        double price = 50.0;

        System.out.println("Pris: " + price + " kr.");

        price *= 2;

        System.out.println("Pris: " + price + " kr.");
        */

//opgave 9
        /*
        int counter = 10;

        System.out.println("Tæller: " + counter);

        counter++;

        System.out.println("Tæller: " + counter);

        counter--;

        System.out.println("Tæller: " + counter);
        */

//opgave 10
        /*
        int number = 10;
        number += 5;
        System.out.println("Tal: " + number);
        number -= 3;
        System.out.println("Tal: " + number);
        number++;
        System.out.println("Tal: " + number);
        number--;
        System.out.println("Tal: " + number);
        */

//opgave 11
        /*
        String productName = "laptop";
        double productPrice = 7999.99;
        boolean inStock = true;
        int itemQuantity = 15;
        double discountPercent = 10.0;
        String catagory = "Electronics";
        */

//opgave 12
        /*
        String studentName = "Anna";
        int testScore = 85;
        int homeworkScore = 92;
        double finalGrade = 88.5;
        boolean passedCourse = true;
         */

//opgave 13
        /*
        String guestName = "Peter Hansen";
        int roomNumber = 204;
        int numberOfNights = 3;
        double pricePerNight = 899.00;
        boolean hasBreakfast = true;
        double totalPrice = 2697.00;
        */

//opgave 14
        /*
        int stepsToday = 8547;
        int stepGoal = 10000;
        double distanceKm = 6.2;
        int caloriesBurned = 420;
        boolean goalReached = false;
        */

//opgave 15
        /*
        String bookTitle = "Think Java 1st Edition";
        String authorName = "Allen B. Downey";
        String isbn = "978-1492072508";
        int numberOfPages = 249;
        boolean isAvailable = true;
        String currentBorrower = "John Book";
        String dueDate = "2026-30-09";
        double fineAmount = 100.0;
        boolean isBestseller = true;
        double rating = 3.9;
        */
    }
}