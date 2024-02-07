class PosicaoEspecifica {
    public static void main(String[] args) {
        int position = Integer.parseInt(args[0]);

        System.out.println(args[1] + "[" + position + "] => " + args[1].charAt(position));
    }
}