package com.sample.insurance;

import static org.junit.Assert.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sample.insurance.model.Pol_Category;
import com.sample.insurance.model.Policies;
import com.sample.insurance.model.QnA;
import com.sample.insurance.model.User_register;
import com.sample.insurance.model.Approval;
import com.sample.insurance.model.Disapproved_pol;
import com.sample.insurance.repository.ApprovalRepository;
import com.sample.insurance.repository.ApprovedPolRepository;
import com.sample.insurance.repository.DisapprovedPolRepository;
import com.sample.insurance.repository.PolCategoryRepository;
import com.sample.insurance.repository.PoliciesRepository;
import com.sample.insurance.repository.QnARepository;
import com.sample.insurance.repository.UserRegisterRepository;


@SpringBootTest
class InsuranceApplicationTests 
{
	@Autowired
	ApprovalRepository approvalsRepository;

	@Autowired
	private ApprovedPolRepository approvedRepository;

	@Autowired
	private DisapprovedPolRepository disapprovedRepository;

	@Autowired
	PolCategoryRepository categoryRepository;

	@Autowired
	private PoliciesRepository policiesRepository;

	@Autowired
	QnARepository queriesRepository;

	@Autowired
	UserRegisterRepository userRepository;

	@Test
	void addPolicy() 
	{
		Policies policies = new Policies();
		policies.setPolicyId(15);
		policies.setPolicyName("Max Life insurance");
		policies.setCategory("Life");
		policies.setAmount(2000.00);
		policies.setTenureInYears(6);
		policiesRepository.save(policies);
		assertNotNull(policiesRepository.findById(15).get());
	} 

	@Test
	public void addUser() {
		User_register user = new User_register();
		user.setUserid("6623HDUFG2022");
		user.setUserName("LoisGriffin");
		user.setMobile(888877775);
		user.setPassword("lois@123");
		user.setEmail("loisGriffin@gmail.com");
		userRepository.save(user);
		assertNotNull(userRepository.findById("LoisGriffin").get());
	}

	@Test
	public void addQueries() 
	{
		QnA queries = new QnA();
		queries.setUserName("PeterGriffin");
		queries.setQueryId(16);
		queries.setQuestion("Is there any other new policies??");
		queries.setAnswer("Yes! It will started to update after this december");
		queriesRepository.save(queries);
		assertNotNull(queriesRepository.findById("PeterGriffin").get());
	}

	@Test
	public void addCategory() 
	{
		Pol_Category policycategory = new Pol_Category();
		policycategory.setCategory("Life");
		categoryRepository.save(policycategory);
		assertNotNull(categoryRepository.findById("Life").get());
	}

	@Test
	public void addApprovels() 
	{
		Approval approvals = new Approval();
		approvals.setRequestId(8);
		approvals.setPolicyId(10);
		Date date = new Date();
		approvals.setDate(date);
		approvals.setStatus("pending");
		approvals.setUserName("PeterGriffin");
		approvalsRepository.save(approvals);
		assertNotNull(approvalsRepository.findById("PeterGriffin").get());
	}

	@Test
	public void addApproved() {
		com.sample.insurance.model.Approved_pol approved = new com.sample.insurance.model.Approved_pol();
		approved.setPolicyId(6);
		approved.setRequestId(6);
		Date date = new Date();
		approved.setDate(date);
		approved.setStatus("Success");
		approved.setUserName("PeterGriffin");
		approvedRepository.save(approved);
		assertNotNull(approvedRepository.findById("PeterGriffin").get());

	}

	@Test
	public void addisApproved() {
		Disapproved_pol disapproved = new Disapproved_pol();
		disapproved.setPolicyId(7);
		disapproved.setRequestId(3);
		Date date = new Date();
		disapproved.setDate(date);
		disapproved.setStatus("Success");
		disapproved.setUserName("peterGriffin");
		disapprovedRepository.save(disapproved);
		assertNotNull(disapprovedRepository.findById("peterGriffin").get());

	}

	@Test
	public void policies() 
	{
		List<Policies> list = policiesRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void user() {
		List<User_register> list = userRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void AllQueries() {
		List<QnA> list = queriesRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void categories() {
		List<Pol_Category> list = categoryRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void AllApprovals() {
		List<Approval> list = approvalsRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void AllDisapproved() {
		List<Disapproved_pol> list = disapprovedRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void AllApproved() {
		List<com.sample.insurance.model.Approved_pol> list = approvedRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void getPolicy() {
		Policies policies = policiesRepository.findById(13).get();
		assertEquals(1, policies.getTenureInYears());
	}

	@Test
	public void getUser() {
		User_register user = userRepository.findById("peterGriffin").get();
		assertEquals("peterGriffin", user.getUserName());
	}

	@Test
	public void Approval() {
		Approval approvals = approvalsRepository.findById("peterGriffin").get();
		assertEquals(8, approvals.getRequestId());
	}

	@Test
	public void getQuery() {
		QnA queries = queriesRepository.findById("peterGriffin").get();
		assertEquals("what", queries.getQuestion());
	}

	@Test
	public void category() 
	{
		Pol_Category category = categoryRepository.findById("Life").get();
		assertEquals("Life", category.getCategory());
	}

	@Test
	public void Approved() 
	{
		com.sample.insurance.model.Approved_pol approved = approvedRepository.findById("peterGriffin").get();
		assertEquals(6, approved.getPolicyId());
	}

	@Test
	public void Disapproved() {
		Disapproved_pol disapproved = disapprovedRepository.findById("peterGriffin").get();
		assertEquals(7, disapproved.getPolicyId());
	}

	@Test
	public void updatePolicy() 
	{
		Policies policies = policiesRepository.findById(12).get();
		policies.setPolicyName("Min Health insurance");
		policies.setCategory("Health");
		policies.setAmount(4000.00);
		policies.setTenureInYears(10);
		policiesRepository.save(policies);
		assertNotEquals(20.00, policiesRepository.findById(14).get().getAmount());
		assertNotEquals("Max life insurance1", policiesRepository.findById(14).get().getPolicyName());
		assertNotEquals("Bike", policiesRepository.findById(14).get().getCategory());
		assertNotEquals(5, policiesRepository.findById(14).get().getTenureInYears());
	}

	@Test
	public void updateUser() {
		User_register user = userRepository.findById("peterGriffin").get();
		user.setUserName("peterGriffin");
		user.setPassword("petergriffin1234");
		user.setMobile(888888888);
		user.setEmail("pater123@gmail.com");
		userRepository.save(user);
		assertEquals("peterGriffin", userRepository.findById("peterGriffin").get().getUserName());
		assertNotEquals(7563425678L, userRepository.findById("peterGriffin").get().getMobile());
		assertNotEquals("peterGriffin123", userRepository.findById("peterGriffin").get().getPassword());
		assertNotEquals("peterGriffin@gmail.com", userRepository.findById("peterGriffin").get().getPassword());
	}

	@Test
	public void updateQuery() {
		QnA queries = queriesRepository.findById("peterGriffin").get();
		queries.setQuestion("what");
		queries.setAnswer("hi");
		queriesRepository.save(queries);
		assertNotEquals("san", queriesRepository.findById("peterGriffin").get().getQuestion());
		assertNotEquals("ooo", queriesRepository.findById("peterGriffin").get().getAnswer());
	}

}
