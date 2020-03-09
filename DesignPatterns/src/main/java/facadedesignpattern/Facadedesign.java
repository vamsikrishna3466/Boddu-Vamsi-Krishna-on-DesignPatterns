package facadedesignpattern;

public class Facadedesign {
public int objectCreation(String nameofhotel)
{
	Expresso expressoobject=new Expresso();
	Kfc kfcobject=new Kfc();
	if(nameofhotel.equalsIgnoreCase("expresso"))
	{
		expressoobject.message();
		expressoobject.price();
	}
	else if(nameofhotel.equalsIgnoreCase("kfc"))
	{
		kfcobject.message();
		kfcobject.price();
	}
	else
	{
		return 0;
	}
	return 1;
}

}
