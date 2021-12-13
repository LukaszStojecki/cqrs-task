package pl.stojeckilukasz.cqrstasklincor.config;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;
import org.axonframework.serialization.Serializer;
import org.axonframework.serialization.json.JacksonSerializer;
import org.axonframework.serialization.xml.XStreamSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AxonConfig {

    @Bean
    public XStream xstream() {
        XStream xstream = new XStream();
        xstream.addPermission(NoTypePermission.NONE);
        xstream.allowTypesByWildcard(new String[]{
                "pl.stojeckilukasz.**",
                "org.axonframework.**",
                "java.**",
                "com.thoughtworks.xstream.**"
        });

        return xstream;
    }

    @Bean
    @Primary
    public Serializer serializer(XStream xStream) {
        return XStreamSerializer.builder().xStream(xStream).build();
    }
}
