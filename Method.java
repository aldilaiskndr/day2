class Method{
    public static void main(String[] args){
        String nama = "aldila";
        String namaBaru = "Aldila";
        System.out.println(getNama(nama, namaBaru));
    }

    static boolean getNama(String nama1, String nama2){
        boolean x = nama1.equals(nama2);
        return x;
    }
}