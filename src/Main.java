public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());


        String stringData = "5 3 7 2 9 0 1 4 8 6";
//        String stringData = "Valledupar Colombia Denver Colorado Miami NewYork Colombia Alabama Zurich";
        String[] data = stringData.split(" ");
        for(String s: data){
            //create new item with value set to the string s.
            tree.addItem(new Node(s));
        }
          tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());




    }
}
