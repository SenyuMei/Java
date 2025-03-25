public class Prueba {
    public static void main (String[] args) {
    LinkedList<String> linkedList1 = new LinkedList<String>();
    
    linkedList1.push("Cola de la lista");
    linkedList1.push("A");
    linkedList1.push("B");
    linkedList1.push("C");
    
    System.out.println(linkedList1 + "\nComo podemos comprobar cuando utilizanos push se añaden elementos a la cola de la lista");
    
    linkedList1.poll();
    
    System.out.println(linkedList1 + "\nY pop eliminar el primero que este en la lista");
    System.out.println("_____________________\n");
    
    LinkedList<String> linkedList2 = new LinkedList<String>();
    
    linkedList2.offer("Cola de la lista");
    linkedList2.offer("A");
    linkedList2.offer("B");
    linkedList2.offer("C");
    
    System.out.println(linkedList2 + "\nSin embargo offer lo que hace es añadirlo despúes de la cola");
    System.out.println("_____________________\n");
    
    LinkedList<String> linkedList3 = new LinkedList<String>();
    
    linkedList3.offer("Cola de la lista");
    linkedList3.offer("A");
    linkedList3.offer("B");
    linkedList3.offer("C");
    linkedList3.add(2, "Peak");
    
    
    System.out.println(linkedList3 + "\nCon la funcion add podemos añadir lo que queramos en la posicion que deseemos\n");
    
    
    linkedList3.remove("B");
    System.out.println(linkedList3 + "\nCon la funcion remove podemos escoger un elemento en la lista para eliminar");
    System.out.println("_____________________\n");
    
    System.out.println("Si quisieramos buscar un elemento de nuestra lista podemos usar indexOf y java se encarga de infomarte de su posicion");
    LinkedList<String> linkedList4 = new LinkedList<String>();
    
    linkedList4.offer("Cola de la lista");
    linkedList4.offer("A");
    linkedList4.offer("B");
    linkedList4.offer("C");
    linkedList4.add(2, "Peak");
    
    System.out.println(linkedList4.indexOf("Peak") + " es la posición de Peak");
    System.out.println("De otra manera para ver la primera o ultima posicion de nuestra lista podemos usar .peekFirst() o .peekLast()");
    System.out.println("(" + linkedList4.peekFirst() + ")" + " contenido de la primera possicón " + "(" + linkedList4.peekLast() + ")" + " elemento de la última posición");
    System.out.println("_____________________\n");
            
    System.out.println("Si quisieramos añadir algunos elementos solo a la primera y última posición podemos usar .addLast o .addFirst");
    LinkedList<String> linkedList5 = new LinkedList<String>();
    
    linkedList5.offer("1");
    linkedList5.offer("2");
    linkedList5.offer("3");
    linkedList5.offer("4");
    linkedList5.addLast("5");
    linkedList5.addFirst("0");

    System.out.println("(" + linkedList5.peekFirst() + ")" + " contenido de la primera possicón " + "(" + linkedList5.peekLast() + ")" + " elemento de la última posición, siendo 0 y 5 añadidos con las funciones .add");
    System.out.println(linkedList5);
    System.out.println("_____________________\n");
    
    }
}
