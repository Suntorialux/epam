package by.gsu.epamlab;

import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase {

    private int priceDiscount;

    public PriceDiscountPurchase() {
    	super();
        this.priceDiscount = 0;
    }

    public PriceDiscountPurchase(String commodityName, int price, int numberUnits, int priceDiscount) {
        super(commodityName, price, numberUnits);
        this.priceDiscount = priceDiscount;
    }

    public PriceDiscountPurchase(Scanner scanner) {
        super(scanner);
        this.priceDiscount = scanner.nextInt();
    }

    public int getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(int priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    @Override
    public int getCost() {
        int cost=(getPrice()-priceDiscount)*getNumberUnits();
        return cost;
    }

	@Override
	protected String fieldsToString() {
		// TODO Auto-generated method stub
		return super.fieldsToString()+";"+priceDiscount;
	}
}
