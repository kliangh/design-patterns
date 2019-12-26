package code.kliangh.structural.decorator;

public class LensHood extends EvilDigitalCameraAttachment {
    public LensHood(EvilDigitalCamera evilDigitalCamera) {
        super(evilDigitalCamera);
    }

    @Override
    public void initializeCameraProperty(DigitalCameraProperties digitalCameraProperties) {
        targetEvilDigitalCamera.initializeCameraProperty(digitalCameraProperties);
    }

    @Override
    public ExifInformation shoot() {
        this.initializeCameraProperty(getDigitalCameraProperties());
        return super.shoot();
    }

    @Override
    public StringBuilder getEvilDigitalCameraLoadout() {
        return super.getEvilDigitalCameraLoadout().append(", lens hood attached");
    }

    private DigitalCameraProperties getDigitalCameraProperties() {
        return new DigitalCameraProperties(-0.5, null);
    }
}
