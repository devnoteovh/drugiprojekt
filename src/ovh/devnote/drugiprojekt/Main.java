package ovh.devnote.drugiprojekt;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println("hello");
        //System.out.println("hello2");

        int a=1;
        //System.out.println(a);
        long l=1000000000000L;
        long b=l;
        l=l+a;
        //System.out.println(l);
        char c='a';
        boolean bl = false;
        //System.out.println(c);
        String string= "abc";
        System.out.println(string);
        if(string.equals("k")) {
            System.out.println("kobieta");

        }
        else if(string.equals("m")){
            System.out.println("mezczyzna");
        }
        int y=-1;
        while(y<10){
            y++;
            System.out.println(y);
        }

        do{

           y++;
           System.out.println(y);
        }while(y<10);



String plec="m";
switch (plec){
    case "k": { System.out.println("kobieta");break; }
    case "m": { System.out.println("mezczyzna");break;}
    default:
        System.out.println("nie podano");
}


        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==3) break;
        }
        for(int i=0;i<=10;i++){
            if(i==3) continue;
            System.out.println(i);

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj imie ");
        String line = sc.nextLine();
        System.out.println("wyswietlam: "+line);
        System.out.println("podaj wiek ");
        line = sc.nextLine();
        int wiek = Integer.parseInt(line);
        System.out.println(wiek);

        line = sc.nextLine();
        boolean boo = Boolean.parseBoolean(line);
        System.out.println(boo);


        line = sc.nextLine();
        double dd =  Double.parseDouble(line);
        System.out.println(dd);

        int[] tablica = new int[10];
        System.out.println(tablica);
        for(int i=0;i<tablica.length;i++){
            //System.out.print(i+" "+tablica[i]+ " ");
        }
        tablica[1]=123;
        System.out.println(Arrays.toString(tablica));
        String[] tabString = new String[5];
        tabString[0]="jeden";
        System.out.println(Arrays.toString(tabString));

        int[] tab2 = {1,2,3,4};
        System.out.println(Arrays.toString(tab2));

        int[][] td2 = new int[5][5];
        int[][] td22 =   {{1,2,3,4},{1,2,3,4}} ;
        /*
         czy zadziala??
         */
        System.out.println(Arrays.toString(td22));
    }
}
