import java.util.*;

public class DesAlgo {
    public static void main(String ars[]) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int operation;

        do {
            System.out.println("-------------------------------------\n");
            System.out.println("Welcome to Data Structure Toolkit!\n");
            System.out.println("1 >> Array\n");
            System.out.println("2 >> Linked List\n");
            System.out.println("3 >> Stack\n");
            System.out.println("4 >> Queue\n");
            System.out.println("5 >> Binary Tree\n");
            System.out.println("6 >> Close the program");
            System.out.print(">> ");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.");
                sc.next();
                choice = -1;
            }
            System.out.println("\n-------------------------------------");
            
            switch (choice) {
                case 1:
                
                int[] array = null;
                int arraySize = 0;

                System.out.println("Array");
                do {

                System.out.println("-------------------------------------\n");
                System.out.print("Choose an Operation: \n");
                System.out.println("1 >> Create an Array");
                System.out.println("2 >> Insert an Element");
                System.out.println("3 >> Delete an Element");
                System.out.println("4 >> Search for an Element");
                System.out.println("5 >> Display an Array");
                System.out.println("6 >> Exit the program");
                System.out.println("0 >> Go back to the main menu");
                System.out.print(">> ");
                try {
                    operation = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input.");
                    sc.next();
                    operation = -1;
                }
                System.out.println("\n-------------------------------------");
                switch (operation) {
                    case 1:
                        System.out.print("Enter an array length: ");
                        arraySize = sc.nextInt();
                        array = new int[arraySize];
                        System.out.print("Succesfully created an array size of " + arraySize + "\n");
                        break;
                    case 2:
                        if (array != null) {
                           arrayInsertion(array, sc);
                           System.out.print("Elements inserted successfully.\n");
                        } else {
                           System.out.print("Array is not existing\n");
                        }
                        break;
                    case 3:
                       if (array != null) {
                        array = arrayDeletion(array, sc);
                        } else {
                           System.out.print("Array is not existing\n");
                        }
                        break;
                    case 4:
                        if (array != null) {
                            System.out.print("Enter the Element you want to search: ");
                            int searchIndex = sc.nextInt();
                            arraySearch(array, searchIndex);
                        } else {
                           System.out.print("Array is not existing\n");
                        }
                        break;
                    case 5:
                        if (array != null) {
                           System.out.print("Current Array:\n"+ Arrays.toString(array) + "\n");
                        } else {
                           System.out.print("Array is not existing\n");
                        }
                        break;
                    case 6:
                        System.out.println("Thank you, now closing the program...");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
                } while (operation != 0);
                break;

                case 2:
                int data = 0;
                LinkedListImplementation linkedList = new LinkedListImplementation();
                System.out.println("Linked List");
                do {

                System.out.println("-------------------------------------\n");
                System.out.print("Choose an Operation: \n");
                System.out.println("1 >> Create a Linked List");
                System.out.println("2 >> Insert an Element");
                System.out.println("3 >> Delete an Element");
                System.out.println("4 >> Search for an Element");
                System.out.println("5 >> Display a Linked List");
                System.out.println("6 >> Exit the program");
                System.out.println("0 >> Go back to the main menu");
                System.out.print(">> ");
                try {
                    operation = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input.");
                    sc.next();
                    operation = -1;
                }
                System.out.println("\n-------------------------------------");

                switch (operation) {
                    case 1:
                        System.out.println("Enter a number for the head: ");
                        data = sc.nextInt();
                        linkedList.create(data);
                        System.out.println("Successfully created a linked list");
                    break;
                    case 2:
                        if (linkedList.LinkedListChecker()) {
                           System.out.println("Linked List is not existing");
                        } else {
                           System.out.print("Enter the element you wish to add: ");
                           data = sc.nextInt();
                           linkedList.insert(data);
                           System.out.println("Nodes successfully added to the Linked List.");
                    }
                    break;

                    case 3:
                        if (linkedList.LinkedListChecker()) {
                        System.out.println("Linked List is not existing");
                        } else {
                           System.out.print("Enter the node you wish to delete: ");
                           data = sc.nextInt();
                           linkedList.delete(data);
                        } 
                        break;
                    case 4:
                        if (linkedList.LinkedListChecker()) {
                           System.out.println("Linked List is not existing");
                        } else {
                           System.out.print("Enter the node you wish to search: ");
                           data = sc.nextInt();
                           linkedList.search(data);
                        }
                        break;
                    case 5:
                        linkedList.print();
                        System.out.print("\n");
                    break;
                    case 6:
                        System.out.println("Thank you, now closing the program...");
                        System.exit(0);
                        break;
                    default:
                        break;
                }

                } while (operation != 0);
                break;

                case 3:
                StacksImplementation stack = new StacksImplementation();
                System.out.println("Stack");
                do {

                System.out.println("-------------------------------------\n");
                System.out.print("Choose an Operation: \n");
                System.out.println("1 >> Create a Stack");
                System.out.println("2 >> Push an Element");
                System.out.println("3 >> Pop an Element");
                System.out.println("4 >> Change an Element");
                System.out.println("5 >> Display Stack");
                System.out.println("6 >> Exit the program");
                System.out.println("0 >> Go back to the main menu");
                System.out.print(">> ");
                try {
                    operation = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input.");
                    sc.next();
                    operation = -1;
                }
                System.out.println("\n-------------------------------------");
                switch (operation) {
                    case 1:
                        System.out.print("Enter an Stack size: ");
                        data = sc.nextInt();
                        stack.stackCreation(data);
                        break;
                    case 2:
                        if (stack.stackChecker()) {
                            System.out.println("Stack is not existing");
                        } else {
                            System.out.print("Enter an element: ");
                            data = sc.nextInt();
                            stack.stackPush(data);
                        }
                        break;
                    case 3:
                        if (stack.stackChecker()) {
                            System.out.println("Stack is not existing");
                        } else {
                            if (stack.emptyChecker()) {
                                System.out.println("Stack underflow");
                                break;
                            } else {
                                stack.stackPop();
                            }
                        }
                        break;
                    case 4:
                        if (stack.stackChecker()) {
                            System.out.println("Stack is not existing");
                        } else {
                            System.out.println("Enter the element you want to replace: ");
                            int change = sc.nextInt();
                            System.out.print("Enter the new Element: ");
                            int newElement = sc.nextInt();
                            stack.changeElement(change, newElement);
                        }
                        break;
                    case 5:
                        if (stack.stackChecker()) {
                            System.out.println("Stack is not existing");
                        } else {
                            System.out.print("Enter the element you want to display: ");
                            data = sc.nextInt();
                            stack.printStack(data);
                        }
                        break;
                    case 6:
                        System.out.println("Thank you, now closing the program...");
                        System.exit(0);
                    default:
                        break;
                }
                } while (operation != 0);
                break;
                case 4:
                QueueImplementation queue = new QueueImplementation();
                System.out.println("Queue");
                do {
                System.out.println("-------------------------------------\n");
                System.out.print("Choose an Operation: \n");
                System.out.println("1 >> Create a Queue");
                System.out.println("2 >> Enqueue an Element");
                System.out.println("3 >> Dequeue an Element");
                System.out.println("4 >> Check Front");
                System.out.println("5 >> Check Rear");
                System.out.println("6 >> Display current Queue");
                System.out.println("7 >> Exit the program");
                System.out.println("0 >> Go back to the main menu");
                System.out.print(">> ");
                try { 
                    operation = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input.");
                    sc.next();
                    operation = -1;
                }
                System.out.println("\n-------------------------------------");
                switch (operation) {
                    case 1:
                        System.out.print("Enter an Queue size: ");
                        data = sc.nextInt();
                        queue.queueCreation(data);
                        break;
                    case 2:
                        if (queue.emptyChecker()) {
                            System.out.println("Queue is not existing");
                        } else if (queue.fullChecker()) {
                            System.out.println("Queue is full");
                        } else { 
                            System.out.print("Enter an element you wish to enqueue: ");
                            data = sc.nextInt();
                            queue.enqueue(data);
                        }
                        break;    
                    case 3:
                        if (queue.emptyChecker()) {
                            System.out.println("Queue is not existing");
                        } else {
                            queue.dequeue();
                        }
                        break;
                    case 4:
                        if (queue.emptyChecker()) {
                            System.out.println("Queue is not existing");
                        } else {
                            int front = queue.frontQueue();
                            System.out.println("Front Queue: " + front);
                        }
                        break;
                    case 5:
                        if (queue.emptyChecker()) {
                            System.out.println("Queue is not existing");
                        } else {
                            int rear = queue.rearQueue();
                            System.out.println("Rear Queue: " + rear);
                        }
                        break;
                    case 6:
                        if (queue.emptyChecker()) {
                            System.out.println("Queue is not existing");
                        } else {
                            queue.queuePrint();
                        }
                        break;
                    case 7:
                        System.out.println("Thank you, now closing the program...");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
                } while (operation != 0);
                break;
                case 5:
                BinarySearchTree tree = new BinarySearchTree();
                int treeSize = 0;
                System.out.println("Binary Tree");
                do {
                System.out.println("-------------------------------------\n");
                System.out.print("Choose an Operation: \n");
                System.out.println("1 >> Create an Empty Binary Tree");
                System.out.println("2 >> Insert Elements");
                System.out.println("3 >> Delete Elements");
                System.out.println("4 >> Display Binary Tree");
                System.out.println("5 >> Display Binary Tree Structure");
                System.out.println("6 >> Exit the Program");
                System.out.println("0 >> Go back to the main menu");
                System.out.print(">> ");
                try { 
                    operation = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input.");
                    sc.next();
                    operation = -1;
                }
                System.out.println("\n-------------------------------------");
                switch (operation) {
                    case 1:
                        System.out.print("Enter the number of nodes: ");
                        treeSize = sc.nextInt();
                        System.out.println("Successfully created tree with " + treeSize + " empty nodes");
                        break;
                    case 2:
                        for (int i = 0; i < treeSize; i++) {
                            System.out.print("Insert an element: ");
                            data = sc.nextInt();
                            tree.insertNode(new Nodee(data));
                        }
                        System.out.println("Successfully inserted all elements to the tree");
                        break;    
                    case 3:
                        System.out.print("Enter the node you wish to delete: ");
                        data = sc.nextInt();
                        tree.remove(data);
                        break;
                    case 4:
                        System.out.println("1 >> In-Order Traversal");
                        System.out.println("2 >> Pre-Order Traversal");
                        System.out.println("3 >> Post-Order Traversal");
                        System.out.print("Choose a Traversal Method: ");
                        data = sc.nextInt();
                        switch (data) {
                            case 1:
                                tree.inOrderDisplay();
                                System.out.println("");
                                break;
                            case 2:
                                tree.preOrderDisplay();
                                System.out.println("");
                                break;
                            case 3:
                                tree.postOrderDisplay();
                                System.out.println("");
                                break;
                            default:
                                break;
                        }
                        break;
                    case 5:
                        tree.treeStructure();
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("Thank you, now closing the program...");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
                } while (operation != 0);
                break;
                case 6:
                System.out.println("Thank you, now closing the program...");
                System.exit(0);
                default:
                break;
            }
    
        } while (choice != 6);

        sc.close();
    }

    private static int[] arrayInsertion (int[] arrayInsert, Scanner sc) {
        int i, elementValue;
        for (i = 0; i < arrayInsert.length; i++) {
            System.out.println("Enter a value for element " + (i+1));
            elementValue = sc.nextInt();
            arrayInsert[i] = elementValue;
        }
        return arrayInsert;

    }

    private static int[] arrayDeletion (int[] arrayDelete, Scanner sc) {
        int indexchoice;
        int i, k;
        int[] updatedArray = new int[arrayDelete.length - 1];
        System.out.print("Enter which Array Index Element you want to delete: ");
        indexchoice = sc.nextInt();

        if (indexchoice < 0 || indexchoice >= arrayDelete.length) {
            System.out.print("Invalid Input, No element was deleted.\n");
            return arrayDelete;
        }

            for (i = 0, k = 0; i < arrayDelete.length; i++) {
                if (i == indexchoice) {
                    continue;
                }
                updatedArray[k++] = arrayDelete[i];
            }

        System.out.print("Element deleted successfully.\n");
        return updatedArray;
    }

    private static void arraySearch(int[]arraySearch, int element) {

        int i = 0;
        for (i = 0; i < arraySearch.length; i++) {
            if (element == arraySearch[i]) {
                System.out.print("Element stored in index " + i + ": " + arraySearch[i] + "\n");
                break;
            }
        }
        if (i == arraySearch.length) {
            System.out.print("Element not found \n");
        }
    }
}