import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Integer> korok = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("Kovács Dorina, 2022-03-08, szoft I/N");
       
        beker();
        atlag_ki();
    }

    static void beker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dolgozók életkora");
        int kor;
        do{
            System.out.println("Életkor:");
            kor = sc.nextInt();
           if(kor != 0){
            korok.add(kor);
           }
        }while(kor != 0);
           
    }
    static void atlag_ki(){
        
        int osszeg = 0;
        System.out.println(korok.size());
        for( Integer kor : korok){
           System.out.println(kor);
           osszeg += kor;

        }
        double atlag = osszeg / korok.size();
        System.out.println("Átlag: " + atlag);
    }

}
