/*
1. An ordered collection (also known as a sequence).
2. Allows duplicate elements.
3. Elements can be accessed by their integer index.
4. Maintains the insertion order of elements
 */

import java.util.ArrayList;

public class AK_71_ListInterface {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Aanand");
        strList.add("Kumar");
        System.out.println(strList.get(0));
        System.out.println(strList.get(1));

        strList.add(0, "Mr.");

        for(int i=0; i<strList.size(); i++) {
            System.out.println(strList.get(i));
        }

//        strList.remove(0);
//        strList.remove("Mr.");
//        System.out.println(strList.get(0));

        strList.set(1, "Ayush");
        System.out.println(strList.get(1));

//        strList.clear();
        System.out.println(strList.get(2));

        if(strList.contains("Kumar")) {
            System.out.println(strList.indexOf("Kumar"));
        }
        else {
            System.out.println("Kumar not present in list");
        }

        System.out.println("--");
        for(String str : strList) {
            System.out.println(str);
        }

        System.out.println("--");
        AK_71_UtilityClass.print(strList);

    }
}
