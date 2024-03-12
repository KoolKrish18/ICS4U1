public class Ex1_Java_Intro{
	public static void main(String[] args){
		//Example 1 - Focusing on Java Printing and Datatypes

		System.out.println();
		System.out.println("Welcome to Grade 12 Computer Science\n");

		System.out.println();
		System.out.println("Java's Big 5 Data Types\n");

		System.out.println("\t1) int - for whole numbers");
		  int age = 18;
      System.out.println("\n\t\tKrish is turning " + age + " years old next month!!\n\n");

		System.out.println("\t2) 'String' for words (notice the capital S)");
		  String month = "March";
      System.out.println("\n\t\tKrish is turning " + age + " years old in " + month + ".\n\n");

		System.out.println("\t3) 'char' for single characters (not needed often in Java)");
		  char yearsy = 'y';
      char yearsr = 'r';
      char yearss = 's';
      System.out.println("\n\t\tKrish is turning " + age + " " +  yearsy + yearsr + yearss + " old in " + month + ".\n\n");
        
		System.out.println("\t4) 'boolean' for true or false");
		  System.out.println("\n\t\tIs today Krish's Birthday?");
      boolean birthday = false;
      if (!birthday){
        System.out.println("\t\tToday is not Krish's Birthday.\n\n");
      }
      else{
        System.out.println("\t\tToday is Krish's Birthday.\n\n");
      }
		System.out.println("\t5) 'double' or 'float' for numbers that may contain decimals. \n\tI usually use doubles but floats are more memory efficient.");
      double current = 17.875;
      float future = 18.875f;
    System.out.println("\n\t\tKrish is " + current + " " + yearsy + yearsr + yearss + " old right now!");
    System.out.println("\t\tKrish will be " + future + " " + yearsy + yearsr + yearss + " old this time next year.\n\n");
		
	}
}