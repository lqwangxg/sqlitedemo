package com.mbp.lqwangxg;

import com.mbp.lqwangxg.mapper.CompanyMapper;
import com.mbp.lqwangxg.model.Company;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SqliteApplicationTests {

	@Autowired
	private CompanyMapper companyMapper;

	@Test
	void contextLoads() {
		Company company = new Company();
		//company.setId(1);
		company.setName("lqwangxg");
		company.setAddress("nagoya");
		company.setAge(30);
		int count = companyMapper.insert(company);
		Assert.assertEquals(count,1);
		List<Company> companies = companyMapper.selectAll();
		Assert.assertEquals(companies.size(),1);
		//for (Company c: companies) Assert.assertEquals(java.util.Optional.ofNullable(c.getAge()), 30);
	}

}
