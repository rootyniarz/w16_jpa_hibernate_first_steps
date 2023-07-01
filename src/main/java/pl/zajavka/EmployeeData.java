package pl.zajavka;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class EmployeeData {
    static Employee someEmployee1() {
        return Employee.builder()
                .name("Agnieszka")
                .surname("Pracownik")
                .salary(new BigDecimal("5910.73"))
                .since(OffsetDateTime.now())
                .build();
    }
    static Employee someEmployee2() {
        return Employee.builder()
                .name("Stefan")
                .surname("Nowacki")
                .salary(new BigDecimal("3455.12"))
                .since(OffsetDateTime.now())
                .build();
    }
    static Employee someEmployee3() {
        return Employee.builder()
                .name("Tomasz")
                .surname("Adamski")
                .salary(new BigDecimal("6112.42"))
                .since(OffsetDateTime.now())
                .build();
    }

}
