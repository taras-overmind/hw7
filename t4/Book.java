package com.taras.t4;

public class Book implements IItem, IDiscount, IPromocode {
    public void setPrice(double price) { }
    public void applyDiscount(String discount) { }
    public void applyPromocode(String promocode) { }
}
