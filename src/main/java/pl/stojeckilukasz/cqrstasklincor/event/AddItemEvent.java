package pl.stojeckilukasz.cqrstasklincor.event;

import lombok.Data;

import java.util.UUID;


@Data
public class AddItemEvent {

    private final UUID id;
    private final String name;
}
