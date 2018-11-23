# Spring DAO Support examples

## How is it used in example

- [JdbcPersonDAO](SpringDAOSupportExample/src/main/java/com/vipul/dao/JdbcPersonDAO.java) - Example of JdbcTemplate DAO
- [HibernatePersonDAO](SpringDAOSupportExample/src/main/java/com/vipul/dao/HibernatePersonDAO.java) - Example of Hibernate DAO
- [IPersonJPARepository](SpringDAOSupportExample/src/main/java/com/vipul/repository/IPersonJPARepository.java) - Example of JPA Repository interface extending Spring JpaRepository
- [PersonJPARepository](SpringDAOSupportExample/src/main/java/com/vipul/repository/PersonJPARepository.java) - Example of JPA Repository class with Entity Manager autowired
- [PersonService](SpringDAOSupportExample/src/main/java/com/vipul/service/PersonService.java) - Service calling all DAOs for differnt purposes.

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log and relate it with PersonService logging statements.
