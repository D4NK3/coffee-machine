# coffee-machine

The coffee-machine project aims to provide a program which simulates the basic operation logic of a coffee machine. 
This project was made for personal practice and fun.

## Table of Contents
- [Installation and Running](#installation-and-running)
- [Usage](#usage)
- [Troubleshooting](#troubleshooting)
- [License](#license)

## Installation and Running
- Installation<br/>
You first need to clone this repository. After that you need to compile the `CoffeeMachine.java` file. If you have [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) installed on your computer then use the `javac CoffeeMachine.java` command to compile the program.

- Running<br/>
After compilation you can run your program using the `java CoffeeMachine.class` command.

## Usage
As previously mentioned, this program aims to simulate the logic of a coffee machine. You can `buy`, `fill it`, `take the money` or `turn off`. The coffee machine can make 3 different coffees and each of them has different required ingredients and costs.

- **Coffees** (water, milk, coffee beans, disposable cups, price): 
  - Espresso (250, 0, 16, 1, 4)
  - Latte (350, 75, 20, 1, 7)
  - Cappucino (200, 100, 12, 1, 6)

- **Buy**: You can buy 3 different coffees (Espresso, Latte, Cappucino). After starting the program use the `buy` command to go to the buying section. After that you need to choose from the coffees. Your options are `1 - Espresso`, `2 - Latte`, `3 - Cappucino`. Use the right number.

- **Fill**: You can refill the coffee machine if it has no more of some of the ingredients. Use the `fill` command. After that you can specify how much `water` / `milk` / `coffee beans` / `disposable cups` you want to add. 

- **Take**: You can take the money out of the coffee machine with the `take` command.

- **Remaining**: You can check how much ingredients are left in the coffee machine with the `remaining` command. 

- **Exit**: You can turn off the coffee machine with the `exit` command. 

Note: If you exit, then you can restart the coffee machine from the terminal with the `java CoffeeMachine.class` command.

## Troubleshooting

- If you don't have Oracle JDK installed on your computer, then you can [download](https://www.oracle.com/java/technologies/javase-downloads.html) it.
- If you can't run the program with the `java CoffeeMachine.class` command, then it is possibly that you need to specify the exact location of your .class file. You can do it with the -cp option, which stands for Class Path.

## License
The program and associated documentation in this repo are released under the [MIT License](https://en.wikipedia.org/wiki/MIT_License).<br/>
When you contribute to this repository you are doing so under the above license.
