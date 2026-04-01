package com.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.entities.Ticket;
import com.springrest.repositories.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository repo;
	
	public Ticket bookTicket(Ticket ticket) {
		return repo.save(ticket);
	}
	
	public Ticket getTicketById(Integer ticketId) {
		return repo.findById(ticketId).get();
	}
	public List<Ticket> getAllTickets(){
		return repo.findAll();
	}
	
	public Ticket updateTicket(Integer ticketId,String newEmail) {
		Ticket ticketFromdb = repo.findById(ticketId).get();
		ticketFromdb.setEmail(newEmail);
		Ticket updatedTicket = repo.save(ticketFromdb);
		return updatedTicket;
	}
	
	public void deleteTicket(Integer ticketId) {
		repo.deleteById(ticketId);
	}
	
}
