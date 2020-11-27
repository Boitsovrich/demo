package com.example.demo;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        this.pet = pet;
    }
    public void collYourPet(){
        System.out.println("Привет, мое любимый, питомец!");
        pet.say();
    }
}
