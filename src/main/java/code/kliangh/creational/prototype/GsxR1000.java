package code.kliangh.creational.prototype;

public class GsxR1000 extends SuzukiSportBike {
    private Paint paint;

    public GsxR1000 clone() throws CloneNotSupportedException {
        GsxR1000 gsxR1000 = (GsxR1000) super.clone();
        gsxR1000.paint = Paint.GLOSS;

        return gsxR1000;
    }

    public Paint getPaint() {
        return paint;
    }
}
