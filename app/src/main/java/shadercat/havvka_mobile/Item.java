package shadercat.havvka_mobile;

//class for info of item (food)
public class Item {

    private String name;
    private String smallDescr;
    private String bigDescr;
    private int image;

    public Item(String name, String smallDescr, String bigDescr, int image)
    {
        this.name = name;
        this.smallDescr = smallDescr;
        this.bigDescr = bigDescr;
        this.image = image;
    }

    public String GetName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public String GetSmallDescr()
    {
        return smallDescr;
    }
    public void SetSmallDescr(String smallDescr)
    {
        this.smallDescr = smallDescr;
    }
    public String GetBigDescr()
    {
        return bigDescr;
    }
    public void SetBigDescr(String bigDescr)
    {
        this.bigDescr = bigDescr;
    }
    public int GetImage()
    {
        return image;
    }
    public void SetImage(int image)
    {
        this.image = image;
    }
}
