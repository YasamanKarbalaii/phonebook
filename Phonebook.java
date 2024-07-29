package ep11;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Phonebook {
    public static void make(){
       Scanner in=new Scanner(System.in);
        boolean answer=true,yes;
        String f,l,p;
        int choice;
        LinkedList L = new LinkedList();
        Person P;
        try  {
            FileReader fr=new FileReader("phone.txt");
            Scanner fin=new Scanner(fr);
            while(fin.nextLine()!=null) System.out.println(fin.nextLine()+",");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        while(answer){
            System.out.println("What can i do for you?? enter the number: 1:add / 2:remove / 3:search / 4:edit / 5:print / 6:exit");
            choice=in.nextInt();

            if(choice==1){
                System.out.println("enter your first name:");
                f=in.nextLine();
                in.nextLine();
                System.out.println("enter your last name:");
                l=in.nextLine();
                System.out.println("enter your phone number:");
                p=in.nextLine();
                P=new Person(f,l,p);
                yes= L.search(P);
                if(yes) System.out.println("we have this person already!!");
                else L.insert(P);
            }
            else if(choice==2){
                System.out.println("enter your first name:");
                f=in.nextLine();
                in.nextLine();
                System.out.println("enter your last name:");
                l=in.nextLine();
                System.out.println("enter your phone number:");
                p=in.nextLine();
                P=new Person(f,l,p);
                yes=L.search(P);
                if(yes){
                    L.removeall(P);
                    System.out.println("done!!");
                }
                else System.out.println("we don't have this person!!");}

            else if(choice==3){
                System.out.println("enter your first name:");
                f=in.nextLine();
                in.nextLine();
                System.out.println("enter your last name:");
                l=in.nextLine();
                System.out.println("enter your phone number:");
                p=in.nextLine();
                P=new Person(f,l,p);
                yes=L.search(P);
                if(yes) System.out.println("we found it!!");
                else System.out.println("we don't have this person!!");

            }
            else if(choice==4){
                System.out.println("enter your first name:");
                f=in.nextLine();
                in.nextLine();
                System.out.println("enter your last name:");
                l=in.nextLine();
                System.out.println("enter your new phone number:");
                p=in.nextLine();
                L.search(f, l, p);
            }
            else if(choice==5){
                System.out.println(L.toString());
            }
            else if(choice==6){
                try{
                    FileWriter fw=new FileWriter("phone.txt");
                    fw.write(L.toString());
                    fw.close();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
                answer=false;
            }
        }
}
}
