package tn.usousse.eniso.ia1.stage.example.presentation;

import tn.usousse.eniso.ia1.stage.example.model.Node;
import tn.usousse.eniso.ia1.stage.example.model.Table;
import tn.usousse.eniso.ia1.stage.example.service.Service;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        Service service = new Service(table);
        boolean t = service.add("jihed");
        System.out.println(t);
        System.out.println(service.exists("ahmed",table));
        boolean t1 =service.remove("ahmed");
        System.out.println(service.add("ahmed"));
        System.out.println(t1);
        service.add("eya");
        service.add("mohsen");
        service.add("ali");

        System.out.println(service.add("testes"));

        Table hashtable = service.list();
        Node[] nodes = hashtable.getNodes();
        for(int i = 0; i<nodes.length; i++){
            Node linkedList = nodes[i];
            System.out.print ("Index " + i + ": ");
            while(linkedList !=null){
                System.out.print(linkedList.getValue() + "--->" );
                linkedList = linkedList.getNext();
            }
            System.out.print("null");
            System.out.println();
        }

    }
}