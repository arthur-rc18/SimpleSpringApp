package test2.springbootweb;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntController {

    @Autowired
    private MockMvc mvc;

    @Test
    private void testInt() throws Exception{

        RequestBuilder request = get("/test");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Welcome, Test", result.getResponse().getContentAsString());
    }

    @Test
    public void testArgs() throws Exception{
        mvc.perform(get("/test?name=Arthur")).
                andExpect((ResultMatcher) content().string("Welcome, Arthur"));
    }
}
