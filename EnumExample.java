enum DayOfWeek{
    SUNDAY,MONDAY,TUESDAY,THURSADY,FRIDAY,SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        DayOfWeek today=DayOfWeek.MONDAY;
        System.out.println("Today is "+today);
        System.out.println("Days of the week");
        for(DayOfWeek day:DayOfWeek.values()){
            System.out.println(day);
        }
        
    }
    
}
