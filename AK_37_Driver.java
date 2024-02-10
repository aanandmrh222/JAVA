public class AK_37_Driver {
    public static void main(String[] args) {
        AK_36_Car myCar = new AK_36_Car();    // Object Creation using (new) word
        //  new AK_36_Car() -> Object   &    myCar -> address create, its store address of new AK_36_Car()
        //  AK_36_Car() -> Constructor
        // For accessing our class we use  -> myCar
        // Class is a blueprint; Objects are Real values

        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.currentFuel);
    }
}
