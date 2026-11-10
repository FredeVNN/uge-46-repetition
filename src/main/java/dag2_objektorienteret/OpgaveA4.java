package dag2_objektorienteret;

import java.util.ArrayList;

public class OpgaveA4 {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.remove(1);
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(30));
        System.out.println(numbers);
    }
}
//svar
//[10, 30, 40]

//[10, 40]