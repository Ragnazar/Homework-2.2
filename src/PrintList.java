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

    public void compareStudentsByHouse(Gryffindor[] gryffindors, String name1, String name2) {
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

    public void compareStudentsByHouse(Hufflepuff[] hufflepuffs, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;

        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (Objects.equals(name1, hufflepuff.getName())) {
                sum1 = hufflepuff.getDiligence() + hufflepuff.getHonour() + hufflepuff.getLoyalty();
            } else if (Objects.equals(name2, hufflepuff.getName())) {
                sum2 = hufflepuff.getDiligence() + hufflepuff.getHonour() + hufflepuff.getLoyalty();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Пуффендуец, чем " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " лучший Пуффендуец, чем " + name1);
        } else {
            System.out.println("Оба отличные Пуффендуйцы");
        }
    }

    public void compareStudentsByHouse(Ravenclaw[] ravenclaws, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;

        for (Ravenclaw ravenclaw : ravenclaws) {
            if (Objects.equals(name1, ravenclaw.getName())) {
                sum1 = ravenclaw.getCreativity() + ravenclaw.getWit()
                        + ravenclaw.getWisdom() + ravenclaw.getIntelligence();
            } else if (Objects.equals(name2, ravenclaw.getName())) {
                sum2 = ravenclaw.getCreativity() + ravenclaw.getWit()
                        + ravenclaw.getWisdom() + ravenclaw.getIntelligence();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Когтевранец, чем " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " лучший Когтевранец, чем " + name1);
        } else {
            System.out.println("Оба отличные Когтевранцы");
        }
    }

    public void compareStudentsByHouse(Slytherin[] slytherins, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;

        for (Slytherin slytherin : slytherins) {
            if (Objects.equals(name1, slytherin.getName())) {
                sum1 = slytherin.getAmbition() + slytherin.getResourcefulness()
                        + slytherin.getCunning() + slytherin.getLustForPower() + slytherin.getDetermination();
            } else if (Objects.equals(name2, slytherin.getName())) {
                sum2 = slytherin.getAmbition() + slytherin.getResourcefulness()
                        + slytherin.getCunning() + slytherin.getLustForPower() + slytherin.getDetermination();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Слизеринец, чем " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " лучший Слизеринец, чем " + name1);
        } else {
            System.out.println("Оба отличные Слизеринцы");
        }
    }

    public void compareStudents(Hogwarts[] students, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;

        for (Hogwarts student : students) {
            if (Objects.equals(name1, student.getName())) {
                sum1 = student.getMagicPower() + student.getTransgressionLength();
            } else if (Objects.equals(name2, student.getName())) {
                sum2 = student.getMagicPower() + student.getTransgressionLength();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " обладает бОльшей мощностью магии, чем " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " обладает бОльшей мощностью магии, чем " + name1);
        } else {
            System.out.println("Силы студентов равны");
        }
    }

}
