public enum ClothingSize
{

    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    ClothingSize(int euroSize)
    {
        this.euroSize = euroSize;
    }

    public int getEuroSize()
    {
        return euroSize;
    }



    public String getDescription()
    {
        if (this == XXS)
        {
            return "(детский размер)";
        }
        else
        {
            return "(взрослый размер)";
        }
    }


}
