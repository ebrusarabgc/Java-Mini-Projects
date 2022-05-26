package HospitalServiceProject;

public class Hospital {
    public static void main(String[] args){

        Service_1 service_1 = new Service_1();
        Service_2 service_2 = new Service_2();
        Service_3 service_3 = new Service_3();

        service_1.insert("patient_1");
        service_1.insert("patient_2");
        service_1.insert("patient_3", 1);
        service_1.insert("patient_4");
        service_1.insert("patient_5", 1);
        service_1.insert("patient_6");
        service_1.insert("patient_7");
        service_1.insert("patient_8", 2);
        service_1.insert("patient_9");
        service_1.insert("patient_10", 0);

        System.out.println("----------------Service 1 Patient Order----------------");
        service_1.print();

        service_1.deleteByName("patient_9");
        service_1.deleteByPosition(5);
        service_1.deleteByPosition(0);

        System.out.println("---------After deletion Service 1 Patient Order--------");
        service_1.print();

        service_2.push(new Patient("patient_11"));
        service_2.push(new Patient("patient_12"));
        service_2.push(new Patient("patient_13"));
        service_2.push(new Patient("patient_14"));
        service_2.push(new Patient("patient_15"));
        service_2.push(new Patient("patient_16"));
        service_2.push(new Patient("patient_17"));
        service_2.push(new Patient("patient_18"));
        service_2.push(new Patient("patient_19"));
        service_2.push(new Patient("patient_20"));

        System.out.println("----------------Service 2 Patient Order----------------");
        service_2.stack.print();

        service_2.pop();
        service_2.pop();
        service_2.pop();

        System.out.println("-----------After pop Service 2 Patient Order-----------");
        service_2.stack.print();

        service_3.enqueue(new Patient("patient_21"));
        service_3.enqueue(new Patient("patient_22"));
        service_3.enqueue(new Patient("patient_23"));
        service_3.enqueue(new Patient("patient_24"));
        service_3.enqueue(new Patient("patient_25"));
        service_3.enqueue(new Patient("patient_26"));
        service_3.enqueue(new Patient("patient_27"));
        service_3.enqueue(new Patient("patient_28"));
        service_3.enqueue(new Patient("patient_29"));
        service_3.enqueue(new Patient("patient_30"));

        System.out.println("----------------Service 3 Patient Order----------------");
        service_3.queue.print();

        service_3.dequeue();
        service_3.dequeue();
        service_3.dequeue();

        System.out.println("---------After dequeue Service 3 Patient Order---------");
        service_3.queue.print();
    }

}
