package machine;

import java.util.Scanner;

class CoffeeMachine2021 {
    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;
    int money;

    enum Status{
        BUY, FILL, TAKE, REMAINING, EXIT
    }
    
    enum Coffee{
        ESPRESSO(250, 0, 16, 1, 4), LATTE(350, 75, 20, 1, 7), CAPUCCINO(200, 100, 12, 1, 6);
        
        int water;
        int milk;
        int coffeeBeans;
        int disposableCups;
        int money;
        
        Coffee(int a, int b, int c, int d, int e) {
            water = a;
            milk = b;
            coffeeBeans = c;
            disposableCups = d;
            money = e;
        }
        
        int getWater(){
            return water;
        }
        
        int getMilk(){
            return milk;
        }
        
        int getCoffeeBeans(){
            return coffeeBeans;
        }
        
        int getDisposableCups(){
            return disposableCups;
        }
        
        int getMoney(){
            return money;
        }
    }
    
    public CoffeeMachine2021 (int water, int milk, int coffeeBeans, int disposableCups, int money){
        this.water =  water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }
    
    public void chooseAction(){
        while(true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
        
            Scanner scanner = new Scanner(System.in);
            Status command = Status.valueOf(scanner.next().toUpperCase());

            switch (command) {
                case BUY:
                    buy();
                    break;
                    
                case FILL:
                    fill();
                    break;
                    
                case TAKE:
                    take();
                    break;
                    
                case REMAINING:
                    remaining();
                    break;
                    
                case EXIT:
                    return;
                    
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
    
    public void buy(){
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int index;
        
        try {
            if (input.equals("back")){
                return;
            } else {
                index = Integer.parseInt(input);
            }
        }
          catch(Exception e) {
            System.out.println("Invalid input! Choose from above next time.\n");
            return;
        }
        
        if (index < 1 || index > 3){
            System.out.println("Invalid input! You can choose between 1 and 3.\n");
        } else {
            Coffee asked = Coffee.values()[index - 1];
        
            if (water >= asked.getWater() && milk >= asked.getMilk() && coffeeBeans >= asked.getCoffeeBeans() && disposableCups >= asked.getDisposableCups()) {
                System.out.println("\nI have enough resources, making you a coffee!\n");
                water -= asked.getWater();
                milk -= asked.getMilk();
                coffeeBeans -= asked.getCoffeeBeans();
                disposableCups -= asked.getDisposableCups();
                money += asked.getMoney();
            } else if (water < asked.getWater()) {
                System.out.println("Sorry, not enough water!\n");
            } else if (milk < asked.getMilk()) {
                    System.out.println("Sorry, not enough milk!\n");
            } else if (coffeeBeans < asked.getCoffeeBeans()) {
                System.out.println("Sorry, not enough coffee beans!\n");
            } else {
                System.out.println("Sorry, not enough disposable cup!\n");
            }
        }
    }
    
    public void fill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWrite how many ml of water do you want to add:");
        int plusWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int plusMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int plusBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int plusCups = scanner.nextInt();
        System.out.println();
        
        water += plusWater;
        milk += plusMilk;
        coffeeBeans += plusBeans;
        disposableCups += plusCups;
    }
    
    public void take(){
        System.out.println("\nI gave you " + "$" + money + "\n");
        money = 0;
    }
    
    public void remaining(){
        System.out.println("\nThe coffee machine has\n" + water + " of water\n" + milk + " of milk\n" + coffeeBeans + " of coffee beans\n" + disposableCups + " of disposable cups\n" + money + " of money\n");
    }
}

public class CoffeeMachine{
    public static void main(String[] args) {
        CoffeeMachine2021 myCoffeeMachine = new CoffeeMachine2021(400, 540, 120, 9, 550);
        myCoffeeMachine.chooseAction();
    }
}
