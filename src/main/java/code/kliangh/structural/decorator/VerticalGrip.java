package code.kliangh.structural.decorator;

public class VerticalGrip extends EvilDigitalCameraAttachment {
    public VerticalGrip(EvilDigitalCamera evilDigitalCamera) {
        super(evilDigitalCamera);
        initializeCameraProperty(getDigitalCameraProperties());
    }

    @Override
    public void initializeCameraProperty(DigitalCameraProperties digitalCameraProperties) {
        targetEvilDigitalCamera.initializeCameraProperty(digitalCameraProperties);
    }

    @Override
    public ExifInformation shoot() {
        return super.shoot();
    }

    @Override
    public StringBuilder getEvilDigitalCameraLoadout() {
        return super.getEvilDigitalCameraLoadout().append(", attached vertical grip");
    }

    private DigitalCameraProperties getDigitalCameraProperties() {
        return new DigitalCameraProperties(null, +200);
    }
}
