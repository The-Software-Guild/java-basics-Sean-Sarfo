import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        System.out.print("What's your dogs name");
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+name+"  prestigious background right here.");
        System.out.println(name+" is:");

        Random random=new Random();
        int[]per=new int[5];
        String[]dogs={"Rocky","Hisky","Charle","Boodog","Sponky"};
        for(int i=0;i<4;i++)
        {per[i]=random.nextInt(20 );

        }
        per[4]=100-(per[0]+per[1]+per[2]+per[3]);
        for(int i=0;i<per.length;i++) {
            System.out.println(dogs[i]+" "+per[i]);}
    }
}
