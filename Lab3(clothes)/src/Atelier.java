public class Atelier
{
    public void dressWoman(Womans_clother[] femaleClothes)
    {
    System.out.println("Одежда для женщины:");
        for(int i=0; i<femaleClothes.length; i++)
        {
            femaleClothes[i].dressWoman();
        }
    }
    void dressMan(Mens_clother[] maleClothes)
    {
        System.out.println("Одежда для мужчины:");
        for(int i=0; i<maleClothes.length; i++)
        {
            maleClothes[i].dressMan();
        }
    }




}
