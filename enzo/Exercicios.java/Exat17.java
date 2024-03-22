public class Exat17 {
    public static void main(String[] args) {
        String[] strings = {"gabi", "coisa", "arara", "area", "astronauta "};
        
        for (String str : strings) {
            String novaString = substituirLetraA(str);
            System.out.println("Nova string: " + novaString);
        }
    }
    
    public static String substituirLetraA(String str) {
        String novaString = str.replaceAll("a", "@");
        return novaString;
    }
}