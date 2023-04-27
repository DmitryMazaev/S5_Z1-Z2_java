import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap, 
//учитывая, что 1 человек может иметь несколько телефонов.

public class Z1
{

    public void enter()
    {
        System.out.println("Добро пожаловать в телефонный справочник! Выберите действие: ");
        
        Scanner in = new Scanner(System.in);

        
        Map<String, String> hm = new HashMap<String, String>();
        while (true)
        {
            System.out.println("1 - добавить номер; 2 - вывести телефонный справочник; 3 - выйти");
            int n = in.nextInt();
            if (n == 1)
            {
                System.out.print("Введите номер телефона: ");
                String telephone = in.next();
                System.out.print("Введите имя: ");
                String name = in.next();
                hm.put(telephone, name);
                
            }
            else if (n == 2)
            {
                System.out.println(hm); 
            }
            else if (n == 3)
            {
                break;
            }
        }
        
        
    }
    
}