import java.lang.IndexOutOfBoundsException; 
public class LinkedListS {
    private Node first;
    private int size;
    public LinkedListS()
    {
        size = 0;
        first = null;	
    }

    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int get(int index) throws IndexOutOfBoundsException {
        Node temp= null;
        try { 
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }
        
        return temp.data;
    }
 
    // Retorna el tamaño actual de la lista
    public int size()
    {
        return this.size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index)
    {
        if(index == 0){
            Node nuevo = new Node(data);
            nuevo.next = first;
            first = nuevo;
            size++;
        }else if(index <= this.size && index >= 0){
            Node temp1 = first;
            for(int i = 0; i <= index-2; i++){
                temp1 = temp1.next;
            }
            Node temp2 = new Node(data);
            temp2.next = temp1.next;
            temp1.next = temp2;
            size++;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    // Borra el dato en la posición index
    public void remove(int index)
    {
        try {
            if (index == 0) {
                Node temp = first;
                first = temp.next;
                size--;
            } else if (index == size - 1) {
                Node temp = getNode(size - 2);
                temp.next = null;
                size--;
            } else {
                Node temp = getNode(index - 1);
                temp.next= temp.next.next;
                size--;
            }
        } catch (IndexOutOfBoundsException i) {
            System.out.println("¿De qué me hablas viejo?");
        }
    }

    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
        Node unNodo = first;
        while (unNodo != null){         
            if (unNodo.data == data){
                return true;
            }
            unNodo = unNodo.next;
            System.out.println("Está en la posición: "+unNodo);
        }
        return false;
    }

}