//package com.company.consumer;
//
//import lombok.val;
//import org.assertj.core.api.BDDAssertions;
//import org.junit.Rule;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
//import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
//import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
//import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.UUID;
//
//@SpringBootTest(classes = ConsumerApplication.class)
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@AutoConfigureStubRunner(ids = "com.company:producer:+:stubs:8080")
//class ConsumerApplicationAutoStubRunnerTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void shouldComfirmWhenCorrectPerson() throws Exception{
//
//		 mockMvc.perform(
//				MockMvcRequestBuilders.get("/employee/1")
//		).andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
//				.andReturn();
//	}
//
//}
//package com.company.consumer;
//
//import lombok.val;
//import org.assertj.core.api.BDDAssertions;
//import org.junit.Rule;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
//import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
//import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
//import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.UUID;
//
//@SpringBootTest(classes = ConsumerApplication.class)
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@AutoConfigureStubRunner(ids = "com.company:producer:+:stubs:8080")
//class ConsumerApplicationAutoStubRunnerTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void shouldComfirmWhenCorrectPerson() throws Exception{
//
//		 mockMvc.perform(
//				MockMvcRequestBuilders.get("/employee/1")
//		).andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
//				.andReturn();
//	}
//
//}
