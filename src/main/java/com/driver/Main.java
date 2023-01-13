package com.driver;

public class Main {
    public void main(String[] args) {
        Product p = new Product();
        int prod1 = p.product(2, 3);
        int prod2 = p.product(2, 3, 4);
        double prod3 = p.product(5, 6);
    }
    class Product{
        public int product(int x, int y){
            return x * y;
        }

        public int product(int x, int y, int z){
            return x * y * z;
        }

        public double product(double x, double y){
            return x * y;
        }
    }
}

