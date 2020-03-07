package com.mbp.lqwangxg;

import com.mbp.lqwangxg.mapper.CompanyMapper;
import com.mbp.lqwangxg.model.Company;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;


@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
public class SqliteApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private CompanyMapper companyMapper;

	@BeforeAll
	public static void testBeforeClass() {
		log.info("before class init.===============");
	}
	@AfterAll
	public static void testAfterClass() {
		log.info("after class end===============");
	}

	@BeforeEach
	public void testBefore() {
		log.info("before===============");
	}

	@AfterEach
	public void testAfter() {
		log.info("after===============");
	}

	/*@Test
	void contextLoads() {
		Company company = new Company();
		company.setId("100001");
		company.setName("lqwangxg");
		company.setAddress("nagoya");
		company.setAge(30);
		int count = companyMapper.insert(company);
		Assertions.assertEquals(count,1);
		List<Company> companies = companyMapper.selectAll();
		Assertions.assertEquals(companies.size(),1);
	}*/

	@DisplayName("ホームページ初期表示")
	@Test
	public void getUser() throws Exception {
		RequestBuilder req = MockMvcRequestBuilders.get("/");
		MvcResult result = mockMvc.perform(req).andReturn();
		int httpStatus = result.getResponse().getStatus();
		String content = result.getResponse().getContentAsString();
		log.info("Response: HttpStatus={},content={}", httpStatus, content);
		Assertions.assertEquals(httpStatus, HttpStatus.OK.value());
	}
}
