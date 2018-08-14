package com.borrisstar.paysystem.rest.controllers;

import com.borrisstar.paysystem.domain.PayInvoice;
import com.borrisstar.paysystem.dto.CreateInvoiceDto;
import com.borrisstar.paysystem.dto.CreateUserDto;
import com.borrisstar.paysystem.dto.PayInvoiceDto;
import com.borrisstar.paysystem.dto.UserDto;
import com.borrisstar.paysystem.service.PayInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Возвращать и принимать только DTO
 */
@RestController
@RequestMapping(path = "invoice")
public class PayInvoiceController {
	@Autowired
	PayInvoiceService payInvoiceService;



		@GetMapping(path = "{uid}")
	public PayInvoiceDto getInvoice(@PathVariable String uid ) {

		return payInvoiceService.getInvoice(uid);
	}



	@PostMapping()
	public PayInvoiceDto addInvoice(@RequestBody CreateInvoiceDto createInvoiceDto){
			return payInvoiceService.create(createInvoiceDto);
	}
}
