package com.example.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    @Qualifier("com")
  private  Computer computer;
    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }



    public void build(){
        System.out.println("working on a project test");
      computer.project();
       computer.set();
    }
}
