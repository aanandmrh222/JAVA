/*
1. The super keyword refers to superclass (parent) objects.
2. It is used to call superclass methods, and to access the superclass constructor.
3. The most common use of the super keyword is to eliminate the confusion between
   superclasses and subclasses that have methods with the same name.
 */

class Aa{    // Superclass (parent)
    Aa(){    //a1
        System.out.println("From A Constructor");
    }
    public void A1(){    //a1
        System.out.println("From A method");
    }

    public void A2(int n){    //a2
        System.out.println("From A method int");
    }
}

class Bb extends Aa{    // Subclass (child)
    Bb(){    //B1
        super();
        System.out.println("From B Constructor");
    }
    public void B1(){    //B1
    super.A1();
        System.out.println("From B method");
    }

    public void B2(int n){    //B2
        super.A2(n);
        System.out.println("From B method int");
    }
}
public class AK_40_SuperKeyword {
    public static void main(String[] args) {
        Bb b = new Bb();
        b.B1();
        b.B2(5);
    }
}
