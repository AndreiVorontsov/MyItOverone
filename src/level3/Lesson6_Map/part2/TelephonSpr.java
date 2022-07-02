package level3.Lesson6_Map.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Телефонный справочник. Создайте класс Человек, поля у него имя, фамилия, телефон, адрес, дата рождения.
// В методе main создайте HashMap, ключи будут строки в виде “Фамилия Имя”,
// а значения будут объекты класса Человек, добавьте несколько людей, положите их в map,
// выведите все значения на экран, затем удалите 1 пару из map и снова выведите.
public class TelephonSpr {
    public static void main(String[] args) {
        Map<String,Human> man = new HashMap<>();
        Human andrey = new Human("Andrey","Vorontsov", "+375-29-553-76-96", "kamenka", "03.08.1985");
        Human aleksei = new Human("Aleksei","Vorontsov", "+375-29-553-56-96", "kamenka2", "03.08.2002");
        Human arsenii = new Human("Arsenii","Vorontsov", "+375-29-553-66-96", "kamenka3", "03.08.2003");
    man.put(andrey.name + " " + andrey.family,andrey);
    man.put(aleksei.name + " " + aleksei.family,aleksei);
    man.put(arsenii.name + " " + arsenii.family,arsenii);
        System.out.println(man);
        for (Map.Entry<String,Human> pair: man.entrySet()){
            System.out.println(pair);
        }
        System.out.println();
        man.remove("Andrey Vorontsov");
        for (Map.Entry<String,Human> pair: man.entrySet()){
            System.out.println(pair);
        }

    }
}

class Human{
    String name;
    String family;
    String phonNunber;
    String adress;
    String dataByrs;

    public Human(String name, String family, String phonNunber, String adress, String dataByrs) {
        this.name = name;
        this.family = family;
        this.phonNunber = phonNunber;
        this.adress = adress;
        this.dataByrs = dataByrs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(family, human.family) && Objects.equals(phonNunber, human.phonNunber) && Objects.equals(adress, human.adress) && Objects.equals(dataByrs, human.dataByrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, phonNunber, adress, dataByrs);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", phonNunber='" + phonNunber + '\'' +
                ", adress='" + adress + '\'' +
                ", dataByrs='" + dataByrs + '\'' +
                '}';
    }
}

