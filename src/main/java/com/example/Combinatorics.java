/*package com.example;

    public class Greeting {
        public static void sayHi() {
            System.out.println("Hi!");
    }
}
*/
package com.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Combinatorics {

    public static void combSout(int n) {
        int tmp = n, count = 1;

        Set<String> set = new LinkedHashSet<>();

        System.out.println("n=" + n);
        for (int l = (tmp / 10) + 1; l > 0; l--) {
            for (int k = (tmp / 5) + 1; k > 0; k--) {
                for (int j = (tmp / 2) + 1; j > 0; j--) {
                    for (int i = tmp + 1; i > 0; i--) {
                        if (i == n) {
                            set.add(i + " по 1л");
                        }
                        if ((j * 2) == n) {

                            set.add(j + " по 2л");
                        }
                        if (((j * 2) + i) == n) {
                            set.add(j + " по 2л + " + i + " по 1л");
                        }
                        if ((k * 5) == n) {
                            set.add(k + " по 5л");
                        }
                        if ((k * 5) + i == n) {
                            set.add(k + " по 5л + " + i + " по 1л");
                        }
                        if ((k * 5 + (j * 2)) == n) {
                            set.add(k + " по 5л + " + j + " по 2л");
                        }
                        if ((k * 5 + (j * 2) + i) == n) {
                            set.add(k + " по 5л + " + j + " по 2л + " + i + " по 1л");
                        }
                        if ((l * 10) == n) {
                            set.add(l + " по 10л");
                        }
                        if ((l * 10 + i) == n) {
                            set.add(l + " по 10л + " + i + " по 1л");
                        }
                        if ((l * 10 + (j * 2)) == n) {
                            set.add(l + " по 10л + " + j + " по 2л");
                        }
                        if ((l * 10 + (k * 5)) == n) {
                            set.add(l + " по 10л + " + k + " по 5л");
                        }
                        if (((l * 10) + (j * 2) + i) == n) {
                            set.add(l + " по 10л + " + j + " по 2л + " + i + " по 1л");
                        }
                        if ((l * 10 + ((k * 5) + (j * 2))) == n) {
                            set.add(l + " по 10л + " + k + " по 5л + " + j + " по 2л");
                        }
                        if ((l * 10 + ((k * 5) + (j * 2)) + i) == n) {
                            set.add(l + " по 10л + " + k + " по 5л + " + j + " по 2л + " + i + " по 1л");
                        }
                    }
                }
            }
        }
        for (String s :
                set) {
            System.out.println("\t" + count + ") " + s);
            count++;
        }
        System.out.println("\nИтого, при n=" + n + " наш ответ будет " + (count - 1) + ".");
    }


}

