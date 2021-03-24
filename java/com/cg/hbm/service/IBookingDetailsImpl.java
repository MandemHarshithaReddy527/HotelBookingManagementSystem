package com.cg.hbm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.dto.BookingDetails;
import com.cg.hbm.dto.Hotel;
import com.cg.hbm.repository.IBookingDetailsRepository;

@Service
public class IBookingDetailsImpl implements IBookingDetailsService {
	@Autowired
	IBookingDetailsRepository brepository;
	@Override
	public BookingDetails addBookingDetails(BookingDetails bookingdetails) {
		// TODO Auto-generated method stub
		brepository.save(bookingdetails);
		return bookingdetails;
	}

	@Override
	public BookingDetails updateBookingDetails(BookingDetails bookingdetails) {
		// TODO Auto-generated method stub
		brepository.save(bookingdetails);
		return bookingdetails;
	}

	@Override
	public List<BookingDetails> showAllBookingDetails() {
		// TODO Auto-generated method stub
		return brepository.findAll();
	}

	@Override
	public BookingDetails showBookingDetails(int id) {
		// TODO Auto-generated method stub
		if(brepository.findById(id).isPresent()) {
			return brepository.findById(id).get();
		}
		else {
			return null;
		}
	}

	@Override
	public BookingDetails removeBookingDetails(int id) {
		// TODO Auto-generated method stub
		//return brepository.deleteById(id);
		Optional<BookingDetails>op=brepository.findById(id);
		if(op.isPresent()) {
			BookingDetails obj=op.get();
			brepository.deleteById(id);
			return null;
		}
		return null;
		
	}

}
