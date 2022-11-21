package com.eroldmr.tt.task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;   

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Task {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String text;
    private String day;
    private boolean reminder;
}
