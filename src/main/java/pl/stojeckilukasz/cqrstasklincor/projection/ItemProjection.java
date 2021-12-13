package pl.stojeckilukasz.cqrstasklincor.projection;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;
import pl.stojeckilukasz.cqrstasklincor.event.AddItemEvent;
import pl.stojeckilukasz.cqrstasklincor.query.model.Item;
import pl.stojeckilukasz.cqrstasklincor.query.query.GetItemQuery;
import pl.stojeckilukasz.cqrstasklincor.query.repository.ItemRepository;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Component
public class ItemProjection {

    private final ItemRepository itemRepository;

    @EventHandler
    public void on(AddItemEvent addItemEvent) {
        log.debug("Handling a Add Item command {}", addItemEvent.getId());
        Item item = new Item(
                addItemEvent.getId(),
                addItemEvent.getName()
        );
        itemRepository.save(item);
    }

    @QueryHandler
    public Optional<Item> handle(GetItemQuery query) {
        log.debug("Handling GetItemQuery query: {}", query);
        return itemRepository.findById(query.getId());
    }


}
