public class Vector {
    private double x, y, z;

    public Vector(){}

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    // phép cộng vector với vector
    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    // phép trừ vector với vector
    public Vector subtract(Vector v) {
        return new Vector(x - v.x, y - v.y, z - v.z);
    }

    // phép nhân vector với hệ số 
    public Vector scalarMultiply(double k) {
        return new Vector(x * k, y * k, z * k);
    }

    // phép nhân vô hướng của 2 vector
    public double dotProduct(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }
}
