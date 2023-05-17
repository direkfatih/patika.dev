public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hababam" , "TRH" , "555");
        Teacher t2 = new Teacher("Graham Bell" , "FZK" , "000");
        Teacher t3 = new Teacher("Ömer Bilir" , "BIO" , "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik" , "102" , "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Bİyoloji", "101" , "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Arda Ekici", "123", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Mehmet Turan" , "444", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(20,60,37);
        s2.isPass();
    }
}