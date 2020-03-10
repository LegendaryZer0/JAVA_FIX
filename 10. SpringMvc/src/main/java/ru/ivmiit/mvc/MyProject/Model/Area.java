package ru.ivmiit.mvc.MyProject.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Area {
    private Long id;

    //Федеральный округ
    private List<Region> listReg;
    private String name;
    private int age;
}
