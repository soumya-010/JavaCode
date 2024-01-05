import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Soumya");
        stack.push("Shubham");
        stack.push("Raj");
        stack.push("Rahul");

        System.out.println(stack.size()); // Returns the size of the stack
        System.out.println(stack.peek()); // Returns the top element
        System.out.println(stack.pop()); // Removes the top element
    }
}
