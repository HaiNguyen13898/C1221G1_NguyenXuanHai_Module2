package ss7_abstractClass_interface.thuc_hanh.animal_interfaceEdible;

public  class Chicken extends Animal implements Edible {
    @Override
     public String makeSound() {
        return "Cục ta cục tác";
    }

    @Override
    public String howToEat() {
        return "Dùng mỏ mổ";
    }
}
