package javacore;

import java.util.Scanner;

public class Thi_sinh {
    private String Name;
    private String Date ;
    private float d1 ,d2,d3;
        public Thi_sinh()
        {

        }
        public  Thi_sinh ( String Name , String Date , float d1 , float d2 , float d3)
        {
            this.Name=Name;
            this.Date=Date;
            this.d1=d1;
            this.d2=d2;
            this.d3=d3;
        }
     public  String getTong( )
         {
            return String.format("%.1f",  this.d1 + this.d2 +this.d3 ) ;
         }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD2() {
        return d2;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float getD3() {
        return d3;
    }

    public void setD3(float d3) {
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return     Name + ' ' + Date + ' ' + getTong() ;
    }

    public static void main( String[] args) {

        Thi_sinh[] thi_sinh = new Thi_sinh[10];
        thi_sinh[0] = getInFo();
        System.out.println(thi_sinh[0].toString());
    }
    public static Thi_sinh getInFo()
    {
        Thi_sinh s = null;
        String name , date ;
        float d1 , d2 ,d3;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        date = input.next();
        d1 = input.nextFloat();
        d2 = input.nextFloat();
        d3 = input.nextFloat();
        s = new Thi_sinh(name , date , d1,d2,d3)   ;
        return s;
    }

}


