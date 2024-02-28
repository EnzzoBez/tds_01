public class Exat02{
    public static void main (String[] args){
        double soma = 0;
        double divisao = 0;
        for(int i = 0; i<args.length; i++){
            soma += Double.parseDouble(args[i]);

        }
        divisao = soma /args.length;
        System.out.println (divisao);
    }
}