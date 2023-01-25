package ca.sheridancollege.gollej.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Player {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;
    @NonNull
    private String name;
    @NonNull
    private Integer kills;
    @NonNull
    private Integer deaths;
    @NonNull
    private Integer matches;
    @NonNull
    private Integer points;

}
