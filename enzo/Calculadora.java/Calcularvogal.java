public class Calcularvogal{
    public static void main (String[] args){
        String vogais = "AEIOUaeiou";
            int cont = 0;
                char nt;
                for(int i=0; i<args.length; i++){
                for(int j=0; j<args[i].length(); j++){
                nt = args[i].charAt(j);
                for(int z=0; z<vogais.length(); z++){
                if(nt == vogais.charAt(z)){
                        cont ++;
            }

            }

        }
    }
    System.out.println(cont);
    }
}