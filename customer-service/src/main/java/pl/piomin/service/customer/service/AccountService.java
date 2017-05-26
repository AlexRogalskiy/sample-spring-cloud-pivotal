package pl.piomin.service.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import pl.piomin.service.customer.contract.AccountClient;
import pl.piomin.service.customer.model.Account;

@Service
public class AccountService {

	@Autowired
	private AccountClient client;

	@HystrixCommand(fallbackMethod = "getEmptyList")
	public List<Account> getAccounts(Integer customerId) {
		return client.getAccounts(customerId);
	}

	List<Account> getEmptyList(Integer customerId) {
		return new ArrayList<>();
	}

}
