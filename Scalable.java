public interface Scalable {

    double DEFAULT_SCALE = 1.0;

    public void setScale(double scale);

    // Java 9 feature Interface can have static methods too.
    public static boolean isScalable(Object obj) {
        return obj instanceof Scalable;
    }

    // Java 9 feature now Interface can default concrete methods too.
    public default void resetScale() {
        setScale(DEFAULT_SCALE);
    }
}