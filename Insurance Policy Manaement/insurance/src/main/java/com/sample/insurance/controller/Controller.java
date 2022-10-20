package com.sample.insurance.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.insurance.model.Admin_table;
import com.sample.insurance.model.Approval;
import com.sample.insurance.model.Approved_pol;
import com.sample.insurance.model.AuthS;
import com.sample.insurance.model.Disapproved_pol;
import com.sample.insurance.model.Pol_Category;
import com.sample.insurance.model.Policies;
import com.sample.insurance.model.QnA;
import com.sample.insurance.model.User_login;
import com.sample.insurance.model.User_register;
import com.sample.insurance.service.AdminService;
import com.sample.insurance.service.ApprovalService;
import com.sample.insurance.service.ApprovedPolService;
import com.sample.insurance.service.DisapprovedPolService;
import com.sample.insurance.service.PolCategoryService;
import com.sample.insurance.service.PoliciesService;
import com.sample.insurance.service.QnAService;
import com.sample.insurance.service.UserLoginService;
import com.sample.insurance.service.UserRegisterService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class Controller 
{
    @Autowired
	AdminService adminService;

	@Autowired
	private ApprovalService approvalsService;

	@Autowired
	private ApprovedPolService approvedService;

	@Autowired
	PolCategoryService categoryService;

	@Autowired
	private DisapprovedPolService disapprovedService;

	@Autowired
	UserLoginService loginService;

	@Autowired
	PoliciesService policiesService;

	@Autowired
	QnAService queriesService;

	@Autowired
	UserRegisterService userService;

	@PostMapping("/adminlogin")
	public ResponseEntity<AuthS> validateAdminLogin(@RequestBody Admin_table adminlogin) 
    {
		System.out.println(adminlogin.getUsername() + " " + adminlogin.getPassword());

		AuthS status = adminService.validateAdminLogin(adminlogin.getUsername(), adminlogin.getPassword());

		return new ResponseEntity<AuthS>(status, HttpStatus.OK);
	}

	@GetMapping("/approvals")
	public List<Approval> getAllApprovals() 
    {
		return approvalsService.getAllApprovals();
	}

	@GetMapping("/approvals/{userName}")
	public Optional<Approval> getApproval(@PathVariable("userName") String userName) 
    {
		return approvalsService.getApprovals(userName);
	}

	@PostMapping("/approvals")
	public String addApprovals(@RequestBody Approval approval) 
    {
		approvalsService.addApproval(approval);
		return "added";
	}

	@GetMapping("/approved")
	public List<Approved_pol> getAllApproved() 
    {
		return approvedService.getAllApproved();
	}

	@GetMapping("/approved/{userName}")
	public Optional<Approved_pol> getApproved(@PathVariable("userName") String userName) 
    {
		return approvedService.getApproved(userName);
	}

	@PostMapping("/approved")
	public String addApproved(@RequestBody Approved_pol approved) 
    {
		approvedService.addApproved(approved);
		return "added";
	}

	@GetMapping("/categories")
	public List<Pol_Category> getInsuranceCategory() 
    {
		List<Pol_Category> list = categoryService.fetchCategory();
		return list;
	}

	@GetMapping("/category/{category}")
	public ResponseEntity<Pol_Category> getCategoryById(@PathVariable("category") String category) 
    {
		Pol_Category iCategory = categoryService.getCategory(category);
		return ResponseEntity.ok().body(iCategory);
	}

	@PostMapping("/category")
	public String addInsuranceCategory(@RequestBody Pol_Category category) 
    {
		categoryService.SaveCategory(category);
		return "saved";
	}

	@DeleteMapping(value = "/category/{category}")
	public ResponseEntity<Object> deleteCategory(@PathVariable("category") String category) 
    {
		categoryService.deleteCategory(category);
		return new ResponseEntity<>("Insurance category deleted successfully", HttpStatus.OK);
	}

	@GetMapping("/disapproved")
	public List<Disapproved_pol> getAllDisapproved() 
    {
		return disapprovedService.getAllDisapproved();
	}

	@GetMapping("/disapproved/{userName}")
	public Optional<Disapproved_pol> getDisapproved(@PathVariable("userName") String userName) 
    {
		return disapprovedService.getDisapproved(userName);
	}

	@PostMapping("/disapproved")
	public String addDisapproved(@RequestBody Disapproved_pol disapproved) 
    {
		disapprovedService.addDisapproved(disapproved);
		return "added";
	}

	@GetMapping("/policies")
	public List<Policies> getPolicies() 
    {
		List<Policies> list = policiesService.fetchPolicies();
		return list;
	}

	@GetMapping("/policy/{PolicyId}")
	public ResponseEntity<Policies> getPolicyById(@PathVariable("policyId") int policyId) 
    {
		Policies policy = policiesService.getPolicy(policyId);
		return ResponseEntity.ok().body(policy);
	}

	@PostMapping("/policy")
	public Policies addpolicy(@RequestBody Policies policies) 
    {
		policiesService.savePolicy(policies);
		return policies;
	}

	/*@PutMapping("/policy/{id}")
	public ResponseEntity<Policies> updatePolicy(@PathVariable("id") int policyId, @RequestBody Policies policydategoryDetails) 
    {
		Policies policy = policiesService.getPolicy(policyId);

		policy.setPolicyName(policydategoryDetails.getPolicyName());
		policy.setCategory(policydategoryDetails.getCategory());
		policy.setAmount(policydategoryDetails.getAmount());
		policy.setTenureInYears(policydategoryDetails.getTenureInYears());

		final Policies updatedPolicy = policiesService.savePolicy(policy);
		return ResponseEntity.ok(updatedPolicy);
	}*/

	/*@DeleteMapping(value = "/policy/{policyId}")
	public ResponseEntity<Object> deletePolicy(@PathVariable("policyId") int policyId) 
    {
		policiesService.deletePolicy(policyId);
		return new ResponseEntity<>("policy deleted successsfully", HttpStatus.OK);
	}*/

	@PostMapping(value = "/policy/{policyId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String savePolicyy(@RequestBody Policies policies)
	{
		return policiesService.savePolicy(policies);
	}

	@DeleteMapping("/policy/{policyId}")
	public String deletePolicy(@PathVariable("policyId") int policyId)
	{
		return policiesService.deletePolicy(policyId);
	}

	@GetMapping("/query")
	public List<QnA> getQueries() 
    {
		List<QnA> list = queriesService.fetchQueries();
		return list;
	}

	@GetMapping("/query/{userName}")
	public ResponseEntity<QnA> getQueriesById(@PathVariable("userName") String userName) 
    {
		QnA queries = queriesService.getQuery(userName);
		return ResponseEntity.ok().body(queries);
	}

	@PostMapping("/query")
	public QnA addQueries(@RequestBody QnA queries) 
    {
		queries = queriesService.saveQuery(queries);
		return queries;
	}

	@PutMapping("/query/{userName}")
	public ResponseEntity<QnA> updateQueries(@PathVariable("userName") String userName, @RequestBody QnA queries) 
    {
		QnA queries1 = queriesService.getQuery(userName);
		queries1.setQuestion(queries.getQuestion());
		queries1.setAnswer(queries.getAnswer());

		final QnA updatedQueries = queriesService.saveQuery(queries1);
		return ResponseEntity.ok(updatedQueries);
	}

	@DeleteMapping(value = "/query/{userName}")
	public ResponseEntity<Object> deleteQueries(@PathVariable("userName") String userName) 
    {
		queriesService.deleteQuery(userName);
		return new ResponseEntity<>("Query deleted successfully", HttpStatus.OK);
	}

	@GetMapping("/users")
	public List<User_register> getUsers() 
    {
		List<User_register> userList = userService.fetchUser();
		return userList;
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<User_register> getUserById(@PathVariable("userId") String userId) 
    {
		User_register user = userService.getUser(userId);
		return ResponseEntity.ok().body(user);
	}

	@PostMapping("/user")
	public User_register addUser(@Validated @RequestBody User_register user) 
    {
		user = userService.saveUser(user);
		return user;
	}

	@PutMapping("/user/{userName}")
	public ResponseEntity<User_register> updateUser(@PathVariable("userName") String userName, @RequestBody User_register userDetails) 
    {
		User_register user = userService.getUser(userName);
		user.setEmail(userDetails.getEmail());
		user.setMobile(userDetails.getMobile());
		user.setPassword(userDetails.getPassword());
		user.setUserid(userDetails.getUserid());
		final User_register updatedUser = userService.updateUser(user);
		return ResponseEntity.ok(updatedUser);
	}

	/*@PutMapping("/updaPol/{policyId}")
	public ResponseEntity<Policies> updatePolicy(@PathVariable("policyId") Integer PolicyId, @RequestBody Policies PolDetails)
	{
		Policies pol = policiesService.getPolicy(PolicyId);
		pol.setPolicyName(PolDetails.getPolicyName());
		pol.setAmount(PolDetails.getAmount());
		pol.setTenureInYears(PolDetails.getTenureInYears());
		pol.setCategory(PolDetails.getCategory());
		final Policies policis = policiesService.updatePolicy(pol);
		return ResponseEntity.ok(policis);
	}*/

	@PatchMapping("/updaPol/{policyId}")
	public String updatePolicy(@RequestBody Policies polic)
	{
		return policiesService.updatePolicyy(polic);
	}

	@DeleteMapping(value = "/user/{userId}")
	public ResponseEntity<Object> deleteUser(@PathVariable("userid") String userId) 
    {
		userService.deleteUser(userId);
		return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
	}


	@PostMapping("/login")
	public ResponseEntity<AuthS> validateLogin(@RequestBody User_login login, HttpServletRequest request) 
    {
		AuthS status = loginService.validateLogin(login.getUserName(), login.getPassword());
		if (status.getUserName() != null && status.getPassword() != null && status.isAuthenticated() == true) {
			request.getSession().setAttribute("userName", status.getUserName());
		}
		return new ResponseEntity<AuthS>(status, HttpStatus.OK);
	}

	@GetMapping("/logout")
	public void Logout(HttpServletRequest request) 
    {
		System.out.println("logged out");
		request.getSession().invalidate();
	}

	@DeleteMapping("/approvals/{userName}")
	public void deleteApproval(@PathVariable("userName") String userName) 
    {
		approvalsService.deleteApproval(userName);
	}

	@SuppressWarnings({ "unchecked", "null" })
	@GetMapping("/userpolicies")
	public List<Approved_pol> getAllUserpolicies() 
    {
		@SuppressWarnings("rawtypes")
		List list = null;
		list.add(approvedService.getAllApproved());
		list.add(disapprovedService.getAllDisapproved());
		return list;
	}
}
