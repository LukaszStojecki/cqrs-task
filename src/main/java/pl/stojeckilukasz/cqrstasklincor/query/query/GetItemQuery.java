package pl.stojeckilukasz.cqrstasklincor.query.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetItemQuery {

    private UUID id;
}
