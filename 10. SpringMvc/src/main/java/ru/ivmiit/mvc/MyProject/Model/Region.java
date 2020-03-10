package ru.ivmiit.mvc.MyProject.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Region {
    private Long id;
    private int AbsValue;
    private double HunKValue;
    private Area area;
}
