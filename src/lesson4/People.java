package lesson4;

public class People {
    public static void main(String[] args) {

        Employee fivePeople[] = new Employee[5];

        Employee employee1 = new Employee("Иванова Мария Степановна", "Уборщица", "1234567890", 16000, 45);
        Employee employee2 = new Employee("Достоевская Ирина Николаевна", "Старший менеджер", "0987654321", 23000, 30);
        Employee employee3 = new Employee("Иванов Иван Иванович", "Программист соседнего кафе", "1092837645", 18000, 32);
        Employee employee4 = new Employee("Гвидо Анатолий Ростиславович", "Младший киллер", "0192837645", 24000, 60);
        Employee employee5 = new Employee("Августинская Зинаида Петровна", "Режиссер", "0981237645", 23000, 45);

        System.out.println(employee1.getName() + ", " + employee1.getPosition());


        fivePeople[0] = employee1;
        fivePeople[1] = employee2;
        fivePeople[2] = employee3;
        fivePeople[3] = employee4;
        fivePeople[4] = employee5;


        for (int i = 0; i < fivePeople.length; i++) {
            if(fivePeople[i].getAge() > 40) {
                System.out.println(fivePeople[i].getName() +", " + fivePeople[i].getAge() +" лет, " + fivePeople[i].getPosition());
            }
        }
    }
}
