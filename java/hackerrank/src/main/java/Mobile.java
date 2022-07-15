public class Mobile {
    private boolean touchScreenAvailable;
    private boolean enabled5G;
    private int ram;
    private int cameraPixel;
    private String brandName;
    private String deviceName;

    public Mobile(MobileBuilder builder, String brandName, String deviceName) {
        builder.brandName = brandName;
        builder.deviceName = deviceName;
        this.touchScreenAvailable = builder.touchScreenAvailable;
        this.enabled5G = builder.enabled5G;
        this.ram = builder.ram;
        this.cameraPixel = builder.cameraPixel;
    }

    public boolean isTouchScreenAvailable() {
        return touchScreenAvailable;
    }

    public boolean isEnabled5G() {
        return enabled5G;
    }

    public int getRam() {
        return ram;
    }

    public int getCameraPixel() {
        return cameraPixel;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void printDetails() {
        System.out.printf("Mobile %s of brand %s with following features: touch screen enabled %s, 5G enabled " +
                "%s, ram %s, camera pixel %s.", deviceName, brandName, touchScreenAvailable, enabled5G, ram, cameraPixel);
    }


    // builder
    public static class MobileBuilder {
        private boolean touchScreenAvailable;
        private boolean enabled5G;
        private int ram;
        private int cameraPixel;
        private String brandName;
        private String deviceName;

        public MobileBuilder(String brandName, String deviceName) {
            this.brandName = brandName;
            this.deviceName = deviceName;
        }

        void setTouchScreenAvailable(boolean touchScreenAvailable) {
            this.touchScreenAvailable = touchScreenAvailable;
        }

        void setEnabled5G(boolean enabled5G) {
            this.enabled5G = enabled5G;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public void setCameraPixel(int cameraPixel) {
            this.cameraPixel = cameraPixel;
        }

        public MobileBuilder build() {
            return this;
        }
    }
}
