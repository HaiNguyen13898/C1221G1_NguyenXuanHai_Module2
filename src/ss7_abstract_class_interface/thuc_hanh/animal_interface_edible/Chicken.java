package ss7_abstract_class_interface.thuc_hanh.animal_interface_edible;

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
