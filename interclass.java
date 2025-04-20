class cdu {

    class sunstone {

        class btech {
            btech bt= new btech();

            void display1() {
                System.out.println("it is btech class");
            }
        }

        sunstone ss= new sunstone();

        void display2() {
            System.out.println("it is sunstone");
        }
    }

    void display() {
        System.out.println("it is university");

    }
}

class interclass{
    public static void main(String[] args){

        cdu cd=new cdu();
        cd.display();
    }
}