import java.util.Scanner;

public class AsteriskGenerator {

public static void main(String[] args){

AsteriskGenerator asteriskGenerator = new AsteriskGenerator();

int numberToRead;
Scanner input = new Scanner (System.in);
for (int i = 0; i < 5; i ++){

System.out.print("Please, Enter a number between 1 - 30 ");
numberToRead = input.nextInt();
asteriskGenerator();

}

}

/**
* Print to the screen the number of asterisks requested
* //print Asterisks
* @param numAsterisk
*/

public static void asteriskGenerator (){

for (int numAsterisk = 0; numAsterisk <= 30;numAsterisk++){
while (numAsterisk != 0)

System.out.printf("*", numAsterisk);
}

}
}