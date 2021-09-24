public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }


    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println("takes off in the sky");
    }


    @Override
    public void ascend(int i) {
        this.setAltitude(i);
        System.out.println("flies upward, altitude : " + i);
    }

    @Override
    public void glide() {
        System.out.println("It glides into the air.");
    }

    @Override
    public void descend(int i) {
        this.setAltitude(i);
        System.out.println(" Cherry flies downward, altitude :" + i);
    }


    @Override
    public void land() {
        if (this.altitude > 9) {
            System.out.println("is too high, it can't lands.");
        } else {
            System.out.println("lands on the ground");
        }

    }
}
