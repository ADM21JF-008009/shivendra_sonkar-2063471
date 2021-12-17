import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();
    int sum=0;
	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}
	public void addToBasket(FruitBasket fbObj) {
		fruitBasketList.add(fbObj);
	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
	    sum=0;
        fruitBasketStream.forEach((k)->{
            sum+=(k.getPricePerKg()*k.getWeightInKgs());
        });
        return sum;
  	}

}
