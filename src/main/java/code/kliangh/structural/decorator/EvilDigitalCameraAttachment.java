package code.kliangh.structural.decorator;

public abstract class EvilDigitalCameraAttachment implements EvilDigitalCamera {
    final EvilDigitalCamera targetEvilDigitalCamera;

    public EvilDigitalCameraAttachment(EvilDigitalCamera evilDigitalCamera) {
        this.targetEvilDigitalCamera = evilDigitalCamera;
    }

    @Override
    public ExifInformation shoot() {
        return targetEvilDigitalCamera.shoot();
    }

    @Override
    public StringBuilder getEvilDigitalCameraLoadout() {
        return targetEvilDigitalCamera.getEvilDigitalCameraLoadout();
    }
}
