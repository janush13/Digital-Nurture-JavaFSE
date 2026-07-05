package com.library.comparison;

public class HibernateComparison {

    /*
     * Hibernate Example
     *
     * Session session = factory.openSession();
     * Transaction tx = session.beginTransaction();
     *
     * Integer employeeID = (Integer) session.save(employee);
     *
     * tx.commit();
     * session.close();
     *
     * This code demonstrates the traditional Hibernate approach,
     * where the developer manually manages:
     *  - Session
     *  - Transaction
     *  - Commit
     *  - Close
     *
     * In Spring Data JPA, all of this is simplified to:
     *
     * employeeRepository.save(employee);
     *
     */
}