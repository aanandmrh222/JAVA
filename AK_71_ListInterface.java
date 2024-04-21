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


    }
}
