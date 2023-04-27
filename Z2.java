import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* Пусть дан список сотрудников. Написать программу, 
которая найдёт и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. */

public class Z2 
{
    public static void main (String[] args)
    {
        String list = "Иван Иванов, Светлана Петрова, Кристина Белова, Светлана Петрова, Иван Иванов, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        //System.out.println("Список сотрудников: " + list);
        String [] list1 = list.split(", ");

        //System.out.println(list1.length);

        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i: list1) 
        {
			
			String tmp1 = i;
			
					if(hm.containsKey(tmp1))
                    {
							int tmp2 = hm.get(tmp1)+1;
							hm.put(tmp1, tmp2);	
					}
					else 
						hm.put(tmp1, 1);	
		}	
        for (Map.Entry<String, Integer> entry : hm.entrySet()) 
        {
			//if(!entry.getValue().equals(0))
			System.out.printf("%s,  %s\r\n", entry.getKey(), entry.getValue());
        }
    }   
}
