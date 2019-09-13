import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tugas{
    public static void main(String[] Args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        System.out.println(dikaliDua(Integer.parseInt(reader.readLine())));
    }
    static Integer dikaliDua(int num){
        int result = num*2;
        return result;
    }
}