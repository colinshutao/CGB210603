package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Component
@Data@NoArgsConstructor@AllArgsConstructor@Accessors(chain = true)
public class Dog {
    private Integer dogId;
    private String dogName;
    private String dogLike;
}
