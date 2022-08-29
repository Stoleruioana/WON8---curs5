import java.util.Random;
public class Homework5 {
    public static void main(String[] args) {
    // comentariu

    int[] sirint = {2,5,6,7,8,9,200,3760, 301,333,101};

    System.out.println("Suma numerelor din sir este " + sumArray(sirint));

    System.out.println("In sir sunt " + oddNumbers(sirint)+ " numere impare");

    String str = greaterThanint(sirint, 100);
    String[] greater = str.split(" ");
    System.out.println ("NUmerele mai mari decat 100 sunt");
    for (String d: greater) {
        System.out.println(d);
    }

    int donationTarget = 10000;
    donation(donationTarget);

    int nodonations = 5;
    limitedDonations(donationTarget, nodonations);

    String phraseGiven = "A fost odata ca niciodata o printesa. Ea locuia intr-un castel imens, inconjurat de o gradina. In interiorul gradinii se gaseau toate speciile de trandafiri.";
    sentenceLine(phraseGiven);
    }

    // 1. functie suma elemente din sir initializat in main
    public static int sumArray(int arr[]) {
        int sum =0;
        for (int i=0; i<arr.length; i++) {
           sum = sum+arr[i];
        }
    return sum;
    }

    // 2. functie impare
    public static int oddNumbers(int arr[]){
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            if ((arr[i]%2)!=0) {
                sum++;
            }
        }
     return sum;
    }

    // 3. functie care returneaza sir numere mai mari decat nr dat
    public static String greaterThanint(int arr[], int s){
            String a = new String();
            for (int i=0; i<arr.length; i++){
            if (arr[i]>s) {
            a= a.concat(Integer.toString(arr[i]))+" ";
            }
        }
        return a;
    }

    // 4. functie target donations
    public static void donation(int givenTarget) {
       Random sum = new Random();
       int addsum = 0;
       while (addsum<givenTarget) {
           int newsum = sum.nextInt(givenTarget);
           addsum= addsum+newsum;
       }
       System.out.println ("The sum gathered is " + addsum + ", the target was " + givenTarget);
    }

    // 5. functie target donations and no donations
    public static void limitedDonations(int givenTarget, int nodonations) {
        Random sum = new Random ();
        int addsum = 0;
        int i = 1;
        while ((addsum<givenTarget) && (i<nodonations)) {
            int newsum = sum.nextInt(givenTarget);
            addsum = addsum + newsum;
            i++;
        }
        if (addsum<givenTarget) {
            System.out.println ("Given target not reached, total sum is " + addsum);
        } else {
            System.out.println ("Given target achieved, total sum is "+ addsum);
        }
    }
    public static void sentenceLine (String phrase) {
        String[] sentences = phrase.split("[.]");
        for (String s: sentences) {
            System.out.println(s + ".");

        }
    }
}
