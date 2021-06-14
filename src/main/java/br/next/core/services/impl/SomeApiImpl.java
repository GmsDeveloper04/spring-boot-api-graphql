package br.next.core.services.impl;

import org.springframework.stereotype.Service;

import br.next.core.services.SomeApi;

@Service
public class SomeApiImpl implements SomeApi {

	@Override
	public String resquestApi(long await, String returnValue) {
		try {
			Thread.sleep(200l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return returnValue;
	}

}
