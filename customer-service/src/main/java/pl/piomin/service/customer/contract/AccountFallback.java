package pl.piomin.service.customer.contract;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.piomin.service.customer.model.Account;

@Component
public class AccountFallback implements AccountClient {

	@Override
	public List<Account> getAccounts(Integer customerId) {
		List<Account> acc = new ArrayList<Account>();
		return acc;
	}
	
}
