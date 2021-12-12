package pl.stojeckilukasz.cqrstasklincor.command.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class AddItemCommand {

    @TargetAggregateIdentifier
    private UUID id;
    private String name;
}
