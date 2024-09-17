import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        String choice = choiceMadLibs();
       if (choice.equals("1")) {
        doMadlibIntro1();
        doMadlib1();
       } else{
        doMadlibIntro2();
        doMadlib2();
       }
        System.out.println();
    }
    
    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 
    
     public void printGreeting(String name){
        System.out.println('\n');
        System.out.println("Hello " + name);
        
    }

    public String choiceMadLibs(){
        System.out.println("Please select your choice.");
        Scanner nch = new Scanner(System.in);
        String choice = nch.nextLine();
        return choice;
    }

    public void printInstructions() {
        System.out.println("in order to play you are required to do the following");
        System.out.println("Select one of the 2 options by typng either 1 or 2");
        System.out.println("-Read the sentance and fill in the blanks");
        System.out.println("-Make sure the word you enter fits the criteria");
        System.out.println("-Enjoy! \n");
    }
    
    public String getUserName() {
        System.out.println("Please type in a name in the input box below.");
        Scanner zxz = new Scanner(System.in);
        String yu = zxz.nextLine();
        return yu;
    }
    /* Add a begin button and make headings and stuff color and bold */
    
    public void doMadlib1(){
        Scanner wordz = new Scanner(System.in);
        
        System.out.println("Please type in a adjective.");
        String adj1 = wordz.nextLine();

        System.out.println("Please type in a adjective.");
        String adj2 = wordz.nextLine();

        System.out.println("Please type in a adjective.");
        String adj3 = wordz.nextLine();

        System.out.println("Please type in a adjective.");
        String adj4 = wordz.nextLine();

        System.out.println("Please type in a noun.");
        String noun1 = wordz.nextLine();

        System.out.println("Please type in a noun.");
        String noun2 = wordz.nextLine();

        System.out.println("Please type in a noun.");
        String noun3 = wordz.nextLine();

        System.out.println("Please type in a plural noun.");
        String plnoun1 = wordz.nextLine();

        System.out.println("Please type in a number.");
        String numb1  = wordz.nextLine();

        System.out.println("Please type in a number.");
        String numb2 = wordz.nextLine();

        System.out.println("Please type in a food item.");
        String food1 = wordz.nextLine();

        System.out.println("Please type in a food item.");
        String food2 = wordz.nextLine();

        System.out.println("Please type in a nationality.");
        String nat1 = wordz.nextLine();

        System.out.println("Please type in a shape.");
        String shape1 = wordz.nextLine();

        System.out.println("Please type in a person.");
        String per1 = wordz.nextLine();
        
        System.out.println("Pizza was invented by a " + adj2 + " " + nat1);
        System.out.println("Chef named " + per1 + " To make a pizza you need");
        System.out.println("you need to take lumps of " + noun3 + " and make a thin round ");
        System.out.println(adj1 +" " + noun1 + " then you cover it with");
        System.out.println(adj4 + " sauce, " + adj3 + " cheese, and fresh");
        System.out.println(" chopped " + plnoun1 + ". Next you have to bake it in a very ");
        System.out.println("hot " + noun2 + ". When it is done, cut it into" + numb2);
        System.out.println(shape1 + ". Some kids like " + food2 + " the best");
        System.out.println("but my favorite is the "+ food1 + " pizza. If I could, I");
        System.out.println("would eat pizza "+ numb1 + " times a day!");
    }



    public void doMadlibIntro1(){
        System.out.println("/$$$$$$$  /$$                                      /$$$$$$   /$$                                  \r\n" + //
                        "| $$__  $$|__/                                     /$$__  $$ | $$                                  \r\n" + //
                        "| $$  \\ $$ /$$ /$$$$$$$$ /$$$$$$$$  /$$$$$$       | $$  \\__//$$$$$$    /$$$$$$   /$$$$$$  /$$   /$$\r\n" + //
                        "| $$$$$$$/| $$|____ /$$/|____ /$$/ |____  $$      |  $$$$$$|_  $$_/   /$$__  $$ /$$__  $$| $$  | $$\r\n" + //
                        "| $$____/ | $$   /$$$$/    /$$$$/   /$$$$$$$       \\____  $$ | $$    | $$  \\ $$| $$  \\__/| $$  | $$\r\n" + //
                        "| $$      | $$  /$$__/    /$$__/   /$$__  $$       /$$  \\ $$ | $$ /$$| $$  | $$| $$      | $$  | $$\r\n" + //
                        "| $$      | $$ /$$$$$$$$ /$$$$$$$$|  $$$$$$$      |  $$$$$$/ |  $$$$/|  $$$$$$/| $$      |  $$$$$$$\r\n" + //
                        "|__/      |__/|________/|________/ \\_______/       \\______/   \\___/   \\______/ |__/       \\____  $$\r\n" + //
                        "                                                                                          /$$  | $$\r\n" + //
                        "                                                                                         |  $$$$$$/\r\n" + //
                        "                                                                                          \\______/ ");
    }

   public void doMadlibIntro2(){
    System.out.println('\n');
    System.out.println('\n');
    System.out.println("There is no option 2. Your just gonna have to do option 1");
    System.out.println("/$$$$$$$  /$$                                      /$$$$$$   /$$                                  \r\n" + //
                        "| $$__  $$|__/                                     /$$__  $$ | $$                                  \r\n" + //
                        "| $$  \\ $$ /$$ /$$$$$$$$ /$$$$$$$$  /$$$$$$       | $$  \\__//$$$$$$    /$$$$$$   /$$$$$$  /$$   /$$\r\n" + //
                        "| $$$$$$$/| $$|____ /$$/|____ /$$/ |____  $$      |  $$$$$$|_  $$_/   /$$__  $$ /$$__  $$| $$  | $$\r\n" + //
                        "| $$____/ | $$   /$$$$/    /$$$$/   /$$$$$$$       \\____  $$ | $$    | $$  \\ $$| $$  \\__/| $$  | $$\r\n" + //
                        "| $$      | $$  /$$__/    /$$__/   /$$__  $$       /$$  \\ $$ | $$ /$$| $$  | $$| $$      | $$  | $$\r\n" + //
                        "| $$      | $$ /$$$$$$$$ /$$$$$$$$|  $$$$$$$      |  $$$$$$/ |  $$$$/|  $$$$$$/| $$      |  $$$$$$$\r\n" + //
                        "|__/      |__/|________/|________/ \\_______/       \\______/   \\___/   \\______/ |__/       \\____  $$\r\n" + //
                        "                                                                                          /$$  | $$\r\n" + //
                        "                                                                                         |  $$$$$$/\r\n" + //
                        "                                                                                          \\______/ ");
   }

   public void doMadlib2(){
    Scanner wordz = new Scanner(System.in);
    
    System.out.println("Please type in a adjective.");
    String adj1 = wordz.nextLine();

    System.out.println("Please type in a adjective.");
    String adj2 = wordz.nextLine();

    System.out.println("Please type in a adjective.");
    String adj3 = wordz.nextLine();

    System.out.println("Please type in a adjective.");
    String adj4 = wordz.nextLine();

    System.out.println("Please type in a noun.");
    String noun1 = wordz.nextLine();

    System.out.println("Please type in a noun.");
    String noun2 = wordz.nextLine();

    System.out.println("Please type in a noun.");
    String noun3 = wordz.nextLine();

    System.out.println("Please type in a plural noun.");
    String plnoun1 = wordz.nextLine();

    System.out.println("Please type in a number.");
    String numb1  = wordz.nextLine();

    System.out.println("Please type in a number.");
    String numb2 = wordz.nextLine();

    System.out.println("Please type in a food item.");
    String food1 = wordz.nextLine();

    System.out.println("Please type in a food item.");
    String food2 = wordz.nextLine();

    System.out.println("Please type in a nationality.");
    String nat1 = wordz.nextLine();

    System.out.println("Please type in a shape.");
    String shape1 = wordz.nextLine();

    System.out.println("Please type in a person.");
    String per1 = wordz.nextLine();
    
    System.out.println("Pizza was invented by a " + adj2 + " " + nat1);
    System.out.println("Chef named " + per1 + " To make a pizza you need");
    System.out.println("you need to take lumps of " + noun3 + " and make a thin round ");
    System.out.println(adj1 +" " + noun1 + " then you cover it with");
    System.out.println(adj4 + " sauce, " + adj3 + " cheese, and fresh");
    System.out.println(" chopped " + plnoun1 + ". Next you have to bake it in a very ");
    System.out.println("hot " + noun2 + ". When it is done, cut it into" + numb2);
    System.out.println(shape1 + ". Some kids like " + food2 + " the best");
    System.out.println("but my favorite is the "+ food1 + " pizza. If I could, I");
    System.out.println("would eat pizza "+ numb1 + " times a day!");
}







    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
