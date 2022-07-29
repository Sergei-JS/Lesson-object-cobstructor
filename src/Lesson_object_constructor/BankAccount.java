package Lesson_object_constructor;

public class BankAccount {
    int id;
    double balance=100;

  void popolnenieScheta(double summaPopolneniya) {
      System.out.println("Сумма до пополнения: "+ balance);
      balance += summaPopolneniya;
      System.out.println("Сумма после пополнения: "+ balance);
    }
}

class  Test {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount ();
        MyAccount.popolnenieScheta(50);

    }
}





