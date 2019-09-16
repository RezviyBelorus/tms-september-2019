package lec_3.point_2;

public class AbstractClassExampleMain {
    public static void main(String[] args) {
        AbstractClassExample ivan = new AbstractClassExample("Ivan", 20) {
            @Override
            public void incrementAge() {
                Integer age = this.getAge(); //0
                this.setAge(++age);
            }

            public void sayHi() {
                System.out.println("Hi");
            }
        };

        ivan.incrementAge();
        ivan.showAge();

        AbstractClassExample egor = new AbstractClassExample("Egor", 30) {
            @Override
            public void incrementAge() {
                Integer age = this.getAge(); //0
                this.setAge(age + 2);
            }
        };

        egor.incrementAge();
        egor.showAge();
    }
}