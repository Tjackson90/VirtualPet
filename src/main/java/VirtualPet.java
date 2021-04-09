

public class VirtualPet {


    private int hunger;
    private int loved;
    private int bladder;
    private int tired;


    public VirtualPet(int hunger, int loved, int bladder, int tired) {

        this.hunger = hunger;
        this.loved = loved;
        this.bladder = bladder;
        this.tired = tired;


    }

    public int getHunger() {
        return hunger;
    }

    public int getLoved() {
        return loved;
    }

    public int getBladder() {
        return bladder;
    }

    public int getTired() {
        return tired;
    }

    public boolean checkDead() {
        if (hunger <= 0 || loved <= 0 || bladder <= 0 || tired <= 0) {
            return true;
        } else {
            return false;
        }
    }


    public void feed() {
        if (hunger >= 0) {
            hunger += 10;
            bladder += 10;
            tired -= 10;
        } else {
            hunger = 0;
            System.out.println("You died!");
            System.exit(0);
        }

    }

    public void praise() {
        if (loved >= 0) {
            loved += 10;
            hunger -= 15;
            tired -= 15;
        } else {
            loved = 0;
            System.out.println("You died!");
            System.exit(0);
        }
    }

    public void potty() {
        if (bladder >= 0) {
            bladder += 10;
        } else {
            bladder = 0;
            System.out.println("You died!");
            System.exit(0);
        }
    }

    public void sleep() {
        if (tired >= 0) {
            tired += 10;
            hunger -= 10;
        } else {
            tired = 0;
            System.out.println("You died!");
            System.exit(0);
        }
    }

    private void Tick() {
        hunger -= 1;
        loved -= 1;
        bladder -= 1;
        tired -= 1;

    }

}

        
    





