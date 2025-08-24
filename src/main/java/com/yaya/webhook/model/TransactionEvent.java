package com.yaya.webhook.model;
public record TransactionEvent(
	    String id,
	    long amount,
	    String currency,
	    long created_at_time,
	    long timestamp,
	    String cause,
	    String full_name,
	    String account_name,
	    String invoice_url
	) {}