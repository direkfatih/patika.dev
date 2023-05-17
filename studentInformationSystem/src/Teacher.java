public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name, String branch, String mpNo){
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mpNo);
        System.out.println("Bölümü : " + this.branch);
    }
}
