package vscode;

public class Main {
 
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
        for(int i=0;i<10;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}

