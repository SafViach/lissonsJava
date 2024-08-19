package lesson016.dzTask2.model;

import java.util.Arrays;

public class PetList {
    private Pet[] pets = new Pet[5];
    private int index = 0;


    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public Pet[] getPets() {
        return pets;
    }

    public int getIndex() {
        return index;
    }
    public void add(Pet pet){
        if (index== pets.length) {
            pets = Arrays.copyOf(pets, index * 3 / 2 + 1);
        }
        pets[index++]=pet;
    }
    public Pet infoIndex(int index)throws ArrayIndexOutOfBoundsException{
        Pet pet = pets[index];
        return pet;
    }
    public void infoArray(){
        for (int i = 0; i < index; i++) {
            System.out.println(pets[i]);
        }
    }
    public Pet[] deletedIndex(int x){

        Pet[] newArr = new Pet[pets.length-1];
        System.arraycopy(pets,0,newArr,0,x);
        System.arraycopy(pets,x+1,newArr,x,pets.length-x-1);
        index--;
        return newArr;
    }

    @Override
    public String toString() {
        return "PetList{" +
                "pets=" + Arrays.toString(pets) +
                ", index=" + index +
                '}';
    }
}
