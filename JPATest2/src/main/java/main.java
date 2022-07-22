import az.com.galactech.models.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory  factory = Persistence.createEntityManagerFactory("student");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Student student = manager.find(Student.class,1);
        student.setGrade(90);
        manager.merge(student);
       // manager.persist(Student.builder().id(2).name("zerqlem").surname("edilxanova").age(57).grade(100).build());
     //   manager.persist(Student.builder().id(6).name("jajjaa").surname("dfhgh").age(26).grade(85).build());
        manager.getTransaction().commit();
        manager.close();
    }
}
