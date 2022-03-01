package ss11_dsa_stack_queue.bai_tap;

import java.util.Stack;

public class ArrayReverse {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        String [] elements = new String[3];
        elements[0] = myStack.push("Hải ngốc nghếch");
        elements[1] = myStack.push("Hữu idol");
        elements[2] = myStack.push("Long đẹp trai");

        for (String integers :elements){
            System.out.print(integers+" ");
        }
        System.out.println();
        elements[0] = myStack.pop();
        elements[2] = myStack.push("Hải ngốc nghếch");

        for (String integers :elements){
            System.out.print(integers+" ");
        }
    }
}
