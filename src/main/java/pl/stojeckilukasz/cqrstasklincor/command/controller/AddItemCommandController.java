package pl.stojeckilukasz.cqrstasklincor.command.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.stojeckilukasz.cqrstasklincor.command.dto.AddItemCommand;
import pl.stojeckilukasz.cqrstasklincor.command.service.AddItemCommandService;
import pl.stojeckilukasz.cqrstasklincor.query.model.Item;

import java.util.concurrent.CompletableFuture;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@AllArgsConstructor
@RequestMapping("/items")
public class AddItemCommandController {

    private AddItemCommandService addItemCommandService;

    @PostMapping
    @ResponseStatus(value = CREATED)
    public CompletableFuture<Item> addItem(@RequestBody AddItemCommand addItemCommand) {
        return addItemCommandService.addItem(addItemCommand);
    }

}
