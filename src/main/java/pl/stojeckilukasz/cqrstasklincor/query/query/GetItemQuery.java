package pl.stojeckilukasz.cqrstasklincor.query.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetItemQuery {

    private UUID id;
}
