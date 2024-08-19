package task4;

import task4.model.*;

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

        Ring ring1 = (Ring) jewelleries[0];//создается не объект копия а вторая ссылка на тот же обект

        Ring ring2 = new Ring(123,producers[1], 2.5, Material.PLATINUM, 17 );

        Ring ring3 = new Ring(ring2.getArticle(), ring2.getProducer(), ring2.getWeight(),
                ring2.getMaterial(), ring2.getSize());

        //конструктор копирования - конструктор который должен проинициализировать поля создаваемого
        //объекта на основе объекта переданного в этот конструктор
        //поверхностное - объект копия не создает копии составляющих его объектов(Producer)
        //глубокое - объект копия для каждого сложного поля внутри себя создает отдельную копию
        Ring ring4 = new Ring(ring2);
        Ring ring5 = new Ring((Ring) jewelleries[0]);



    }
}
