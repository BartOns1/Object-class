package Generics;

import java.util.*;

/**
 * Created by vdabcursist on 23/06/2017.
 */
public class CollectionMain {
    public static void main(String[] args){
        Set s1 = new TreeSet();

        s1.add("A");
        s1.add("Z");
        s1.add("K");

        for (int i=0; i<s1.size(); i++){
            System.out.println(s1);
        }

        Map<String, Integer>  m = new HashMap<>();//door <String, Integer> moet je geen type  cast (int) meer doen
        m.put("Bart",45);
        m.put("Farhood",26);
        int leeftijd = (int)m.get("Bart");
        //geeft leeftijd Bart
        //for(HashMap item: m)
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");

        items.set(1,"X");
        items.add(1,"X");

        for (int i = 0; i< items.size(); i++) {
            String s = (String) items.get(i);
            System.out.println(s);
        }

        items.remove((0));//alles schuift dan naar boven. Er kunnen geen gaten zijn in arraylist

        List r = new ArrayList();
        r.add("Z");
        r.add("C");
        items.retainAll(r);

        Boolean b = items.contains(r.get(1));


        Cat[] cats = new Cat[3];
        String kat;
        Dog[] dogs = new Dog[10];
        //for(int i=0; i<10;i++){
         //   kat = "mousli"+1+i;
         //   cats[i] = new Cat(kat, 9);
        //}
        Cat temp = new Cat("temp",9);
        try {
            //Er worden 3 katten opgenomen in het assiel
            temp.setName("OverloadKat");

            cats[0] = new Cat("Tom", 5);
            cats[1] = new Cat("Mimi", 9);
            cats[2] = new Cat("Garfield", 9);
            //cats[3] = temp;
            System.out.println(temp.equals(cats[2]));
            // kan ook als volgt
            //Cat[] cats = new Cat[]{
            // new Cat("Tom",5),
            // new Cat("Mimi",4),
            // new Cat("Garfield",9)
            // }

        for (Cat cat : cats) {
            System.out.printf("Dag %s\n", cat.getName());
        }

    } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Sorry, There is no room for the cat %s\n",temp.getName());




        }


        List cats2 = new LinkedList();
            cats2.add(new Cat("Tom",2));
            cats2.add(new Cat("lissy",2));
            cats2.add(new Cat("Garfield",2));
            cats2.add(new Cat("Willy",3));


        for (int i = 0; i<cats2.size(); i++){
            Cat c = (Cat) cats2.get(i);
            System.out.printf("Dag %s\n",c.getName() );
        }

        Set cats3 = new HashSet();
        cats3.add(new Cat("Tom",2));
        cats3.add(new Cat("lissy",2));
        cats3.add(new Cat("Garfield",2));
        cats3.add(new Cat("Willy",3));
        System.out.println(cats);
        System.out.println(cats2);
        System.out.println(cats3);
        for (Object o : cats3) {
            System.out.printf("Dag %s\n",o.toString() );
        }

        Set cats4 = new TreeSet();
        cats4.add(new Cat("Tom",2));
        cats4.add(new Cat("lissy",6));
        cats4.add(new Cat("Garfield",2));
        cats4.add(new Cat("Willy",3));




    }

}

