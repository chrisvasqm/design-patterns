package com.chrisvasqm.exercises_part1.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public Iterator<Product> createIterator() {
        return new CollectionIterator(this);
    }

    public static class CollectionIterator implements Iterator<Product> {
        private final ProductCollection collection;
        private int index;

        public CollectionIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return (index < collection.products.size());
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
