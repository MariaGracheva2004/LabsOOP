public class Main
{
    public static void main(String[] args)
    {

        T_shirt tShirtW = new T_shirt(ClothingSize.L, "красная", 2100);
        Trousers trousersW = new Trousers(ClothingSize.XXS, "белые", 4100);
        Skirt skirtW = new Skirt(ClothingSize.S, "зеленая", 1700);


        T_shirt tShirtM = new T_shirt(ClothingSize.L, "черная", 1800);
        Trousers trousersM = new Trousers(ClothingSize.M, "синие", 3100);
        Tie tieM = new Tie(ClothingSize.XS, "белый",1200);

        Womans_clother[] femaleClothes = {tShirtW, trousersW, skirtW};
        Mens_clother[] maleClothes = {tShirtM, trousersM, tieM};


        Atelier atelier = new Atelier();
        atelier.dressWoman(femaleClothes);
        atelier.dressMan(maleClothes);
    }
}