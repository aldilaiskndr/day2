class IsEven{
    public static void main(String[] Args) {
        int n = 8;
        System.out.println(getData(n));
        System.out.println(getKeliling(n));
    }

      static String getData(int numb){
            if(numb%2==1){
                return "ganjil";
            }else{
                return "genap";
            }
        }
    static Double getKeliling(int jari){
        return 2*3.14*jari;
    }
}