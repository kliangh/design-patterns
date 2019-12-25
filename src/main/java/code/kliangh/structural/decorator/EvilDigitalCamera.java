package code.kliangh.structural.decorator;

public interface EvilDigitalCamera {
    void initializeCameraProperty(DigitalCameraProperties digitalCameraProperties);

    ExifInformation shoot();

    StringBuilder getEvilDigitalCameraLoadout();
}
