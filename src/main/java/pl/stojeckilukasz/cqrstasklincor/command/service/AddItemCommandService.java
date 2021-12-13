package pl.stojeckilukasz.cqrstasklincor.command.service;

import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;
import pl.stojeckilukasz.cqrstasklincor.command.dto.AddItemDTO;
import pl.stojeckilukasz.cqrstasklincor.command.commands.AddItemCommand;
import pl.stojeckilukasz.cqrstasklincor.query.model.Item;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
public class AddItemCommandService {

    private final CommandGateway commandGateway;

    public CompletableFuture<Item> addItem(AddItemDTO addItemDTO) {
        return commandGateway.send(new AddItemCommand(
                UUID.randomUUID(),
                addItemDTO.getName()
        ));
    }
}
