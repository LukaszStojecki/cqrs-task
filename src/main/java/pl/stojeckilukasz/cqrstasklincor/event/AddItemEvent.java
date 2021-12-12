package pl.stojeckilukasz.cqrstasklincor.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AddItemEvent {

    private UUID id;
    private String name;
}
