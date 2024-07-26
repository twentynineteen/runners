package dev.danmills.runners.Run;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunRepositoryTest {
   InMemoryRunRepository repository;

   @BeforeEach
   void setUp() {
      repository = new InMemoryRunRepository();
      repository.create(new Run(1, 
               "Monday Run",
               LocalDateTime.now(),
               LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
               3,
               Location.INDOOR));
   }

   @Test
   void testCount() {
      assertEquals(1, repository.findAll().size());
   }

   @Test
   void testCreate() {

   }

   @Test
   void testDelete() {

   }

   @Test
   void testFindAll() {

   }

   @Test
   void testFindById() {

   }

   @Test
   void testFindByLocation() {

   }

   @Test
   void testSaveAll() {

   }

   @Test
   void testUpdate() {

   }
}
