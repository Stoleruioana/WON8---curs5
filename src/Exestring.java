import java.util.Random;
public class Exestring {
    public static void main(String[] args) {
        String[] Nume = {"Ana", "Bogdan", "ardei", "animal", "Anastasia", "Marcel", "Pop"};
        primaLitera(Nume);
        System.out.println("Cuvinte care contin substring");
        contineSubstr(Nume);
        System.out.println("Scriere tot al doilea element. incepand de la primul");
        printSecond(Nume);
        System.out.println("Scriere doua elemente pe linie");
        twoElements(Nume);
        System.out.println("Inlocuire");
        replacement(Nume);
        System.out.println("Tiparire primele trei litere");
        firstThree(Nume);
        System.out.println("Caracter random");
        randomChar(Nume);
        System.out.println("nume cu initiala");
        String Numecomplet = "Maria Ioana Popa";
        initiala(Numecomplet);
        System.out.println(Numecomplet.replaceAll("[A-Z, a-z]", "*"));
        System.out.println("De cate ori apare caracterul in String");
        char lit = 'a';
        noTimesCharStr(Numecomplet, lit);
        String cuvant = "Abracadabra 999";
        redactStr(cuvant);
        String verificare = "Ana are mere albastre";
        if (strArray(verificare) == true) {
            System.out.println (verificare + " Este sir");
        }else {
            System.out.println (verificare + " Nu este sir");
        }
        String[] nou = strToArray(verificare);
        for (String name:nou) {
            System.out.println(name);
        }
    }

    //metoda cuvinte care incep cu a
    public static void primaLitera(String[] a){
        for (String s : a) {
            if ((s.startsWith("a")) || (s.startsWith("A"))) {
                System.out.println(s);
            }
        }
        }

    //metoda cuvinte care contin ar

    public static void contineSubstr(String[] b) {
        for (String s: b) {
            if (s.contains("ar")) {
                System.out.println(s);
            }
        }
    }

    //metoda al doilea element din sir
    public static void printSecond(String[] c) {
        int i =0;
        int l=c.length;
        do {
            System.out.println(c[i]);
            i+=2;
        } while (i < l) ;
    }

    // metoda doua elemente pe linie
    public static void twoElements(String[] d) {
        int i=0;
        int arrayL= d.length;
        if (arrayL%2==0) {
            while (i < (arrayL - 1)) {
                System.out.println(d[i] + " " + d[i + 1]);
                i += 2;
            }
        } else {
            while (i < (arrayL-2)) {
                System.out.println(d[i] + " " + d[i + 1]);
                i += 2;
            }
            System.out.println(d[(arrayL-1)]);
        }
    }
    // inlocuire litera cu *
    public static void replacement(String[] e){
        for (String name: e) {
            System.out.println(name.replaceAll("r", "*"));
        }
    }

    // primele 3 caractere
    private static void firstThree(String[] f) {
        for (String name: f) {
            System.out.println(name.substring(0,3));
        }
    }
    public static void randomChar(String[] g) {
        String str = "";
        for (String name: g) {
            str= str.concat(name);
        }
        System.out.println(str);
        int l = str.length();
        Random rand = new Random();
        int c = rand.nextInt(l);
        System.out.print("Pe pozitia "+c+" este litera ");
        System.out.print(str.charAt(c));
    }
    public static void initiala(String name) {
        String[] arrname = name.split(" ");
        if (arrname.length==3) {
            char init = arrname[1].charAt(0);
            System.out.println(arrname[0] +" "+ init + "."+ arrname[2]);
        }
    }
    // numaram caracterul dintr-un string

    public static Integer noTimesCharStr(String word, char l){
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i)==l) {
                count++;
            }
        }
        System.out.println("litera "+l+" apare de "+count+ " ori");
        return count;
    }



    //redact a given string
    public static void redactStr(String word){
        System.out.println(word);
        System.out.println(word.replaceAll(".","*"));
    }
    public static Boolean strArray(String word) {
        int spatiu = noTimesCharStr(word, ' ');
        int virgula= noTimesCharStr(word, ',');
        int punct= noTimesCharStr(word, '.');
        int semi= noTimesCharStr(word, ';');
        boolean sir = false;
        if ((spatiu!=0)||(virgula!=0)||(punct!=0)||(semi!=0)) {
            sir = true;
        }
        return sir;
    }
    public static String[] strToArray(String words){
        String[] split= words.split(" ");
        return split;
    }
}

