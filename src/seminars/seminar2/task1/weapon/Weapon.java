package seminars.seminar2.task1.weapon;

public abstract class Weapon {

    private int magazineSize;

    private int magazineCurrent;

    public Weapon(int magazineSize) {
        this.magazineSize = magazineSize;
        this.magazineCurrent = magazineSize;
    }

    public abstract String getName();

    public abstract int getDamage();

    public abstract int getShootPerMinute();

//    public int getMagazineSize() {
//        return magazineSize;
//    }
//
//    public int getMagazineCurrent() {
//        return magazineCurrent;
//    }


    public abstract void makeSound();

    public void getShoot() {
        makeSound();
        magazineCurrent -= 1;
    }

}
