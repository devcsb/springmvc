package hello.springmvc.basic;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HelloData {
    private String username;
    private int age;
}
