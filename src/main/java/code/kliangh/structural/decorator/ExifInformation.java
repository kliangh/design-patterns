package code.kliangh.structural.decorator;

public class ExifInformation {
    private Double exposureValue;

    private Double aperture;

    private Integer shutterSpeed;

    private Integer iso;

    private Integer batteryLevel;

    public ExifInformation(
            Double exposureValue, Double aperture, Integer shutterSpeed, Integer iso,
            Integer batteryLevel) {
        this.exposureValue = exposureValue;
        this.aperture = aperture;
        this.shutterSpeed = shutterSpeed;
        this.iso = iso;
        this.batteryLevel = batteryLevel;
    }

    public Double getExposureValue() {
        return exposureValue;
    }

    public Double getAperture() {
        return aperture;
    }

    public Integer getShutterSpeed() {
        return shutterSpeed;
    }

    public Integer getIso() {
        return iso;
    }

    public Integer getBatteryLevel() {
        return batteryLevel;
    }
}
