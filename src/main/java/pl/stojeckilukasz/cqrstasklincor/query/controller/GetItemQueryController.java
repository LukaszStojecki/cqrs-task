package pl.stojeckilukasz.cqrstasklincor.query.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.stojeckilukasz.cqrstasklincor.query.model.Item;
import pl.stojeckilukasz.cqrstasklincor.query.service.GetItemQueryService;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
@RequestMapping("/items")
public class GetItemQueryController {

    private final GetItemQueryService queryService;

    @GetMapping("/{ID-GUID}")
    public CompletableFuture<Item> getItem(@PathVariable("ID-GUID") UUID itemID) {
        return queryService.findById(itemID);
    }
}
