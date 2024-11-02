
package beratbadanbmi;
import java.util.Scanner;
        
public class BeratBadanBMI {
    public static void main(String[] args) {
        System.out.println("halo!`");
        System.out.println("masukkan detail anda");
        Scanner input  = new Scanner(System.in);
        String nama;
        int bb;
        float tb;
        
        System.out.print("Nama \t\t: ");
        nama = input.nextLine();
        System.out.print("bb(kg) \t\t: ");
        bb = input.nextInt();
        System.out.print("tb(M) \t\t: ");
        tb = input.nextFloat();
        
        float hasil = bb / (tb * tb);
        System.out.println("Hasil BMI kamu \t\t: " + hasil);
        
        input.close();
        
        if (hasil < 18.5) {
            System.out.println("yang artinya kamu harus lebih banyak mam yaa");
            
        }else if (hasil > 18.5 && hasil <=24.9) {
            System.out.println("btw cuma mau bilang kamu idaman!");
    }
        else if (hasil > 24.9 && hasil <= 29.9) {
            System.out.println("yah maaf, kamu harus kurangin berat badan ya :>");
            
    }   else if (hasil > 29.9) {
            System.out.println("yah hasilnya kamu overweight!!");
            System.out.println("tapi gpp, masih ada waktu untuk merubahnya");
            System.out.println("this bigboy will turn into a bigboy!");
    }
    }   
}
