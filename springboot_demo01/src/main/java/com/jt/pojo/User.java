package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
@Data@NoArgsConstructor@AllArgsConstructor@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String name;

    void add() {
        User u1 = new User();
        u1.setId(111).setName("xiaoming");
    }
}