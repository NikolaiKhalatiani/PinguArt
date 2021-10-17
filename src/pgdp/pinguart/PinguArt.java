package pgdp.pinguart;

import pgdp.MiniJava;

public class PinguArt extends MiniJava {

    public static void main(String[] args) {
        int x = 0;
        int userinput1 = readInt("Please enter a Pingu Art number:");
        int userinput2 = readInt("Please enter a Pingu Art number:");
        int userinput3 = readInt("Please enter a Pingu Art number:");
        int userinput4 = readInt("Please enter a Pingu Art number:");
        int userinput5 = readInt("Please enter a Pingu Art number:");
        int userinput6 = readInt("Please enter a Pingu Art number:");
        int userinput7 = readInt("Please enter a Pingu Art number:");
        int userinput8 = readInt("Please enter a Pingu Art number:");
        write("+---[PinguArt]---+");
        writeConsole("|");
        int count = 1;
        while (count <= 8) {
            if (count == 1) x = userinput1;
            else if (count == 2) x = userinput2;
            else if (count == 3) x = userinput3;
            else if (count == 4) x = userinput4;
            else if (count == 5) x = userinput5;
            else if (count == 6) x = userinput6;
            else if (count == 7) x = userinput7;
            else if (count == 8) x = userinput8;
            count++;
            while (x > 0) {
                int repeat = 8;
                while (repeat != 0) {
                    int digit = x % 10;
                    x = x / 10;
                    if (digit == 1) writeConsole("-");
                    else if (digit == 2) writeConsole("~");
                    else if (digit == 3) writeConsole("P");
                    else writeConsole(" ");
                    repeat--;
                }
                if (count % 2 == 1) {
                    writeConsole("|");
                    writeLineConsole();
                    if ((count - 2) != 7) writeConsole("|");
                }
            }
        }
        write("+----------------+");
    }
}
