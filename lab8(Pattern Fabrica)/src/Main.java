import java.util.ArrayList;
import java.util.List;
public class Main
{
    public static void main(String[] args)
    {
        List<Flower> bouquet = new ArrayList<>();

            bouquet.add(FlowersFactory.createFlower(FlowerType.ROSE, "красная"));
            bouquet.add(FlowersFactory.createFlower(FlowerType.ROSE, "белая"));
            bouquet.add(FlowersFactory.createFlower(FlowerType.LILY, "желтая"));

        System.out.print("В букет входят: ");
        for (Flower flower : bouquet) {
            System.out.print(flower.getName() + " ");
        }
    }
}