public class Main {
    public static void main(String[] args){
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + " Dillan's new string";
        System.out.println(myString);
        myString = myString + " \u00a9 2021"; // unicode character added
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("number string, " + numberString);

    }
}
