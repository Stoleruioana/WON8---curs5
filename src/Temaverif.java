public class Temaverif {
    public static void main(String[] args) {
        String[] names={"Ioan", "Ana", "MAria"};

    }
    public static void printAllStartingWithA(String[] names){
        for (String name: names) {
            if (name.startsWith("A")){
                System.out.println(name);
            }
        }

    }
}
