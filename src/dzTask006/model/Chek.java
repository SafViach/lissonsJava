package dzTask006.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Chek {
    private List<ProductPurchase> productPurchases = new ArrayList<>();

    public void add(ProductPurchase productPurchase){
        productPurchases.add(productPurchase);
    }
    public int size(){
       return productPurchases.size();
    }
    public ProductPurchase indexList(Integer index){
        return productPurchases.get(index);
    }
    public void print(){
        for (ProductPurchase productPurchase : productPurchases) {
            System.out.println(productPurchase.toFileLine());
        }
    }
    public double calcPriceProduct(Integer index){
            return productPurchases.get(index).getProduct().calcPriceDiscond()*productPurchases.get(index).getKol();
    }
    public List<ProductPurchase> loadFromToFile( String nameFile){
        try(BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String fileLine = null;
            while ((fileLine = br.readLine())!=null){
                String[] arrFileLine = fileLine.trim().split(" ");//["Product","Milk","2.5","2"]
                String nameClass = arrFileLine[0];
                String name = arrFileLine[1];
                double price = Double.valueOf(arrFileLine[2]);
                int kol = Integer.valueOf(arrFileLine[3]);
                switch (nameClass){
                    case "Product":
                        productPurchases.add(new ProductPurchase(new Product(name,price),kol));
                        break;
                    case "Product10":
                        productPurchases.add(new ProductPurchase(new Product10(name,price),kol));
                        break;
                    case "Product25":
                        productPurchases.add(new ProductPurchase(new Product25(name,price),kol));
                        break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productPurchases;
    }
    public void saveToFileChek(String nameFile){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))){
            int index = 0;
            int kolProduct = 0;
            double sumPriceProducts=0;
            int index2=0;
            for (ProductPurchase productPurchase : productPurchases) {
                bw.write(productPurchase.toFileLine()+" сумма = "+calcPriceProduct(index++) +"\n");
                kolProduct += productPurchase.getKol();
                sumPriceProducts+=calcPriceProduct(index2++);
            }
            bw.write("Кол позиций:"+index+"\n"+"Кол товаров:"+ kolProduct+"\n"+"Итог оплаты:"+sumPriceProducts+"\n"+
                                "СПАСИБО ЗА ПОКУПКУ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
