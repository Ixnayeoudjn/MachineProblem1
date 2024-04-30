public class StacksImplementation {
int stackSize;
int[] stack;     
int topStack;

    public boolean stackChecker() {
        return (stack == null);
    }

    public boolean fullChecker() {
        return (topStack == stackSize - 1);
    }

    public boolean emptyChecker() {
        return (topStack == -1);
    }

    public void stackCreation (int size) {
        stackSize = size;
        stack = new int[size];
        topStack = -1;   
        System.out.println("Succesfully created a stack with a size of " + stackSize + "\n");
    }

    public void stackPush (int pushElement) {
        if (topStack < stackSize - 1) {
            stack[++topStack] = pushElement;
            System.out.println("Element successfully added to the stack");
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int stackPop() {
        System.out.println("Element successfully removed from the stack");
        return stack[topStack--];
    }

    public void changeElement(int original, int replace) {
        int stackElement = original, newElement = replace, i = 0; 
        
        if (stack[i] != stackElement) {
            System.out.println("Stack was successfully updated");
        }

        for (i = 0; i < stack.length; i++) {
            if (stack[i] == stackElement) {
                stack[i] = newElement;
                break;
            }
        }
    }

    public void printStack (int element) {
        
        int i = 0;
        for (i = topStack; i >= 0; i--) {
            if (element == stack[i]) {
                System.out.print("Element stored in stack " + (i+1) + ": " + stack[i] + "\n");
                break;
            }
        }
        if (i < 0) {
            System.out.print("Element not found \n");
        }
    }
}