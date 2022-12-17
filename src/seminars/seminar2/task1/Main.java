package seminars.seminar2.task1;


import seminars.seminar2.task1.weapon.Bow;
import seminars.seminar2.task1.weapon.MachineGun;
import seminars.seminar2.task1.weapon.PistolWeapon;
import seminars.seminar2.task1.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

/*
Создайте базовый класс Оружие. У оружия есть название, повреждение, скорострельность, количество зарядов в обойме, звук при выстреле — это методы. Напишите метод, который делает один выстрел.
Напишите три класса-наследника Оружия. В них переопределите родительские методы.
Проверьте, как работают оба оружия.
Создайте тестовый стенд для оружия — метод, который испытывает одно оружие. У мишени 100 единиц здоровья. Оружие стреляет в него, пока не убьёт.
Протестируйте все виды оружия на стенде.
 */
public class Main {

    private static void killTarget(int hp, Weapon weapon) throws InterruptedException {
        while (hp > 0) {
            weapon.getShoot();
            hp -= weapon.getDamage();
            System.out.printf("hp: %d\n", hp);
            Thread.sleep(60 / weapon.getShootPerMinute() * 100);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        List<Weapon> list = new ArrayList<>();
        list.add(new PistolWeapon(7));
        list.add(new MachineGun(21));
        list.add(new Bow(1));

        for (Weapon weapon : list) {
            killTarget(100, weapon);
            System.out.println();
        }




    }
}
