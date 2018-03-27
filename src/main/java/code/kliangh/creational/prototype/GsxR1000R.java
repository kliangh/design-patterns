package code.kliangh.creational.prototype;

public class GsxR1000R extends SuzukiSportBike {
    private Paint paint;

    public GsxR1000R clone() throws CloneNotSupportedException {
        GsxR1000R gsxR1000R = (GsxR1000R) super.clone();
        gsxR1000R.paint = Paint.ECSTAR;
        gsxR1000R.frontFork = FrontFork.SHOWA_BFF;
        gsxR1000R.quickShiftSystem = true;

        return gsxR1000R;
    }

    public Paint getPaint() {
        return paint;
    }
}
