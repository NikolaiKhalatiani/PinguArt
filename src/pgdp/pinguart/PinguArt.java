package pgdp.pinguart;

import pgdp.MiniJava;

public class PinguArt extends MiniJava {

    public static void main(String[] args) {
        /* This can be vastly improved if arrays are used, but we have to show here that
         * it is possible without arrays as well.
         */
        int x = 0;
        // allow the user to input eight Pingu-Art numbers
        int userInput1 = readInt("Please enter a Pingu Art number:");
        int userInput2 = readInt("Please enter a Pingu Art number:");
        int userInput3 = readInt("Please enter a Pingu Art number:");
        int userInput4 = readInt("Please enter a Pingu Art number:");
        int userInput5 = readInt("Please enter a Pingu Art number:");
        int userInput6 = readInt("Please enter a Pingu Art number:");
        int userInput7 = readInt("Please enter a Pingu Art number:");
        int userInput8 = readInt("Please enter a Pingu Art number:");
        System.out.println("+---[PinguArt]---+"); // print the Pingu-Art header
        int count = 1;
        while (count <= 8) {
            if (count % 2 == 1) System.out.print("|");
            if (count == 1) x = userInput1;
            else if (count == 2) x = userInput2;
            else if (count == 3) x = userInput3;
            else if (count == 4) x = userInput4;
            else if (count == 5) x = userInput5;
            else if (count == 6) x = userInput6;
            else if (count == 7) x = userInput7;
            else if (count == 8) x = userInput8;
            int digitPos = 1;
            while (digitPos <= 8) {
                int digit = x % 10;
                if (digit == 0) System.out.print(" ");
                else if (digit == 1) System.out.print("-");
                else if (digit == 2) System.out.print("~");
                else if (digit == 3) System.out.print("P");
                x = x / 10;
                digitPos++;
            }
            if (count % 2 == 0) System.out.println("|");
            count++;
        }
        System.out.println("+----------------+");
    }
}


