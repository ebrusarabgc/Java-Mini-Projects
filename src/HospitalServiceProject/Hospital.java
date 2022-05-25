package HospitalServiceProject;

public class Hospital {
    public static void main(String[] args){
        int total_grade = 0;
        Patient p1, p2, p3;
        Service_1 service_1 = new Service_1();
        Service_2 service_2 = new Service_2();
        Service_3 service_3 = new Service_3();

        //Test Service 1: Total 40 point

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

        //****************************************************//
        if(service_1.size() == 10)
            total_grade += 4;
        if(service_1.getByPosition(0).getName() == "patient_10")
            total_grade += 2;
        if(service_1.getByPosition(1).getName() == "patient_1")
            total_grade += 2;
        if(service_1.getByPosition(2).getName() == "patient_5")
            total_grade += 2;
        if(service_1.getByPosition(3).getName() == "patient_8")
            total_grade += 2;
        if(service_1.getByPosition(4).getName() == "patient_3")
            total_grade += 2;
        if(service_1.getByPosition(5).getName() == "patient_2")
            total_grade += 2;
        if(service_1.getByPosition(6).getName() == "patient_4")
            total_grade += 2;
        if(service_1.getByPosition(7).getName() == "patient_6")
            total_grade += 2;
        if(service_1.getByPosition(8).getName() == "patient_7")
            total_grade += 2;
        if(service_1.getByPosition(9).getName() == "patient_9")
            total_grade += 2;
        //****************************************************//

        p1 = service_1.deleteByName("patient_9");
        //****************************************************//
        if(p1 != null && p1.getName() == "patient_9")
            total_grade += 4;
        //****************************************************//

        p2 = service_1.deleteByPosition(5);
        //****************************************************//
        if(p2 != null && p2.getName() == "patient_2")
            total_grade += 4;
        //****************************************************//

        p3 = service_1.deleteByPosition(0);
        //****************************************************//
        if(p3 != null && p3.getName() == "patient_10")
            total_grade += 4;
        //****************************************************//

        System.out.println("----------------After deletion Service 1 Patient Order----------------");
        service_1.print();
        //****************************************************//
        if(service_1.size() == 7)
            total_grade += 4;
        //****************************************************//

        System.out.println("****************************************************************************************************");
        System.out.println("After testing Service 1  total grade is " + total_grade);
        System.out.println("****************************************************************************************************");
        // End Test Service 1: Total 40 point

        // Test Service 2: Total 30 point
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
        //****************************************************//
        if(service_2.size() == 10)
            total_grade += 1;
        if(service_2.stack.getByPosition(0).getName() == "patient_20")
            total_grade += 2;
        if(service_2.stack.getByPosition(1).getName() == "patient_19")
            total_grade += 2;
        if(service_2.stack.getByPosition(2).getName() == "patient_18")
            total_grade += 2;
        if(service_2.stack.getByPosition(3).getName() == "patient_17")
            total_grade += 2;
        if(service_2.stack.getByPosition(4).getName() == "patient_16")
            total_grade += 2;
        if(service_2.stack.getByPosition(5).getName() == "patient_15")
            total_grade += 2;
        if(service_2.stack.getByPosition(6).getName() == "patient_14")
            total_grade += 2;
        if(service_2.stack.getByPosition(7).getName() == "patient_13")
            total_grade += 2;
        if(service_2.stack.getByPosition(8).getName() == "patient_12")
            total_grade += 2;
        if(service_2.stack.getByPosition(9).getName() == "patient_11")
            total_grade += 2;
        //****************************************************//

        p1 = service_2.pop();
        //****************************************************//
        if(p1 != null && p1.getName() == "patient_20")
            total_grade += 3;
        //****************************************************//

        p2 = service_2.pop();
        //****************************************************//
        if(p2 != null && p2.getName() == "patient_19")
            total_grade += 3;
        //****************************************************//

        p3 = service_2.pop();
        //****************************************************//
        if(p3 != null && p3.getName() == "patient_18")
            total_grade += 3;
        //****************************************************//

        System.out.println("----------------After pop Service 2 Patient Order----------------");
        service_2.stack.print();

        System.out.println("****************************************************************************************************");
        System.out.println("After testing Service 2 total grade is " + total_grade);
        System.out.println("****************************************************************************************************");
        // End Test Service 2: Total 30 point



        // Test Service 3: Total 30 point
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
        //****************************************************//
        if(service_3.size() == 10)
            total_grade += 1;
        if(service_3.queue.getByPosition(0).getName() == "patient_21")
            total_grade += 2;
        if(service_3.queue.getByPosition(1).getName() == "patient_22")
            total_grade += 2;
        if(service_3.queue.getByPosition(2).getName() == "patient_23")
            total_grade += 2;
        if(service_3.queue.getByPosition(3).getName() == "patient_24")
            total_grade += 2;
        if(service_3.queue.getByPosition(4).getName() == "patient_25")
            total_grade += 2;
        if(service_3.queue.getByPosition(5).getName() == "patient_26")
            total_grade += 2;
        if(service_3.queue.getByPosition(6).getName() == "patient_27")
            total_grade += 2;
        if(service_3.queue.getByPosition(7).getName() == "patient_28")
            total_grade += 2;
        if(service_3.queue.getByPosition(8).getName() == "patient_29")
            total_grade += 2;
        if(service_3.queue.getByPosition(9).getName() == "patient_30")
            total_grade += 2;
        //****************************************************//

        p1 = service_3.dequeue();
        //****************************************************//
        if(p1 != null && p1.getName() == "patient_21")
            total_grade += 3;
        //****************************************************//

        p2 = service_3.dequeue();
        //****************************************************//
        if(p2 != null && p2.getName() == "patient_22")
            total_grade += 3;
        //****************************************************//

        p3 = service_3.dequeue();
        //****************************************************//
        if(p3 != null && p3.getName() == "patient_23")
            total_grade += 3;
        //****************************************************//

        System.out.println("----------------After dequeue Service 3 Patient Order----------------");
        service_3.queue.print();

        System.out.println("****************************************************************************************************");
        System.out.println("After testing Service 3 total grade is " + total_grade);
        System.out.println("****************************************************************************************************");
        // End Test Service 3: Total 30 point


    }

}
