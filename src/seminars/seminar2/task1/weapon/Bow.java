package seminars.seminar2.task1.weapon;

public class Bow extends Weapon{

    public Bow(int magazineSize) {
        super(magazineSize);
    }

    @Override
    public String getName() {
        return "Grand Bow";
    }

    @Override
    public int getDamage() {
        return 100;
    }

    @Override
    public int getShootPerMinute() {
        return 5;
    }

    @Override
    public void makeSound() {
        System.out.println("piuuuuu!!!");
    }

}
