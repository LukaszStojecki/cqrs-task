package pl.stojeckilukasz.cqrstasklincor.command.aggregate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import pl.stojeckilukasz.cqrstasklincor.command.commands.AddItemCommand;
import pl.stojeckilukasz.cqrstasklincor.event.AddItemEvent;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Aggregate
@Slf4j
public class ItemAggregate {

    @AggregateIdentifier
    private UUID id;
    private String name;

    @CommandHandler
    public ItemAggregate(AddItemCommand addItemCommand) {
        log.info("AddItemCommand received of id {}", addItemCommand.getId());
        AggregateLifecycle.apply(new AddItemEvent(
                addItemCommand.getId(), addItemCommand.getName()));
    }

    @EventSourcingHandler
    public void on(AddItemEvent addItemEvent) {
        log.info("An AddItemEvent occurred of id {}", addItemEvent.getId());
        this.id = addItemEvent.getId();
        this.name = addItemEvent.getName();
    }

}
