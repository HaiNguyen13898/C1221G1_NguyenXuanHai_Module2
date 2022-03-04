package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String string = scanner.nextLine();
        TreeMap <Character, Integer> treeMap = new TreeMap<>();
        string = string.toLowerCase();
        char character;
        for (int i = 0; i < string.length() ; i++) {
            character = string.charAt(i);
            if ( treeMap.containsKey(character)) {
                treeMap.replace(character, treeMap.get(character) + 1);
            } else  {
                treeMap.put(character, 1);
            }
        }
        Set<Character> keySet = treeMap.keySet();
        for (char key : keySet){
            System.out.println(key + " - " + treeMap.get(key));
        }

    }
}
