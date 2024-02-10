 class Driver {

    static  int minAge = 18;
    String name;
    int age;
    String address;

    public boolean isAllowed() {
        return  this.age >= minAge;
    }



    public static void main(String[] args) {
//        AK_36_Car myCar = new AK_36_Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.currentFuel);

        Driver myDriver = new Driver();
        myDriver.name = "ABC";
        System.out.println(minAge);


    }
}
