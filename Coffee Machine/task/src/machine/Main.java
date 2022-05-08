package machine;



class Main {





    /*static boolean isConsoante(String s, int n){
        boolean resp= true;
        if (n != s.length()){
            if (s.charAt(n)<'0' || s.charAt(n)>'9'){
                if (isVogal(s.charAt(n)) == true){
                    resp= false;
                } else {
                    resp=isConsoante(s, n + 1);
                }
            } else {
                resp=false;
            }
        }
        return resp;

    }*/
    //-----------------------
    static boolean isConsoante(String s, int i){


        boolean resp= true;
        if (i > s.length()){
            throw new IndexOutOfBoundsException("VALOR PASSADO: " + i + " ,FORA DO TAMANHO DA STRING");

        }
        if (isVogal(s.charAt(i))){
            return false;
        } else if(s.charAt(i) <'0' || s.charAt(i) >'9') {
            resp = true;
        }
        else {
            resp = isConsoante(s, i + 1);
        }
        return resp;
    }
    //-----------------------
    static boolean isVogal(char c){
        c = toUpper(c);
        return (c =='A' || c =='E' || c =='I' || c =='O' || c =='U');
    }

    //-----------------------
    public static char toUpper(char c){
        return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) :c;
    }
    //-----------------------
    public static void main(String[] args) {
        System.out.println(isConsoante("aaar",1));
    }

}