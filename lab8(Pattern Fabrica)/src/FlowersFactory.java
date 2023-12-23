public class FlowersFactory
{
    public static Flower createFlower(FlowerType flowerType, String color) {
        switch (flowerType) {
            case ROSE:
                return new Rose(color);
            case LILY:
                return new Lily(color);
            default:
                throw new IllegalArgumentException("Unknown flower type");
        }
    }
}
