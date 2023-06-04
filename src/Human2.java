public class Human2 extends User implements Reader, Supplier {

    public Human2(String name) {
        super(name);
    }

    @Override
    public void takeBook() {
        System.out.println("Взял книгу у администратора");
    }

    @Override
    public void retakeBook() {
        System.out.println("Вернул книгу администратору");
    }

    @Override
    public void bringBook() {
        System.out.println("Отдал заказанные книги библиотекарю");
    }
}
