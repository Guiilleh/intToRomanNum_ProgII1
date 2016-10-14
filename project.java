import java.util.Scanner;

public class project {

    public static void main(String[] args) {
	int optn;
	do {
	    System.out.println("Integer to Roman Numeral");
	    System.out.println("1.- Exact number");
	    System.out.println("2.- All numbers");
	    System.out.println("3.- About the developers");
	    System.out.println("0.- Exit");
	    optn = validInt();
	    switch(optn) {
		case 1:
		    System.out.println("\nEnter the number to convert to Roman Numeral:");
		    System.out.println(intToRoman(oneToThreeThousand()) + "\n");
		    break;
		case 2:
		    System.out.println("");
		    tryEmAll();
		    System.out.println("");
		    break;
		case 3:
		    System.out.println("\nAlexandra S\u00E1nchez. V-26.239.664");
		    System.out.println("Guillermo Fern\u00E1ndez. V-23.751.818\n");
		    break;
		case 0:
		    System.out.println("Bye");
		    break;
		default:
		    System.out.println("Wrong option, try again...\n");
	    }
	} while(optn != 0);
    }

    public static void tryEmAll() {	// prints roman numerals from 1 to 3000
	for(int i = 1; i <= 3000; i++) {
	    System.out.println(i + " = " + intToRoman(i));
	}
    }

    public static int oneToThreeThousand() {	// validates integer between 1 and 3000
	int x;
	do {
	    x = validInt();
	} while(x < 1 || x > 3000);
	return x;
    }

    public static int validInt() {  // validates user input to int
	Scanner reader = new Scanner(System.in);
	int x;
	while(!reader.hasNextInt()) {
	    System.out.println("Wrong input");
	    reader.next();
	}
	x = reader.nextInt();
	return x;
    }

    public static String intToRoman(int source) {   // transforms source(int) to roman numeral
	int[] ints = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	String[] strs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	StringBuilder appendix = new StringBuilder();
	for(int i = 0; i <= 12; i++) {
	    while(source >= ints[i]) {
		appendix.append(strs[i]);
		source -= ints[i];
	    }
	}
	return appendix.toString();
    }
}
