package nested;

public class Parcel {

    private int xLength;
    private int yLength;
    private int zLength;

    public Parcel(int xLength,int yLength, int zLength){
        this.xLength=xLength;
        this.yLength=yLength;
        this.zLength=zLength;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parcel{");
        sb.append("xLength=").append(xLength);
        sb.append(", yLength=").append(yLength);
        sb.append(", zLength=").append(zLength);
        sb.append('}');
        return sb.toString();
    }
}
