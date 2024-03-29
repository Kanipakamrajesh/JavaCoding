package com.afterdark.afterdarkdatamanagement.dao;

import com.afterdark.afterdarkdatamanagement.dto.*;

public interface VisitorDAO 
{
	Visitor saveVisitor(Visitor visitor);
	
	Visitor getVisitorById(int id);
	
	Visitor getVisitorByEmail(String Email);
	
	Visitor getVisitorByContactNO(String contactNO);
	
	Visitor getVisitorByIdProof(String idProofNumber);
	
	//List<Visitor>
	
	//Visitor updateVisitor(Visitor visitor);
	
	
}
