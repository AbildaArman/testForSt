public class Human1 extends User implements Librarian, Administrator {

    public Human1(String name) {
        super(name);
    }

    @Override
    public void overDueNotification() {
        System.out.println("Сообщил о просрочке клиенту");
    }

    @Override
    public void lendBook() {
        System.out.println("Отдал книгу клиенту");
    }

    @Override
    public void makeOrder() {
        System.out.println("Закал книги у поставщика");
    }
}
