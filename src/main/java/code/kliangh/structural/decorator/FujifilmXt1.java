package code.kliangh.structural.decorator;

import com.google.common.base.Defaults;

public class FujifilmXt1 implements EvilDigitalCamera {
    private Double exposureValue;

    private Double aperture;

    private Integer batteryLevel;

    private Integer iso;

    private Integer shutterSpeed;

    private StringBuilder description;

    public FujifilmXt1() {
        this.exposureValue = 0.0d;
        this.aperture = 2.0d;
        this.batteryLevel = 100;
        this.iso = 200;
        this.shutterSpeed = 8;
        this.description = new StringBuilder("Fujifilm X-T1 with XF 23mm F2");
    }

    @Override
    public void initializeCameraProperty(DigitalCameraProperties digitalCameraProperties) {
        this.exposureValue += digitalCameraProperties.getExposureValue()
                                                     .orElse(Defaults.defaultValue(Double.TYPE));
        this.batteryLevel += digitalCameraProperties.getBatteryLevel()
                                                    .orElse(Defaults.defaultValue(Integer.TYPE));
    }

    @Override
    public ExifInformation shoot() {
        this.batteryLevel -= 1;
        return getExifInformation();
    }

    @Override
    public StringBuilder getEvilDigitalCameraLoadout() {
        return description;
    }

    private ExifInformation getExifInformation() {
        return new ExifInformation(exposureValue, aperture, shutterSpeed, iso, batteryLevel);
    }
}
