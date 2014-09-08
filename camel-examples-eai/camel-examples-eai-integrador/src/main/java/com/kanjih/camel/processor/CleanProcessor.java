package com.kanjih.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kanjih.camel.ws.Animais;

public class CleanProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody(new Object[0]);		
		
	}

}
