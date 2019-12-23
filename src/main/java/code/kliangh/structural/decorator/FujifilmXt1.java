package code.kliangh.structural.decorator;

public class FujifilmXt1 implements EvilDigitalCamera {
    private StringBuilder description;

    public FujifilmXt1() {
        this.description.append("Fujifilm X-T1 with XF 23mm F2");
    }

    @Override
    public void shoot() {
        System.out.println("Photo took!");
    }

    @Override
    public StringBuilder getEvilDigitalCameraLoadout() {
        return description;
    }
}
