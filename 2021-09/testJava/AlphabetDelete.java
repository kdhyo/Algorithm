package testJava;

import java.util.Deque;
import java.util.ArrayDeque;

public class AlphabetDelete {
    public int solution(String s)
    {
        Deque<String> stack = new ArrayDeque<>();
        String[] arr = s.split("");
        final int SIZE = arr.length;
        for(var i = 0; i < SIZE; i++ ) {
            if(!stack.isEmpty() && arr[i].equals(stack.peekLast())) {
                stack.removeLast();
            } else {
                stack.add(arr[i]);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        var alphabet = new AlphabetDelete();

        System.out.println(alphabet.solution("cdcd"));
		System.out.println(alphabet.solution("baabaa"));
		System.out.println(alphabet.solution("a    a"));

    }
}
