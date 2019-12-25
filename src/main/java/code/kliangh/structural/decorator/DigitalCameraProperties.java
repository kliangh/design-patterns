package code.kliangh.structural.decorator;

import java.util.Optional;

public class DigitalCameraProperties {
    private Double exposureValue;

    private Integer batteryLevel;

    public DigitalCameraProperties(Double exposureValue, Integer batteryLevel) {
        this.exposureValue = exposureValue;
        this.batteryLevel = batteryLevel;
    }

    public Optional<Double> getExposureValue() {
        return Optional.ofNullable(exposureValue);
    }

    public Optional<Integer> getBatteryLevel() {
        return Optional.ofNullable(batteryLevel);
    }
}
