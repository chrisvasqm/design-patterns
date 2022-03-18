package com.chrisvasqm.structural.proxy;

public class ProductProxy extends Product {
    private final DbContext context;

    public ProductProxy(int id, DbContext context) {
        super(id);
        this.context = context;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        context.markAsChanged(this);
    }
}
