/*Please use BlueJ compiler to run this  code*/
import java.util.*;
class library_management{
    Scanner sc=new Scanner(System.in);
    void management(ArrayList d,ArrayList d2,ArrayList d3,ArrayList d4,ArrayList b1,String st,int k){
        if(k==1){
            System.out.println("Enter the name of book");
            String n=sc.nextLine();
            System.out.println("Enter the name of author of book");
            String a=sc.nextLine();
            d.add(n);
            d2.add(a);
        }
        else if(k==2){
            System.out.println("Enter name of book to be issued");
            String s=sc.nextLine();
            int j=1;
            for(int i=0;i<d.size();i++){
                if((d.get(i).equals(s)))
                {j=0;
                    d3.add(st);
                    Date c=new Date();
                    String s1=Integer.toString(c.getDate())+"/"+Integer.toString(c.getMonth())+"/"+Integer.toString(1900+c.getYear());
                    d4.add(s1);
                    b1.add(s);
                    d.remove(d.indexOf(s));
                    break;
                }
            }
            if(j==1)
            System.out.println("Book is not available");
        }
        else{
            try{
            d.add(b1.get(d3.indexOf(st)));
            d4.remove(d3.indexOf(st));
            b1.remove(d3.indexOf(st));
            d3.remove(d3.indexOf(st));}
            catch(Exception e){
                System.out.println("No book has been issued that is to be returned");
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<String> b1=new ArrayList<>();
        ArrayList<String> d=new ArrayList<>();
        ArrayList<String> d2=new ArrayList<>();
        ArrayList<String> d3=new ArrayList<>();
        ArrayList<String> d4=new ArrayList<>();
        String stu[]=new String[26];
        library_management ob=new library_management();
        for(int i=0;i<26;i++)
        stu[i]="Student "+(char)(i+65);
        int q=1;
        while(q==1){
        System.out.println(" Enter 1 to add a book\n Enter 2 to issue a book\n Enter 3 to return a book");
        int k=in.nextInt();
        if(k==2||k==3)
        {
            System.out.println("Enter student roll number(<26)");
            int h=in.nextInt();
            ob.management(d,d2,d3,d4,b1,stu[h],k);
        }
        else{
            ob.management(d,d2,d3,d4,b1,"",k);
        }
        System.out.println("Available books' shelf\n"+d);
        if(d3.size()>0){
            System.out.println("Students who issued books and their issuing date");
        for(int i=0;i<d3.size();i++)
        System.out.println(d3.get(i)+" issued book "+b1.get(i)+" on "+d4.get(i));
        }
        System.out.println("Enter 1 to continue operations and 0 to exit");
        q=in.nextInt();
    }
}
}