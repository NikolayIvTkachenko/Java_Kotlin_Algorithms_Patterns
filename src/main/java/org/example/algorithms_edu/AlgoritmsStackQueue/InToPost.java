package org.example.algorithms_edu.AlgoritmsStackQueue;

public class InToPost {

    private StackCharX theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new StackCharX(stackSize);
    }

    public String doTrans() {
        for(int j=0; j<input.length(); j++) {
            char ch = input.charAt(j);
            theStack.displayStack("For " +ch+ " ");
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }

        while(!theStack.isEmpty()) {
            theStack.displayStack("While ");
            output = output + theStack.pop();
        }
        theStack.displayStack("End ");
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while(!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if(opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if(opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if(prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output =output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while(!theStack.isEmpty()) {
            char chx = theStack.pop();
            if(chx == '(')
                break;
            else
                output = output + chx;
        }
    }

}
