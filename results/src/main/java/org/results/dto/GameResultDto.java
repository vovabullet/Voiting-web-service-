package org.results.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameResultDto {
    private long id;
    private String name;
    private Integer voteCount;
}
