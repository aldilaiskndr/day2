import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasData {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input jumlah data : ");
        String jmlData = reader.readLine();
        int jml = Integer.parseInt(jmlData);
        String[] namaMasuk = new String[jml];
        String[] umurMasuk = new String[jml];

                int urut = 1;
                for(int i=0;i<=jml-1;i++) {
                System.out.println("MASUKAN DATA KE-"+ urut++);
                System.out.print("Nama :");
                String nama=  reader.readLine();
                System.out.print("Umur :");
                String umur= reader.readLine();
                    namaMasuk[i] = nama;
                    umurMasuk[i] = umur;
                }

        System.out.println("| NAMA | UMUR |");
        for(int i=0;i<=jml-1;i++){
            System.out.print("| "+ namaMasuk[i]);
            System.out.println(" | "+ umurMasuk[i] + " |");
        }
    }
}