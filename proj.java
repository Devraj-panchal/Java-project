import java.util.*;

public class proj {
    public static void main(String[] args)
    {
        System.out.println("Hello World");   
    }
}

class Menu {
    
    // col1 = Name , col2 = Price , col3 = Category
    
    static String[][] menu1 = new String[40][3];
    static int counter = 0;
    
    static void Add_Item(String name, String price, String category)
    {
        menu1[counter][0] = name;
        menu1[counter][1] = price;
        menu1[counter][2] = category;
        counter++;
    }

    static void Display_Menu()
    {
        int i = 0;
        while (menu1[i][0] != null)
        {
            System.out.println(menu1[i][0] + "     " + menu1[i][1] + "     " + menu1[i][2]);
            i++;
        }     
    }
}

class Table extends Menu{
    


    void Add_to_table(String Name)
    {
        
    }
}