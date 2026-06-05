
class Node{
    int key,value;
    Node prev,next;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class LRUCache {
    int capacity;
    Map<Integer,Node> map;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public void addNode(Node node){
        Node temp=head.next;
        head.next=node;
        node.prev=head;

        node.next=temp;
        temp.prev=node;
    }
    public  void deleteNode(Node node){
            Node prevNode=node.prev;
            Node nextNode=node.next;
            prevNode.next=nextNode;
            nextNode.prev=prevNode;
    }
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        deleteNode(node);
        addNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
         if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            deleteNode(node);
            addNode(node);
        }
        else{
            if(map.size()==capacity){
                Node delete=tail.prev;
                deleteNode(delete);
                map.remove(delete.key);
            }
         Node newNode=new Node(key,value);
         map.put(key,newNode);
            addNode(newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */