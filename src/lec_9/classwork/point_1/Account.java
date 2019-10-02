package lec_9.classwork.point_1;

public class Account<T, E, D extends Nationality> {
    private T id;
    private E iban;
    private D person;

    public Account(T id, E iban, D person) {
        this.id = id;
        this.iban = iban;
        this.person = person;
    }

    public D getPerson() {
        return person;
    }

    public void setPerson(D person) {
        this.person = person;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public E getIban() {
        return iban;
    }

    public void setIban(E iban) {
        this.iban = iban;
    }

    public static void main(String[] args) {
        Belorus belorus = new Belorus("belorus");
        Russian russian = new Russian("russian");

        Account<Integer, String, Nationality> account_1 = new Account<>(123, "#344", belorus);
        Account<Integer, String, Belorus> account_2 = new Account<>(123, "#344", belorus);
        Account<String, String, Russian> account_3 = new Account<>("123", "#344", russian);

        boolean isEquals = isEquals(account_1, account_2);

        System.out.println("account_1 == account_2: " + isEquals);
    }

    private static boolean isEquals(
            Account<Integer, String, ? extends Nationality> account_1,
            Account<Integer, String, ? extends Nationality> account_2
    ) {
        return account_1.getId().equals(account_2.getId());
    }

    public <C> void showType(C type) {
        System.out.println(type.getClass().getName());
    }
}
