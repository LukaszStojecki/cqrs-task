package pl.stojeckilukasz.cqrstasklincor.query.service;

import lombok.AllArgsConstructor;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.stereotype.Service;
import pl.stojeckilukasz.cqrstasklincor.query.model.Item;
import pl.stojeckilukasz.cqrstasklincor.query.query.GetItemQuery;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
public class GetItemQueryService {

    private final QueryGateway queryGateway;

    public CompletableFuture<Item> findById(UUID itemId) {
        return queryGateway.query(
                new GetItemQuery(itemId),
                ResponseTypes.instanceOf(Item.class)
        );
    }
}
