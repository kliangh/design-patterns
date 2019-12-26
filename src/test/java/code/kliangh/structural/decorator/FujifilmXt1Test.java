package code.kliangh.structural.decorator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FujifilmXt1Test {
    private EvilDigitalCamera evilDigitalCameraWithAttachments;

    private EvilDigitalCamera evilDigitalCameraWithoutAttachments;

    private ExifInformation exifInformation;

    @Before
    public void setUp() throws Exception {
        this.evilDigitalCameraWithAttachments = new LensHood(new VerticalGrip((new FujifilmXt1())));
        this.evilDigitalCameraWithoutAttachments = new FujifilmXt1();
    }

    @Test
    public void testShootingWithAttachments() {
        exifInformation = evilDigitalCameraWithAttachments.shoot();
        Assert.assertEquals(-0.5d, (Object) exifInformation.getExposureValue());
        Assert.assertEquals(2.0, (Object) exifInformation.getAperture());
        Assert.assertEquals(8, (Object) exifInformation.getShutterSpeed());
        Assert.assertEquals(200, (Object) exifInformation.getIso());
        Assert.assertEquals(299, (Object) exifInformation.getBatteryLevel());

        System.out.println(evilDigitalCameraWithAttachments.getEvilDigitalCameraLoadout().toString());

        exifInformation = evilDigitalCameraWithAttachments.shoot();
        Assert.assertEquals(298, (Object) exifInformation.getBatteryLevel());
    }

    @Test
    public void testShootingWithoutAttachments() {
        exifInformation = evilDigitalCameraWithoutAttachments.shoot();
        Assert.assertEquals(0.0d, (Object) exifInformation.getExposureValue());
        Assert.assertEquals(2.0d, (Object) exifInformation.getAperture());
        Assert.assertEquals(8, (Object) exifInformation.getShutterSpeed());
        Assert.assertEquals(200, (Object) exifInformation.getIso());
        Assert.assertEquals(99, (Object) exifInformation.getBatteryLevel());

        System.out.println(evilDigitalCameraWithoutAttachments.getEvilDigitalCameraLoadout());
    }
}
