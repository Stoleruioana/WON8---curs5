public class StringExercise {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String s = "Abcdef";
        String str = new String("abc");
        String strr = "ab" + "c";
        System.out.println(s == str);

        //length of a string
        System.out.println(s.length());
        // part of a string
        String substring = s.substring(1);
        System.out.println(substring);

        // first 5 char
        System.out.println(s.substring(0, 5));

        // litere mari
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        // clean extra spaces
        String extraSpaces = "Rain         ";
        System.out.println(extraSpaces.trim());

        String fullName = "Ioan Pop    Mihai";
        String[] split = fullName.split(" +");
        for (String name : split) {
            System.out.println(name);
        }
        System.out.println(s.indexOf("c"));
        System.out.println(s.lastIndexOf("r"));

        System.out.println(s.contains("ab"));
        System.out.println(s.replace("ab", "***"));
        System.out.println(s.replaceAll("[A-Z]", "0"));
        String toReplace= "Al3x@ndru";
        System.out.println(toReplace.replaceAll("[0-9", "*"));

        String format = String.format("Ana", 14, 5, "Marcel");
        System.out.println(format);

        String number = "10a";
        if (number.matches("[0-9]")) {
        int i = Integer.parseInt(number);
        System.out.println(i);
        }

        int i = 105;
        String numberFromInt = String.valueOf(i);
        System.out.println(numberFromInt);

        String isNull = null;
        if (isNull==null && isNull.length()>0){
            System.out.println ("String exists and is not empty");
        }

    }
}