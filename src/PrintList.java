import java.util.Objects;

public class PrintList {
    public void print(Hogwarts[] students) {
        System.out.println("Количество студентов в школе = " + students.length);

        for (Hogwarts student : students) {
            System.out.println("Имя " + student.getName() + "; Сила магии " + student.getMagicPower()
                    + "; Расстояние трасгрессии " + student.getTransgressionLength());
        }
    }

    public void print(Gryffindor[] gryffindors) {
        System.out.println("Количество студентов в доме = " + gryffindors.length);

        for (Gryffindor gryph : gryffindors) {
            System.out.println("Имя " + gryph.getName() + "; Сила магии " + gryph.getMagicPower()
                    + "; Расстояние трасгрессии " + gryph.getTransgressionLength()
                    + "; Благородство " + gryph.getNobility() + "; Честь " + gryph.getHonour()
                    + "; Храбрость " + gryph.getBravery());
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Количество студентов в доме = " + hufflepuffs.length);

        for (Hufflepuff huffs : hufflepuffs) {
            System.out.println("Имя " + huffs.getName() + "; Сила магии " + huffs.getMagicPower()
                    + "; Расстояние трасгрессии " + huffs.getTransgressionLength()
                    + "; Трудолюбие " + huffs.getDiligence()
                    + "; Верность" + huffs.getLoyalty() + "; Честь " + huffs.getHonour());
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Количество студентов в доме = " + ravenclaws.length);

        for (Ravenclaw ravens : ravenclaws) {
            System.out.println("Имя " + ravens.getName() + "; Сила магии " + ravens.getMagicPower()
                    + "; Расстояние трасгрессии " + ravens.getTransgressionLength() +
                    "; Ум " + ravens.getIntelligence() + "; Мудрость " + ravens.getWisdom()
                    + "; Остроумие " + ravens.getWit() + "; Творчество " + ravens.getCreativity());

        }
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Количество студентов в доме = " + slytherins.length);

        for (Slytherin slyths : slytherins) {
            System.out.println("Имя " + slyths.getName() + "; Сила магии " + slyths.getMagicPower()
                    + "; Расстояние трасгрессии " + slyths.getTransgressionLength()
                    + "; Хитрость " + slyths.getCunning() + "; Решительность " + slyths.getDetermination()
                    + "; Амбициозность " + slyths.getAmbition() + "; Находчивость " + slyths.getResourcefulness()
                    + "; Жажда власти " + slyths.getLustForPower());
        }
    }

    public void compareStudents(Gryffindor[] gryffindors, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;

        for (Gryffindor gryffindor : gryffindors) {
            if (Objects.equals(name1, gryffindor.getName())) {
                sum1 = gryffindor.getBravery() + gryffindor.getHonour() + gryffindor.getNobility();
            } else if (Objects.equals(name2, gryffindor.getName())) {
                sum2 = gryffindor.getBravery() + gryffindor.getHonour() + gryffindor.getNobility();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Гриффиндорец, чем " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " лучший Гриффиндорец, чем " + name1);
        } else {
            System.out.println("Оба отличные Гриффиндорцы");
        }
    }

}
