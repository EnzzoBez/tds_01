class PosicaoAleatoria {
    public static void main(String[] args) {
        double rand = Math.random();
        int length = args[0].length();
        int position = (int) (rand * length);

        System.out.println(args[0] + "[" + position + "] => " + args[0].charAt(position));
    }
}
