package seminars.seminar2.task1.weapon;

public class MachineGun extends Weapon{

    public MachineGun(int magazineSize) {
        super(magazineSize);
    }

    @Override
    public String getName() {
        return "AK-47";
    }

    @Override
    public int getDamage() {
        return 50;
    }

    @Override
    public int getShootPerMinute() {
        return 30;
    }

    @Override
    public void makeSound() {
        System.out.println("tra-ta-ta!!!!");
    }

}
