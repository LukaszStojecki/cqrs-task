package pl.stojeckilukasz.cqrstasklincor.command.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.stojeckilukasz.cqrstasklincor.command.dto.AddItemDTO;
import pl.stojeckilukasz.cqrstasklincor.command.service.AddItemCommandService;
import pl.stojeckilukasz.cqrstasklincor.query.model.Item;

import java.util.concurrent.CompletableFuture;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@AllArgsConstructor
@RequestMapping(value ="/items")
public class AddItemCommandController {

    private final AddItemCommandService addItemCommandService;

    @PostMapping
    @ResponseStatus(value = CREATED)
    public CompletableFuture<Item> addItem(@RequestBody AddItemDTO addItemDTO) {
        return addItemCommandService.addItem(addItemDTO);
    }

}
