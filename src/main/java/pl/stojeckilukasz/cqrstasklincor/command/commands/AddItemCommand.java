package pl.stojeckilukasz.cqrstasklincor.command.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddItemCommand {

    @TargetAggregateIdentifier
    private UUID id;
    private String name;
}
