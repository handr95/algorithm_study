package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택 - https://www.acmicpc.net/problem/10828
 * <p>
 * 문제
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * <p>
 * 명령은 총 다섯 가지이다.
 * <p>
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 입력
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * <p>
 * 출력
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 */
public class BasicUseIF {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                String command = br.readLine();
                command(stack, command, sb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
    }

    public static void command(Stack<Integer> stack, String command, StringBuilder stringBuilder) {
        int pushVal = 0;
        if (command.contains("push")) {
            String[] pushCommand = command.split(" ");
            pushVal = Integer.parseInt(pushCommand[1]);
            command = "push";
        }

        if (command.equals("push")) {
            stack.push(pushVal);
        } else if (command.equals("pop")) {
            if (stack.size() == 0) {
                stringBuilder.append(-1 + "\n");
            } else {
                stringBuilder.append(stack.pop() + "\n");
            }
        } else if (command.equals("size")) {
            stringBuilder.append(stack.size() + "\n");
        } else if (command.equals("empty")) {
            stringBuilder.append((stack.isEmpty() == true ? 1 : 0) + "\n");
        } else if (command.equals("top")) {
            if (stack.size() == 0) {
                stringBuilder.append(-1 + "\n");
            } else {
                stringBuilder.append(stack.peek() + "\n");
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
