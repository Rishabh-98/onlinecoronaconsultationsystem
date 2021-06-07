/*
 * package com.coronaconsultation.controller;
 * 
 * import static org.junit.jupiter.api.Assertions.*; import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
 * 
 * import org.junit.jupiter.api.Test; import org.mockito.Mock; import
 * org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers;
 * 
 * import com.coronaconsultation.entities.Ward; import
 * com.coronaconsultation.service.IWardService; import
 * com.fasterxml.jackson.databind.ObjectMapper; import
 * com.coronaconsultation.controller.WardController; import
 * com.coronaconsultation.service.WardServiceImpl;
 * 
 * @WebMvcTest(WardController.class) class WardControllerTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * // LEARNING 1 :: DUMMY OBJECT :: MOCK OBJECT
 * 
 * @MockBean private IWardService wardservice;
 * 
 * @Test void findWardTest() throws Exception {
 * 
 * Ward e = new Ward(); e.setName("emergency"); e.setfloor(2);
 * 
 * Mockito.when(wardservice.findById(Mockito.anyInt())).thenReturn(e);
 * 
 * mockMvc.perform(get("/api/ward/1")).andExpect(MockMvcResultMatchers.status().
 * isOk())
 * .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("emergency")); }
 * 
 * @Test void createWardTest() throws Exception {
 * 
 * Ward e = new Ward(); e.setName("emergency"); e.setfloor(2);
 * 
 * Mockito.when(wardservice.createWard(Mockito.any())).thenReturn(true);
 * 
 * mockMvc.perform(post("/api/ward/").contentType(MediaType.APPLICATION_JSON)
 * .content(new ObjectMapper().writeValueAsString(e)))
 * .andExpect(MockMvcResultMatchers.status().isCreated())
 * .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("emergency")); }
 * 
 * }
 */