
public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри Поттер", 65, 50),
                new Hogwarts("Гермиона Грейнджер", 55, 40),
                new Hogwarts("Рон Уизли", 40, 20),
                new Hogwarts("Драко Малфой", 50, 55),
                new Hogwarts("Грэхэм Мотегю", 60, 55),
                new Hogwarts("Грегори Гойл", 34, 40),
                new Hogwarts("Захария Смит", 45, 40),
                new Hogwarts("Седрик Диггори", 55, 65),
                new Hogwarts("Джастин Финч-Флетчли", 55, 45),
                new Hogwarts("Джоу Чанг", 55, 65),
                new Hogwarts("Падма Патил", 38, 42),
                new Hogwarts("Маркус Белби", 53, 60)
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 65, 50,
                        8, 10, 15),
                new Gryffindor("Гермиона Грейнджер", 55, 40,
                        5, 5, 6),
                new Gryffindor("Рон Уизли", 40, 20,
                        3, 6, 5)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 50, 55,
                        5, 5, 5, 5, 8),
                new Slytherin("Грэхэм Мотегю", 60, 55,
                        6, 4, 5, 4, 5),
                new Slytherin("Грегори Гойл", 34, 40,
                        3, 3, 3, 4, 4)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 45, 40,
                        5, 6, 8),
                new Hufflepuff("Седрик Диггори", 55, 65,
                        8, 7, 8),
                new Hufflepuff("Джастин Финч-Флетчли", 55, 45,
                        6, 4, 4)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Джоу Чанг", 55, 65,
                        5, 5, 7, 6),
                new Ravenclaw("Падма Патил", 38, 42
                        , 4, 6, 6, 8),
                new Ravenclaw("Маркус Белби", 53, 60,
                        7, 6, 7, 9)
        };
        PrintList printService = new PrintList();

        printService.print(ravenclaws);
        System.out.println();

        printService.compareStudentsByHouse(gryffindors, "Гермона Грейнджер", "Гарри Поттер");
        printService.compareStudentsByHouse(slytherins, "Драко Малфой", "Грегори Гойл");
        printService.compareStudentsByHouse(hufflepuffs, "Седрик Диггори", "Захария Смит");
        printService.compareStudentsByHouse(ravenclaws, "Джоу Чанг", "Маркус Белби");
        System.out.println();
        printService.compareStudents(students, "Гарри Поттер", "Драко Малфой");

    }
}