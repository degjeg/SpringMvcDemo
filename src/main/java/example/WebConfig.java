package example;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;

/**
 * Created by Administrator on 2017-11-09.
 */
//@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final Charset UTF8 = Charset.forName("UTF-8");

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
       final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        JsonObjectMapper mapper = new JsonObjectMapper();
//        converter.setObjectMapper(mapper);
//        List<MediaType> mediaTypes = new ArrayList<MediaType>();
//        mediaTypes.add(MediaType.TEXT_HTML);
//        mediaTypes.add(MediaType.TEXT_PLAIN);
//        mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        converter.setSupportedMediaTypes(mediaTypes);
//        return converter;
//    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON_UTF8);
    }
}