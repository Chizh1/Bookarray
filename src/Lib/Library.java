package Lib;

public class Library {
    public static void main (String [] args) {
        int n_Book []={112, 232, 4443, 984, 5,6,7,8,9};
        String t_Book[]={" Java™ Servlet Programming ", " JavaScript: The Definitive Guide ", " Java Swing ",
                " Foundations of C++/CLI: The Visual C++ Language for .NET 3.5 ", " Programming Embedded Systems in C and C++ ",
                " Programming Applications for Microsoft Windows ", " Web Database Applications with PHP & MySQL " };
        String a_Book[]= {" Jason Hunter "," David Flanagan ", " Brian Cole, Robert Eckstein "," Gordon Hogenso ", " Barr Michael ",
                " Richter Jeffrey ", " Williams Hugh, Lane David "};
        String pu_Book []={" O'Reilly ", " Apress ", " Maxaon ", " A-Ba-Ba-Ga-La-Ma-Ga ", " Ranok ", " Alma "};
        int y_Book[]={2002 , 2008 , 1997 , 2012 , 2005 , 2007 , 2010 };
        int pa_Book[]={235 , 489 , 159 , 1056 , 674 , 854};
        float pr_Book[]={200.00F , 189.32F , 150.50F , 99.00F , 124.60F };
        int N = (int)(Math.random()*10)+1;
        Book []arr_Lib= new Book [N];
        System.out.println("Massiv object arr_Lib: ");
        for(int i=0; i<arr_Lib.length; i++) {
            arr_Lib[i] = new Book();
            arr_Lib[i].setId(i + 1);
            arr_Lib[i].setTitle(t_Book[(int)(Math.random()*100)%t_Book.length]);
            arr_Lib[i].setAutor(a_Book[(int)(Math.random()*100)%a_Book.length]);
            arr_Lib[i].setPublishing_house(pu_Book[(int)(Math.random()*100)%pu_Book.length]);
            arr_Lib[i].setYear(y_Book[(int)(Math.random()*100)%y_Book.length]);
            arr_Lib[i].setPages(pa_Book[(int)(Math.random()*100)%pa_Book.length]);
            arr_Lib[i].setPrise(pr_Book[(int)(Math.random()*100)%pr_Book.length]);
        }
        for(int i=0; i<arr_Lib.length; i++)
            System.out.println(arr_Lib[i]+ " ");
        int count = 0;
        System.out.print("\nList of books given author-> ");
        String a = a_Book[(int)(Math.random()*100)%a_Book.length];
        System.out.println(a);
        for(int i=0; i<arr_Lib.length; i++)
            if (a.equals(arr_Lib[i].getAutor())) {
                System.out.println(arr_Lib[i]);
                count++;
            }
        if (count == 0) System.out.println("Book not found");
        count = 0;
        System.out.print("\nA list of books that are published as specified publisher -> ");
        String pu = pu_Book[(int)(Math.random()*100)%pu_Book.length];
        System.out.println(pu) ;
        for(int i=0; i<arr_Lib.length; i++)
            if (pu.equals(arr_Lib[i].getPublishing_house())) {
                System.out.println(arr_Lib[i]);
                count++;
            }
        if (count == 0) System.out.println("Book not found");

        count = 0;
        System.out.print("\nA list of books that were issued after a specified year -> ");
        int y = y_Book[(int)(Math.random()*100)%y_Book.length];
        System.out.println(y);
        for(int i=0; i<arr_Lib.length; i++)
            if (y< (arr_Lib[i].getYear())){
                System.out.println(arr_Lib[i])  ;
                count++;
            }
        if (count == 0) System.out.println("Book not found");
    }
}
