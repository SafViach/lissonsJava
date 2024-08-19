package lesson011.task4;

import lesson011.task4.model.*;

public class Main {
    public static void main(String[] args) {
        Producer[] producers ={
                new Producer("Slavia"),
                new Producer("Ziko"),
                new Producer("Sokolov"),
                new Producer("Kristal")
        };

        Jewellery[] jewelleries ={
                new Ring(123,producers[1], 2.5, Material.PLATINUM, 17),
                new Earrings(345, producers[0], 1.3, Material.GOLD),
                new Necklace(567, producers[2], 2.1, Material.SILVER)
        };

        for (Jewellery jewellery : jewelleries) {
            System.out.println(jewellery);
        }

    }
}
