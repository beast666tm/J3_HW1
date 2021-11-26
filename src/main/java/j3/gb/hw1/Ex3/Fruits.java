package j3.gb.hw1.Ex3;

public abstract class Fruits {

    private final float weight;

    protected Fruits(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruits{");
        sb.append("weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
