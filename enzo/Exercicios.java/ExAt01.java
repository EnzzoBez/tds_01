public class ExAt01{
    public static void main (String[] args){
        double soma = 0;
        for(int  i=0; i<args.length; i++){
            soma += Double.parseDouble(args[i]);
        
        } 
        System.out.println (soma);
    } 
}

