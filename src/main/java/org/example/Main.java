package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");

        EntityManager em =  emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            //일대다 단방향
            /*Member member = new Member();
            member.setUsername("member1");

            em.persist(member);

            Team team = new Team();
            team.setTeamname("TeamA");

            team.getMembers().add(member);

            em.persist(team);*/

            tx.commit();

        } catch (Exception ex) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}